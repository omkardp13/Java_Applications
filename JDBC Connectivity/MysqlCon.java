import java.sql.*;  
class MysqlCon
{  
   public static void main(String args[])
   {  
     try
     {  
        Class.forName("com.mysql.cj.jdbc.Driver");  

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa26","root","12345");  
        //here ppa26 is database name, root is username and password is 12345 
        
        Statement stmt=con.createStatement();  
        
        ResultSet rs=stmt.executeQuery("select * from student where City='Pune'");  

        while(rs.next())
        {  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));  
        }
        con.close();  
      
      }
      catch(Exception e)
      { 
        System.out.println(e);
      }  
   }  
}  
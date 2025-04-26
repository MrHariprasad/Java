import java.util.*;
import java.sql.*;
class JdbcDemo5{
public static void main(String[] args) throws Exception
{
System.out.println("Enter the data");
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String name=sc.next();
//Step-1:loading driver
Class.forName("com.mysql.jdbc.Driver");
//step-2:providing connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","123456");
//step-3:using stmts
PreparedStatement st=con.prepareStatement("insert into table12345 values (?,?)");
//step-4:processing query
st.setInt(1,id);
st.setString(2,name);
st.executeUpdate();
System.out.println("Record inserted");
//step-6:closing all oblects
st.close();
con.close();
}
}

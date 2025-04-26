import java.sql.*;
class JdbcDemo1{
public static void main(String[] args) throws Exception
{
//Step-1:loading driver
class.forName("com.mysql.jdbc.Driver");
//step-2:providing connection
Connection con=DriverManager.getConnection("jdbc:mysql:thin:@localhost:3306/mydb",
//step-3:using stmts
Statement st=con.createstatement();
//step-4:processing query
st.executeUpdate("insert into table12345 values (112,"Ravi")");
System.out.println("Record inserted")


//step-6:closing all oblects
st.close();

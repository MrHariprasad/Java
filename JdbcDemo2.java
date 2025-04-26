import java.sql.*;
class JdbcDemo2{
public static void main(String[] args) throws Exception
{
//Step-1:loading driver
class.forName("oracle.jdbc.driver.OracleDriver");
//step-2:providing connection
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost
//step-3:using stmts
Statement st=con.createstatement();
//step-5:retiriving the data
ResultSet rs=st.executeQuery("select * from table1234");
while(re.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
}

//step-6:closing all oblects
st.close();
con.close();
}
}

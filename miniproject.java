import java.util.Scanner;
class miniproject
{
	public static void main(String[] args)
		{
			String username="cse@gmail.com";
			String password="cse123";
			String dbusername;
			String dbpassword;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your dbname");
			dbusername=sc.next();
			System.out.println("Enter your dbpassword");
			dbpassword=sc.next();
			if(username.equals(dbusername)&& password.equals(dbpassword)){
				System.out.println("Valid");
				}
			else{
				System.out.println("Invalid");}
	}
}  
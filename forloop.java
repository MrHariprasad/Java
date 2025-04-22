public class forloop{
public static void main(String[] args){
for (int  year=1825;year<=2025;year++)
	{
if(((year%4==0)&&(year%100!=0))||(year%400==0))
	{
System.out.println(year+":is leap year");
	}
else	{
System.out.println(year+":is not leap year");
	}
	}
}
}
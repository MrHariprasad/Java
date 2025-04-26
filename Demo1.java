//Inheritance

interface I1
{
int a=99;
}
interface I2
{
int b=67;
}
class Demo1 implements I1,I2
{
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		System.out.println("sum="+c);
	}
}
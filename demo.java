class Test2
{
	int a=10;
}
class Test extends Test2
{
void show()
	{
		System.out.println("Smile");
	}
}


class Demo
{
	public static void main(String[] args)
	{
		System.out.println("Demo Program");
		Test t=new Test();
		t.show();
	}
}
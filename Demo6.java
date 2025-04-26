/*Method Overriding*/
class Test3{
	void show()
	{
		System.out.println("Parent class");
	}
}
class Test4 extends Test3{

	void show()
	{
		super.show();
		System.out.println("chlid class");
	}
	
}

class Demo6
{
public static void main(String[] args)
	{
		Test4 t=new Test4();
		t.show();
	}
}
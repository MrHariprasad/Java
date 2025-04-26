//overloading
class Test2{
	void shape(int a)
	{
		System.out.println("Triangle");
	}
	void shape(float b)
	{
		System.out.println("Rectangle");
	}
	void shape(char c)
	{
		System.out.println("Triangle");
	}
}

class Demo5
{
public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.shape(10);
		t.shape(12.3f);
		t.shape(1351);
	}
}
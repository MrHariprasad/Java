class Demo8
{
	public static void main(String args[]) throws Exception
	{
		try
		   {
			int a[]=new int[-8]; 
		   }
		catch (Exception e)
			{
				System.out.println("Nase");
			}
		finally
			{
				System.out.print("Whether you study or not finally");
			}
	}
}
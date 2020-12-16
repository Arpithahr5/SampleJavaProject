package Saample;

public class demo1 {

	public static void main(String[] s) {
		
		int a= new demo1().test();
		System.out.println();
		System.out.println(add(18,3));
	} 
	private static char[] add(int i, int j) {
		// TODO Auto-generated method stub
		try
		{int x= i+j;
		System.out.println(i);
		return x;
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	public int test()
	{
		int i=0;
		try
		{
			 i=100/0;
			return i;
		}catch(Exception e)
		{
			i=200/0;
			return i;
		}finally 
		{
			i=300;
			
		}
	}
	public static int som()
	{try
	{throw new ClassNotFoundException();}
		catch (Exception e)
	{
			throw new NullPointerException();
	}
	}
	
	}



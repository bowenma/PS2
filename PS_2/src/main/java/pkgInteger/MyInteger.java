package pkgInteger;

public class MyInteger 
{
	public int iValue;
	public MyInteger(int iValue) 
	{
		   this.iValue = iValue;
		}
	public int getiValue()
	{
		return iValue;
	}
	public boolean isOdd()
	{
		if (iValue % 2 == 1)
			return true;
		 else 
			return false;
	}
	
	
	public boolean isEven()
	{
		if (iValue % 2 == 0)
			return true;
		 else 
			return false;			
	}
	
	public boolean isPrime()
	{
		int D=2;
		for (D=2;D<=iValue/2;D++) 
		{
			if (iValue%D==0) 
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int x) 
	{
		return (x % 2 == 0) ;
	}
	public static boolean isOdd(int y) 
	{
		return (y % 2 == 1) ;
	}
	public static boolean isPrime(int z) 
	{
		int y=2;
		for (y=2;y<=z/2;y++) 
		{
			if (z%y==0) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger x) 
	{	
		return x.isEven();
	}
	
	public static boolean isOdd(MyInteger x) 
	{
		return x.isOdd();
	}

	public static boolean isPrime(MyInteger x) 
	{
		return x.isPrime();
	}
	
	public boolean equals(int x)
	{	
		return (iValue==x);
	}
	public boolean equals(MyInteger x)
	{
		return x.equals(iValue);
	}
}

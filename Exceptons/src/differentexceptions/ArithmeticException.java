package differentexceptions;

public class ArithmeticException
{
	  public float divide(int x, int y)
	  {
		  return x/y;
	  }
	  public static void main(String[] args) 
	  {
		  ArithmeticException ex=new ArithmeticException();
				  System.out.println(ex.divide(20, 10));
		          //  System.out.println(ex.divide(20, 0));

	  }
	/* public float divide(int x, int y)
	  {
		try
		{
		  return x/y;
	    }
		  catch(ArithmeticException ex)
		  {
			System.out.println("provide both values");
			return 0;
		  }
	  }
	      public static void main(String[] args) 
	  {
		  ArithmeticException ex=new ArithmeticException();
		System.out.println(ex.divide(20, 0));
	  }*/
}
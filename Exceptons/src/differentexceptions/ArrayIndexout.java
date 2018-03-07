package differentexceptions;

public class ArrayIndexout 
{
  
private static ArrayIndexout ex;
public void display(int A[])
  {
	  System.out.println(A[1]);
  }
  public static void main(String[] args) 
  {
	int A[]= {10,20,30,40,50};
	ex.display(A);
  }
}

package fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(Fibonacci1(3));
	}
	public static int Fibonacci1(int n) {
          if(n==1||n==2)
	           return 1;
          else if(n<=0||n>39)
              return 0;
	        else
             return Fibonacci1(n-2)+Fibonacci1(n-1);
		
	}
}

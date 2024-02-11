package demo.sl;

public class MyClass {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) {		
		MyClass ob = new MyClass();
		System.out.println("Sum is : "+ob.sum(20, 10));
		System.out.println("Difference is : "+ob.sub(20, 10));
		System.out.println("Multiply is : "+ob.mul(20, 10));
		System.out.println("Division is : "+ob.div(20, 10));
	}
}

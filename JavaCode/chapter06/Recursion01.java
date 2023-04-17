public class Recursion01{
	public static void main(String[] args){
		T t1 = new T();
		t1.test(20);
		System.out.println(t1.factorial(4));
		System.out.println(t1.fibonacci(6));
	}
}

class T{
	public void test(int n){
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	//½×³Ë factorial
	public int factorial(int n){
		if(n == 1)return 1;
		return factorial(n - 1) * n;
	}

	//ì³²¨ÄÇÆõÊýÁÐ fibonacci
	public int fibonacci(int n){
		if (n == 2 || n == 1)return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
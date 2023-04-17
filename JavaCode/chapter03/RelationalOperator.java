public class RelationalOperator{
	public static void main(String[] args){
		int a = 9; //老韩提示: 开发中，不可以使用 a, b,m1……这种简单的命名，老板会对你失望
		int b = 8;
		System.out.println(a > b); //T
		System.out.println(a >= b); //T
		System.out.println(a <= b); //F
		System.out.println(a < b);//F
		System.out.println(a == b); //F
		System.out.println(a != b); //T
		boolean flag = a > b; //T
		System.out.println("flag=" + flag);
	}
}
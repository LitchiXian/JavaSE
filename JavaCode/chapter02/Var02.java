public class Var02{
	public static void main(String[] args){
		System.out.println(100 + 98);//198
		System.out.println("100" + 98);//10098(String)
		//加法运算从左到右
		System.out.println(100 + 3 + "Hello");//103Hello
		System.out.println("Hello" + 100 + 3);//Hello1003
	}
}
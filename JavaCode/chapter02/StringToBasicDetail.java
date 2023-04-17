public class StringToBasicDetail{
	public static void main(String[] args){
		String s = "hello";
		int i = Integer.parseInt(s);//编译不会有事，运行时会报异常
		System.out.println(i);
	}
}
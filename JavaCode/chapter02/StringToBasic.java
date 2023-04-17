public class StringToBasic{
	public static void main(String[] args){
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		double num4 = Integer.parseInt(s5);
		boolean num5 = Boolean.parseBoolean("true");

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		//怎么把字符串转成字符 char -->含义是：把字符串的第一个字符得到
		System.out.println(s5.charAt(0));//用的的是这个
		// System.out.println(Char.parseChar(s5));//没有这个方法
	}
}
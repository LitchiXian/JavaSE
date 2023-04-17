public class ArithmeticOperator{
	public static void main(String[] args){
		// *（乘）  /（除） 的时候，注意是什么类型，int 还是 double
		System.out.println(10 / 4);//从数学角度是2.5，但是左右两边都是整数型，所以=2
		System.out.println(10 / 4.0);//2.5

		double d = 10 / 4;
		System.out.println(d);//也是一样的，右边的运算都是整型，但注意结果赋值给double，所以=2.0

		//  % (取模，取余)
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//2//错了，是-1
		System.out.println(10 % -3);//2//错了，是1
		System.out.println(-10 % -3);//2//错了，是-1
		//在 % 的本质 看成一个公式 a % b = a - a / b * b
		//-10 % 3 = -10 - (-10) / 3 * 3 = -10 + 9 = -1
		//10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		//-10 % -3 = -10 - (-10) / (-3) * (-3) = -10 + 9 = -1
		
		int j1 = 8;
		int j2 = 8;
		int k1 = ++j1;//等价 j1 = j1 + 1; k1 = j1;
		int k2 = j2++;//等价 k2 = j2; j2 = j2 + 1;

		System.out.println(j1);//9
		System.out.println(j2);//9
		System.out.println(k1);//9
		System.out.println(k2);//8
	}
}
public class ForExercise {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.
		//[化繁为简,先死后活]
		//化繁为简：即将复杂的需求，拆解成简单的需求，逐步完成 编程 = 思想 --练习-> 代码
		//先死后活 : 先考虑固定的值，然后转成可以灵活变化的值
		//思路分析
		//1.for循环打印 1~100 之间所有是 9 的倍数的整数
		//2.定义一个变量 统计个数 int number，一个变量计算总和int sum
		//3.打印输出
		//走代码
		
		//先死后活(这个是后面写的)
		int divisor = 9;
		int start = 10, end = 200;
		//化繁为简
		int number = 0, sum = 0;
		for (int i = start; i <= end; ++i) {
			if (i % divisor == 0) {
				System.out.print(i + "\t");
				++number;
				sum += i;
			}
		}
		System.out.println();
		System.out.println(start + " ~ " + end + " 之间 总共有 " + number + " 个 " + divisor + " 的倍数的整数，它们的总和为 " + sum);
		
		// 
		// int number = 10;
		// for (int i = 0; i <= number; ++i) {
		// 	System.out.println(i + " + " + (number - i) + " = " + number);
		// }
		// System.out.println("程序继续中");
	}
}
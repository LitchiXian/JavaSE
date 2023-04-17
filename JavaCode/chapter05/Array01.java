public class Array01{
	public static void main(String[] args){
		//需求
		//一个养鸡场有 6 只鸡，它们的体重分别是 
		//3kg,5kg,1kg,3.4kg,2kg,50kg 。请问这六只鸡的总体重是多少?
		//平均体重是多少? 请你编一个程序。
		//思路分析
		//定义6个变量存储鸡的重量
		//定义一个sum变量，计算总体重
		//定义一个average变量，计算平均体重
		//打印输出
		//
		//分析传统实现的方式问题. 6->600->566
		// 引出新的技术 -> 使用数组来解决.
		//走代码
		// double chicken1 = 3;
		// double chicken2 = 5;
		// double chicken3 = 1;
		// double chicken4 = 3.4;
		// double chicken5 = 2;
		// double chicken6 = 50;

		// double sum = chicken1 + chicken2 + chicken3
		//  + chicken4 + chicken5 + chicken6;
		// double average = sum / 6;

		// System.out.println("六只小鸡的总重量为： " + sum + " kg,平均体重为： " + average + " kg");
		
		//比如，我们可以用数组来解决上一个问题
		//
		//定义一个数组
		//double[] 表示 是 double 类型的数组， 数组名 chickens
		// {3, 5, 1, 3.4, 2, 50} 表示数组的值/元素,依次表示数组的
		// 第几个元素
		double[] chickens = {3, 5, 1, 3.4, 2, 50};
		
		//遍历数组得到数组的所有元素的和
		//1. 我们可以通过 chickens[下标] 来访问数组的元素
		// 下标是从 0 开始编号的比如第一个元素就是 chickens[0]
		// 第 2 个元素就是 chickens[1] , 依次类推
		//2. 通过 for 就可以循环的访问 数组的元素/值
		//3. 使用一个变量 sum 将各个元素累积
		double sum = 0, average = 0;
		System.out.println("===使用数组解决===");
		//老师提示： 可以通过 数组名.length 得到数组的大小/长度
		//System.out.println("数组的长度=" + chickens.length);
	
		for( int i = 0; i < chickens.length; i++) {
		//System.out.println("第" + (i+1) + "个元素的值=" + chickens[i]);
		sum += chickens[i];
		}
		System.out.println("总体重=" + sum
		+ "平均体重=" + (sum / chickens.length) );
		
		// //使用foreach循环来算总重量
		// for(double hens : chickens){
		// 	sum += hens;
		// }
		average = sum / chickens.length;
		System.out.println("六只小鸡的总重量为： " + sum + " kg,平均体重为： " + average + " kg");

	}
}
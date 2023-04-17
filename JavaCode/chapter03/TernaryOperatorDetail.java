public class TernaryOperatorDetail{
	public static void main(String[] args){
		//需求，用三元运算符号实现找出三个数最大值
		//思路分析
		//定义三个int 变量 a ,b ,c ;要进行两次对比
		//先 a 跟 b 比较，谁大谁跟 c 比较
		
		int a = 5;
		int b = 9;
		int c = 11;
		// 1.两个三元运算符
		int max1 = a > b ? a : b;
		int max2 = first > c ? first : c;
		System.out.println("最大值为 " + max2);
		//2.一个三元运算符
		// int max = a > b ? a > c ? a : c : b > c ? b : c;
		// System.out.println("最大值为 " + max2);
		// 老韩优化1方案 max1 = a > b ? a : b;，所以直接把first替换
		// int max2 = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		// System.out.println("最大值为 " + max2);
		// 
		// 最终推荐1，比较清晰
	}
}
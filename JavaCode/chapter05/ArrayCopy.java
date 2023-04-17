public class ArrayCopy{
	public static void main(String[] args){
		//需求
		//编写代码 实现数组拷贝（内容复制）
		//要求数据空间是独立的
		int[] arr1 = {10, 20, 30, 33};
		//思路分析
		//定义一个等长的数组  arr1.length
		//循环遍历数组，让arr2的每个元素 等于 
		//arr1 的每个元素
		//测试改变arr2的值，打印输出
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; ++i) {
			arr2[i] = arr1[i];
		}

		arr2[1] = 200;
		System.out.println("=====arr1=====");
		for (int i : arr1) {
			System.out.print(i + "\t");
		}

		System.out.println("\n=====arr2=====");
		for (int i : arr2) {
			System.out.print(i + "\t");
		}
	}
}
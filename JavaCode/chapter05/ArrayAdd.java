public class ArrayAdd{
	public static void main(String[] args){
		//需求
		//实现动态的给数组添加元素效果，实现对数组扩容
		int[] arr = {1, 2, 3};
		int n = 6;
		//思路分析
		//定义一个数组，长度 = arr的长度 + 1
		//复制arr数组到新数组，然后将n赋值给最后一个元素
		//将arr地址改成新的数组地址
		//打印输出
		int len = arr.length;
		int[] arr1 = new int[len + 1];
		for (int i = 0; i < len; ++i) {
			arr1[i] = arr[i];	
		}
		arr1[len] = n;
		arr = arr1;

		System.out.println("=====arr=====");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
	}
}
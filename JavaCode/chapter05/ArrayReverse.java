public class ArrayReverse{
	public static void main(String[] args){
		//需求
		//把数组的元素内容反转
		int[] arr = {11, 22, 33, 44, 55, 66, 11, 88, 101};
		//思路分析
		//遍历数组（一半），定义一个让第一个和最后一个颠倒
		//实现 temp = arr[0];arr[0] = arr[5];arr[5] = temp;
		//打印输出
		int temp;
		int len = arr.length;
		for (int i = 0; i < len / 2; ++i) {
			temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}

		System.out.println("=====arr=====");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
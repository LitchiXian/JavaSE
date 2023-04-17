public class BubbleSort{
	public static void main(String[] args){
		//需求
		//我们将五个无序：24,69,80,57,13 使用
		//冒泡排序法将其排成一个从小到大的有序数列。
		int[] arr = {24, 69, 80, 57, 13, 1, 20};
		//思路分析
		//遍历数组，arr【前】跟arr【后】比较
		//大了往后调换，小了不做处理
		//print
		int temp;
		//问题，这只是一次冒泡，需要多次冒泡
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] < arr[j + 1]) {
					continue;
				}
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		

		System.out.println("=====arr=====");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
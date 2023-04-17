public class ArrayExercise02{
	public static void main(String[] args){
		//需求
		//请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，
		//并得到对应的下标。
		//思路分析
		//1.设置第一个为最大值，max，index
		//2.遍历数组，逐个比较
		//3.当比它大的就换max值和index值
		//4.打印输出
		int[] arr = {411,-1,911, 10,23};
		int max = arr[0],index = 0;
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < max) {
				continue;
			}
			max = arr[i];
			index = i;
		}
		System.out.println("该数组最大值为：" + max + " , 其下标为：" + index);
	}
}
public class YangHui{
	public static void main(String[] args){
		//需求
		//打印输出10行
		//1
		//1 1
		//1 2 1
		//1 3 3 1
		//1 4 6 4 1
		//……
		//思路分析
		//动态 初始化 二维数组
		int len = 10;
		int[][] arr = new int[len][];
		//遍历数组，开拓空间
		for (int i = 0; i < len; ++i) {
			arr[i] = new int[i + 1];
			arr[i][0] = 1;
			//遍历数组赋值
			for (int j = 1; j < arr[i].length; ++j) {
				if (j == arr[i].length - 1) {
					arr[i][j] = 1;
					continue;
				}
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

		//打印输出
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
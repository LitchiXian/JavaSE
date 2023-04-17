public class TwoDimensionalArray{
	public static void main(String[] args){
		//需求
		//动态 创建下面二位数组，并输出
		//{{1}，{2，2}，{3，3，3}}
		//思路分析
		//1.要动态，所以定义时候只说明外层层数，不说明元素个数
		int len = 10;
		int[][] arr = new int[len][];
		//2.遍历数组，给数据开拓空间
		for (int i = 0; i < len; ++i) {
			arr[i] = new int[i + 1];
			//3.遍历数组赋值
			for (int j = 0; j < arr[i].length; ++j) {
				arr[i][j] = i + 1;
			}	
		}
		//4.打印输出
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
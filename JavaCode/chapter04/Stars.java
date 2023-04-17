public class Stars {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//空心金字塔
		int layer = 30;

		for (int i = 1; i <= layer; i++) {//i 表示层数
			//在输出*之前，还有输出 对应空格 = 总层数-当前层
			for (int j = 1; j <= layer - i; j++) {
				System.out.print(" ");
			}
			//控制打印每层的*个数
			for (int j = 1; j <= i * 2 - 1; j++) {
				//当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
				if (j == 1 || j == i * 2 - 1 || i == layer) {
					System.out.print("*");
				}else{//其他情况输出空格
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
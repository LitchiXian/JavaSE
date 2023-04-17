public class MethodExercise01{
	public static void main(String[] args){
		//需求
		//编写类AA 新方法：判断一个数是奇数还是偶数，返回boolean
		//根据行、列、字符打印对应行数和列数的字符，比如：行：4
		//列：4，字符#，则打印相应的效果
		AA a = new AA();
		System.out.println(a.isOdd(3));
		a.printChar(4,5,'a');
	}
}

class AA{
	public boolean isOdd(int num){
		return num % 2 != 0; 
	} 

	public void printChar(int hang, int lie, char word){
		System.out.println("==================================");
		for (int i = 0; i < hang; ++i) {
			for (int j = 0; j < lie; ++j) {
				System.out.print(word + "\t");
			}
			System.out.println();
		}
	}
}
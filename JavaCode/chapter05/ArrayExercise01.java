public class ArrayExercise01{
	public static void main(String[] args){
		//需求
		//创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
		//使用 for 循环访问所有元素并打印出来。提示：char 类型
		// 数据运算 'A'+1 -> 'B'
		// 思路分析
		// 1.定义一个数组 char[] letter
		// 2.for循环实现数组元素的存储
		// 3.for 循环遍历数组
		
		char[] letters = new char[26];
		// letters[0] = 'A';
		// for (int i = 1; i < letters.length; i++) {
		// 	letters[i] = (char)(letters[i - 1] + 1);
		// }
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char)('A' + i);
		}
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i] + "\t");
		}
	}
}
public class IntDetail{
	public static void main(String[] args){

		//Java的整数常量默认 int 型，声明 long 型常量后面须加 ‘ l ’ 或 ‘ L ’
		int n1 = 1;//对，4个字节
		//int n2 = 1L;//对不对？不对，1L有8个字节，int n2 这个4字节空间装不下
		long n3 = 1L;//对
		long n4 = 1;//对不对？对，4字节的放到 long n4 这个8字节空间肯定可以装得下
		//但是，还是建议声明 long 型常量后面须加 ‘ l ’ 或 ‘ L ’
		System.out.println(n4);
	}
}
public class ArrayAssign{
	public static void main(String[] args){
		//基本数据类型赋值，赋值方式为 值传递 / 值拷贝
		//n2的变化，不会影响到n1的值
		int n1 = 10;
		int n2 = n1;
		n2 = 80;
		
		System.out.println("n1 = " + n1);//80
		System.out.println("n2 = " + n2);//80
		
		//数组在默认情况下是引用传递，赋的值
		//是地址，赋值方式为 引用传递（引用拷贝）
		//是一个地址
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		arr2[1] = 123;

		for (int i: arr1){
			System.out.print(i + "\t");// 1       123     3
		}
		
	}
}
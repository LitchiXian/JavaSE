public class ArrayReverse{
	public static void main(String[] args){
		//����
		//�������Ԫ�����ݷ�ת
		int[] arr = {11, 22, 33, 44, 55, 66, 11, 88, 101};
		//˼·����
		//�������飨һ�룩������һ���õ�һ�������һ���ߵ�
		//ʵ�� temp = arr[0];arr[0] = arr[5];arr[5] = temp;
		//��ӡ���
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
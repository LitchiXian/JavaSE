public class ArrayCopy{
	public static void main(String[] args){
		//����
		//��д���� ʵ�����鿽�������ݸ��ƣ�
		//Ҫ�����ݿռ��Ƕ�����
		int[] arr1 = {10, 20, 30, 33};
		//˼·����
		//����һ���ȳ�������  arr1.length
		//ѭ���������飬��arr2��ÿ��Ԫ�� ���� 
		//arr1 ��ÿ��Ԫ��
		//���Ըı�arr2��ֵ����ӡ���
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; ++i) {
			arr2[i] = arr1[i];
		}

		arr2[1] = 200;
		System.out.println("=====arr1=====");
		for (int i : arr1) {
			System.out.print(i + "\t");
		}

		System.out.println("\n=====arr2=====");
		for (int i : arr2) {
			System.out.print(i + "\t");
		}
	}
}
public class ArrayAdd{
	public static void main(String[] args){
		//����
		//ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ���������
		int[] arr = {1, 2, 3};
		int n = 6;
		//˼·����
		//����һ�����飬���� = arr�ĳ��� + 1
		//����arr���鵽�����飬Ȼ��n��ֵ�����һ��Ԫ��
		//��arr��ַ�ĳ��µ������ַ
		//��ӡ���
		int len = arr.length;
		int[] arr1 = new int[len + 1];
		for (int i = 0; i < len; ++i) {
			arr1[i] = arr[i];	
		}
		arr1[len] = n;
		arr = arr1;

		System.out.println("=====arr=====");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
	}
}
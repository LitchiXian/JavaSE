import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args){
		//����
		//ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ���������
		int[] arr = {1, 2, 3};
		//˼·����
		//����һ�����飬���� = arr�ĳ��� + 1
		//����arr���鵽�����飬Ȼ��n��ֵ�����һ��Ԫ��
		//��arr��ַ�ĳ��µ������ַ
		//��ӡ���
		
		Scanner sc = new Scanner(System.in);
		do{
			int len = arr.length;
			int[] arr1 = new int[len + 1];
			for (int i = 0; i < len; ++i) {
				arr1[i] = arr[i];	
			}
			System.out.println("��������Ҫ��ӵ�Ԫ�أ�");
			int n = sc.nextInt();
			arr1[len] = n;
			arr = arr1;

			System.out.println("=====arr=====");
			for (int i : arr) {
				System.out.print(i + "\t");
			}

			System.out.println("�Ƿ������� y/n");
		}while('y' == sc.next().charAt(0));
		System.out.println("�˳��˳���");
	}
}
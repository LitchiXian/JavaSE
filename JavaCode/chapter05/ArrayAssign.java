public class ArrayAssign{
	public static void main(String[] args){
		//�����������͸�ֵ����ֵ��ʽΪ ֵ���� / ֵ����
		//n2�ı仯������Ӱ�쵽n1��ֵ
		int n1 = 10;
		int n2 = n1;
		n2 = 80;
		
		System.out.println("n1 = " + n1);//80
		System.out.println("n2 = " + n2);//80
		
		//������Ĭ������������ô��ݣ�����ֵ
		//�ǵ�ַ����ֵ��ʽΪ ���ô��ݣ����ÿ�����
		//��һ����ַ
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		arr2[1] = 123;

		for (int i: arr1){
			System.out.print(i + "\t");// 1       123     3
		}
		
	}
}
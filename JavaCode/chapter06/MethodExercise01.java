public class MethodExercise01{
	public static void main(String[] args){
		//����
		//��д��AA �·������ж�һ��������������ż��������boolean
		//�����С��С��ַ���ӡ��Ӧ�������������ַ������磺�У�4
		//�У�4���ַ�#�����ӡ��Ӧ��Ч��
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
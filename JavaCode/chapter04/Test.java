public class Test {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//������� 1-100 ��һ������ֱ�������� 97 �������������һ�����˼���?
		//��ʾʹ�� (int)(Math.random() * 100) + 1
		//˼·������
		//ѭ��������ѭ���Ĵ�����֪��. -> break ,��ĳ����������ʱ����ֹѭ��
		//ͨ�����������˵���������̿��Ƶı�Ҫ�ԣ����� break
		// while(true){
		// 	int number = (int)(Math.random() * 100) + 1;
		// 	System.out.println(number);
		// 	if (number == 97) {
		// 		break;
		// 	}
		// }
		// 
		// 
		// 
		int count = 0;
		for (int i = 1;i <= 100 ; ++i) {
			if (i%5 == 0) {
				continue;
			}
			System.out.print(i + "\t");
			count++;
			if (count == 5) {
				count = 0;
				System.out.println();
			}
		}
	}
}
public class WhileExercise {
	//��дһ�� main ����
	public static void main(String[] args) {

		//����
		// ��ӡ 1��100 ֮�������ܱ� 3 �������� [ʹ�� while, ��ʦ���� ]
		int start = 1, end = 1000;
		int number = 400;
		while(start <= end){
			if (start % number == 0) {
				System.out.println(start);
			}
			++start;
		}

		//����
		// ��ӡ 40��200 ֮�����е�ż�� [ʹ�� while, �κ���ϰ]
		// int i = 40;
		// while(i <= 200){
		// 	if (i % 2 == 0) {
		// 		System.out.println(i);
		// 	}
		// 	++i;
		// }
	}
}
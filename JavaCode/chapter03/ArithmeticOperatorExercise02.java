public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//1.����
		//���绹�� 59 ��ż٣��ʣ��� xx �������� xx ��
		//2.˼·����
		//��1�� ʹ��int ���� days ���� ����
		//��2�� һ��������7�� ������weeks��days / 7 ��xx��leftDays : days % 7
		//��3��	���
		//3.�ߴ���
		int days = 12344;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "�� ��" + weeks + "������" 
		+ leftDays + "��");

		//1.����
		//����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ
		//��5/9*(�����¶�-100),����������¶ȶ�Ӧ�������¶�
		//2.˼·����
		//��1������һ��double����huaShi���滪���¶ȣ�һ��double����sheShi���������¶�
		//��2��sheShi = 5 / 9 * (huaShi - 100)
		//		������ѧ��ʽ�� java ���Ե�����
		//��3����ӡ���
		//3.�ߴ���
		double huaShi = 26;
		double sheShi;
		sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println(huaShi + "�����¶ȶ�Ӧ�������¶�Ϊ" + sheShi);

	}
}
// import java.util.Scanner;
public class NestedIf {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//�μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭��
		//���Ҹ����Ա���ʾ�����������Ů���顣������
		//��ѧԱ����ϰ�¡�, ����ɼ����Ա𣬽����жϺ������Ϣ��
		//˼·����
		//1.����һ�����֣�����String name���ɼ�double grade���Ա�char gender
		//2.��һ���ж���û�й�8.0��û�����
		//3.����������ж��Ա𣬽��������黹��Ů����
		//�ߴ���
		String name = "Litchi";
		double grade = 8.1;
		char gender = 'w';
		//�ȶ��û���Ϣ����һ����Χ����Ч�ж�
		if (grade > 10 || grade < 0 || (gender != 'm' && gender != 'w')) {
			System.out.println("��Ϣ�����⣬�����ط�����Ա��ϰ");
			return;
		}
		if (grade > 8.0) {
			if (gender == 'm') {
				System.out.println(name + " ��������ϲ���������");
			} else {
				System.out.println(name + " Ůʿ����ϲ���������");
			}
		}else{
			System.out.println("���ź���" + name + "û�н������");
		}
		System.out.println("�������ͱ���");
	}
}
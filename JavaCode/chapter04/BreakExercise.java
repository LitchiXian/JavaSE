import java.util.Scanner;
public class BreakExercise {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���
		//������ʾ���м��λ��ᣬ��ʹ�� for+break���
		// ˼·����
		// 1. ����Scanner ��������û�����
		// 2. ����String name ; String passwd; �����û���������
		// 3. ���ѭ��3 ��[��¼3 ��]�����������������ǰ�˳�
		Scanner sc = new Scanner(System.in);
		String userName = "";
		String passWord = "";
		for (int i = 0; i < 3; ++i) {
			System.out.println("�������û�����");
			userName = sc.next();
			System.out.println("���������룺");
			passWord = sc.next();
			// if (userName.equals("����") && passWord.equals("666")) {
			if ("����".equals(userName) && "666".equals(passWord)) {//�����ӱȽϺá������ָ�롿
				//�����ַ���д��ǰ��
				System.out.println("==============================");
				System.out.println("��ϲ�㣬��¼�ɹ�������");
				break;
			}
			System.out.println("��¼ʧ�ܣ�����ʣ " + (2 - i) + " �λ���");
		}
		System.out.println("��ӭ�´ι���");
	}
}
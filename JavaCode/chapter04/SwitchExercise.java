import java.util.Scanner;
public class SwitchExercise {
	//��дһ�� main ����
	public static void main(String[] args) {
		//��������ָ���·ݣ�
		//��ӡ���·������ļ��ڡ�
		////˼·����
		//1. ���� Scanner ���� �����û�����
		//2. ʹ�� int moon ����
		//3. ʹ�� switch ��ƥ�� ,ʹ�ô�͸����ɣ��Ƚϼ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ڵ��·ݣ�");
		int moon = sc.nextInt();
		switch(moon){
			case 1:
			case 2:
			case 3:
				System.out.println("�����Ǵ��죬����ˬ");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("���������죬����");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("���������죬����ˬ");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("�����Ƕ��죬������ˬ");
				break;
			default:
				System.out.println("��������ȷ���·�");
		}
		System.out.println("����һ��һ�����~~~");
	}
}
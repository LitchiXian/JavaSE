import java.util.Scanner;
public class Switch01 {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
		// a ��ʾ����һ��b ��ʾ���ڶ� ��
		// �����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������
		String weekDay = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		char day = sc.next().charAt(0);//�û�����Ķ������ַ���������.charAt(0)
		switch(day){
			case 'a':
				weekDay = "һ";
				break;
			case 'b':
				weekDay = "��";
				break;
			case 'c':
				weekDay = "��";
				break;
			case 'd':
				weekDay = "��";
				break;
			case 'e':
				weekDay = "��";
				break;
			case 'f':
				weekDay = "��";
				break;
			case 'g':
				weekDay = "��";
				break;
			default:
				System.out.println("��������ȷ�ַ���a - g��");
				return;
		}
		System.out.println("����������" + weekDay);
	}
}
import java.util.Scanner;
public class DoWhileExercise {
	//��дһ�� main ����
	public static void main(String[] args) {
		//����
		//�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
		char key = 'y';
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("��Ǯ����");
		}while(sc.next().charAt(0) != key);
		System.out.println("Good");
	}
}
import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		//����
		String[] arr = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		//��һ�����У���üӥ������ëʨ����������
		//������������������Ϸ���Ӽ�������������һ��
		//���ƣ��ж��������Ƿ���������ơ�˳����ҡ�
		// Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ��
		//˼·����
		//1.����һ��Scanner���󣬽����û�����
		//2.�������飬����Ա�
		//3.�ҵ�������ҵ��ˣ�������������ǵڼ�����
		System.out.println("=====arr=====");
		for (String i : arr) {
		System.out.print(i + "\t");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҫ��ѯ���ַ�����");
		String search = sc.next();
		for (int i = 0; i < arr.length; ++i) {
			if (search.equals(arr[i])) {
				System.out.println(search + " ���ַ�������ĵ� " + (i + 1) + " ��");
				System.out.println("лл����ʹ��");
				return;
			}
		}
		System.out.println("sorry");
	}
}
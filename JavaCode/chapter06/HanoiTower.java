public class HanoiTower{
	public static void main(String[] args){
		//����
		Tower t = new Tower();
		t.move(5, 'A', 'B', 'C');
	}
}

class Tower{
	//����
	//num ��ʾҪ�ƶ��ĸ���, a, b, c �ֱ��ʾ A ����B ��, C ��
	public void move(int num, char a, char b, char c){
		//���ֻ��һ���� num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		}else{
			//��������������������һ�����������һ��
			//1.���ƶ��������е��̵� b, ���� c
			//2.�������������̣��ƶ��� c
			//3.�ٰ� b ���������̣��ƶ��� c ,���� a
			move(num - 1, a, c, b);
			System.out.println(a + "->" + c);
			move(num - 1, b, a, c);
		}
	}
}
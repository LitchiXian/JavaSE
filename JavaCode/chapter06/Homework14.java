import java.util.Scanner;
public class Homework14{
	public static void main(String[] args){
		
		Game g = new Game();
		g.game();
	}

	
}

class Game{
	public boolean computer(int n){
		int m = (int)(Math.random() * 100) % 3;
		System.out.println(m);
		if ((n == 2 && m == 1)||(n == 1 && m == 0)||(n == 0 && m == 2)) {
			return true;
		}
		return false;
	}

	public void game(){
		int win = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("���ȭ��0��������1��ʯͷ��2��������");
			if(computer(sc.nextInt()))++win;
			++i;
		}while(i < 3);
		System.out.println("���ܹ�Ӯ�� " + win);
	}
}

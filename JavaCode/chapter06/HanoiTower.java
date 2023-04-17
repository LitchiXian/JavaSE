public class HanoiTower{
	public static void main(String[] args){
		//需求
		Tower t = new Tower();
		t.move(5, 'A', 'B', 'C');
	}
}

class Tower{
	//方法
	//num 表示要移动的个数, a, b, c 分别表示 A 塔，B 塔, C 塔
	public void move(int num, char a, char b, char c){
		//如果只有一个盘 num = 1
		if (num == 1) {
			System.out.println(a + "->" + c);
		}else{
			//把它看成两个，最下面一个，和上面的一堆
			//1.先移动上面所有的盘到 b, 借助 c
			//2.把最下面的这个盘，移动到 c
			//3.再把 b 塔的所有盘，移动到 c ,借助 a
			move(num - 1, a, c, b);
			System.out.println(a + "->" + c);
			move(num - 1, b, a, c);
		}
	}
}
public class MiGong{
	public static void main(String[] args){
		//需求
		//自治一个迷宫
		int[][] map = {
			{2, 2, 2, 2, 2, 2, 2, 2},
			{2, 0, 0, 0, 0, 2, 0, 2},
			{2, 0, 0, 2, 0, 2, 0, 2},
			{2, 2, 2, 2, 0, 0, 0, 2},
			{2, 0, 0, 0, 0, 0, 0, 2},
			{2, 0, 2, 2, 2, 2, 2, 2},
			{2, 0, 0, 0, 0, 0, 0, 2},
			{2, 2, 2, 2, 2, 2, 2, 2}
		};
		//让站在1的小老鼠出迷宫
		//盲目开始，毫无头绪，所以还是得思路
		//思路每次先往右走，走不通，就走下，走不通就走上，走不通就走左
		//走到以前走过的直接算走不通
		//可以走是0不可以走的是2，1
		//设置开始位置，和结束位置，走过的就变1，当终点也变1，就结束
		T2 t = new T2();
		t.miGong(map, 1, 1);
		for (int[] i: map) {
			for (int j: i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class T2{
	public boolean miGong(int[][] map, int i,int j){
		if (map[6][6] == 1) {
			return true;
		} 
		//else if(map[i][j + 1] == 0){
		// 	map[i][j + 1] = 1;
		// 	miGong(map, i, j + 1);
		// 	return true;
		// }else if(map[i + 1][j] == 0){
		// 	map[i + 1][j] = 1;
		// 	miGong(map, i + 1, j);
		// 	return true;
		// }else if(map[i - 1][j] == 0){
		// 	map[i - 1][j] = 1;
		// 	miGong(map, i - 1, j);
		// 	return true;
		// }else if(map[i][j - 1] == 0){
		// 	map[i][j - 1] = 1;
		// 	miGong(map, i, j - 1);
		// 	return true;
		// }else{
		// 	return false;
		// }
		else{
			if (map[i][j] == 0) {
				map[i][j] = 1;
				//这个是下右左上，不同策略，情况不同
				if (miGong(map, i + 1, j)) {
					return true;
				} else if(miGong(map, i, j + 1)){
					return true;
				} else if(miGong(map, i, j - 1)){
					return true;
				} else if(miGong(map, i - 1, j)){
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
}
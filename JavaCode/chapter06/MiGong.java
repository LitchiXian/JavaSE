public class MiGong{
	public static void main(String[] args){
		//����
		//����һ���Թ�
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
		//��վ��1��С������Թ�
		//äĿ��ʼ������ͷ�������Ի��ǵ�˼·
		//˼·ÿ���������ߣ��߲�ͨ�������£��߲�ͨ�����ϣ��߲�ͨ������
		//�ߵ���ǰ�߹���ֱ�����߲�ͨ
		//��������0�������ߵ���2��1
		//���ÿ�ʼλ�ã��ͽ���λ�ã��߹��ľͱ�1�����յ�Ҳ��1���ͽ���
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
				//������������ϣ���ͬ���ԣ������ͬ
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
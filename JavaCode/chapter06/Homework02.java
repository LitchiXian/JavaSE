public class Homework02{
	public static void main(String[] args){
		//����
		A02 a = new A02();
		String[] arr = {"�ɻ�", "����", "��", "����", "����"};
		System.out.println(a.find(arr, "��"));
	}

	
}

class A02{
	public int find(String[] arr, String search){
		int index = -1;
		for (int i = 0; i < arr.length; ++i) {
			if (search.equals(arr[i])) {
				index = i;
				break;
			}
		}
		return index;
	}
}
public class Homework02{
	public static void main(String[] args){
		//需求
		A02 a = new A02();
		String[] arr = {"飞机", "大炮", "火车", "公交", "地铁"};
		System.out.println(a.find(arr, "火车"));
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
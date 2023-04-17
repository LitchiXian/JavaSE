public class RecursionExercise01{
	public static void main(String[] args){
		//需求
		//猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
		// 以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
		// 想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？
		// 思路分析
		// 今天桃子  = 每天吃一半桃子2/n + 1个 + 明天桃子
		// 逆序，第一天有一个桃子
		// 第二天有（第一天的桃子 + 1）* 2
		// 第三天有 (第二天桃子 + 1) * 2
		T1 t = new T1();
		System.out.println(t.peech(10));
	}
}

class T1{
	public int peech(int n){
		if (n == 1) {
			return 1;
		}
		return (peech(n - 1) + 1) * 2;
	}
}
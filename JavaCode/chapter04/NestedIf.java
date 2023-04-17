// import java.util.Scanner;
public class NestedIf {
	//编写一个 main 方法
	public static void main(String[] args) {
		//需求
		//参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
		//并且根据性别提示进入男子组或女子组。【可以
		//让学员先练习下】, 输入成绩和性别，进行判断和输出信息。
		//思路分析
		//1.定义一个歌手，姓名String name，成绩double grade，性别char gender
		//2.第一个判断有没有过8.0，没有输出
		//3.进入决赛后，判断性别，进入男子组还是女子组
		//走代码
		String name = "Litchi";
		double grade = 8.1;
		char gender = 'w';
		//先对用户信息进行一个范围的有效判断
		if (grade > 10 || grade < 0 || (gender != 'm' && gender != 'w')) {
			System.out.println("信息有问题，请跟相关服务人员练习");
			return;
		}
		if (grade > 8.0) {
			if (gender == 'm') {
				System.out.println(name + " 先生，恭喜您进入决赛");
			} else {
				System.out.println(name + " 女士，恭喜您进入决赛");
			}
		}else{
			System.out.println("很遗憾，" + name + "没有进入决赛");
		}
		System.out.println("继续观赏比赛");
	}
}
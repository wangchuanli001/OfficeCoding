package officeCoding;

import java.util.Scanner;

/**
 * �滻�ո� ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are
 * Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 * @author Administrator
 *
 */
public class Pro_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		StringBuffer str = new StringBuffer(sc.nextLine());
		replace(str);
	}

	public static void replace(StringBuffer str) {
		System.out.println(str.toString().replaceAll(" ", "%20"));
	}
}

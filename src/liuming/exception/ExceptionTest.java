package liuming.exception;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		// a();
		// b();
		// Scanner scan = new Scanner(System.in);
		// scan.nextInt();
		// b();
		//
		// try {
		// System.out.println(divide(10, 0));
		// System.out.println(divide(10, 2));
		// System.out.println(divide(10, 11));
		// System.out.println(divide(10, 5));
		// } catch (ArithmeticException e) {
		// e.printStackTrace();
		// // overload
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println(111);
		// e.printStackTrace();
		// } catch (NullPointerException e) {
		// e.printStackTrace();
		// }
		// 在控制台中要求输入 两个数字 输入完成后 输出相除的结果
		//
		boolean isStop = false;
		while (!isStop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入第一个数字");
			int i = scan.nextInt();
			System.out.println("请输入第二个数字");
			int j = scan.nextInt();

			try {
				System.out.println("您输入的数据处理结果为: " + divide(i, j));
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			System.out.println("处理之后");
			System.out.println("\r\n\r\n");
		}
	}

	public static int divide(int i, int j) {
		return i / j;
	}

	public static void a() {
		b();
		int i = 1 / 0;
	}

	public static void b() {
		int[] arr = { 1, 2, 3 };
		int j = arr[3];
	}

}
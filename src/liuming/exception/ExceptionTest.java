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
		// �ڿ���̨��Ҫ������ �������� ������ɺ� �������Ľ��
		//
		boolean isStop = false;
		while (!isStop) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�������һ������");
			int i = scan.nextInt();
			System.out.println("������ڶ�������");
			int j = scan.nextInt();

			try {
				System.out.println("����������ݴ�����Ϊ: " + divide(i, j));
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
			System.out.println("����֮��");
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
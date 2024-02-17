package hw6;

//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡
//有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可以輸入
//x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//1. x與y同時為0，(產生自訂的CalException例外物件)。
//2. y為負值，而導致x的y次方結果不為整數。
//3. x與y皆正確情況下，會顯示運算後結果。


import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int x, y;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值: ");
				x = sc.nextInt();
				System.out.println("請輸入y的值: ");
				y = sc.nextInt();
				System.out.println(x + "的" + y + "次方等於: " + cal.powerXY(x, y));
				return;

			} catch (CalException m) {
				m.printStackTrace();;
			} catch (InputMismatchException m) {
				System.out.println("輸入格式不正確");
			}
		}

	}
}

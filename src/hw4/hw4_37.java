package hw4;

//	第一題:有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15},請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素。
//import java.util.Arrays;
//
//public class hw4_37 {
//
//	public static void main(String[] args) {
//		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		
//		Arrays.sort(numbers);
//		
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		double avg = sum / numbers.length;
//		System.out.println("平均值: " + avg);
//
//		System.out.print("大於平均值的元素: ");
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] > avg) {
//				System.out.print(numbers[i] + " ");
//			}
//		}
//	}
//}

//	第二題:請建立一個字串,經過程式執行後,輸入結果是反過來的,例如String s = “Hello World”,執行結果即為dlroW olleH。
//import java.util.Scanner;
//
//public class hw4_37 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入一個字串:");
//		String input = sc.nextLine();
//		StringBuilder reversed = new StringBuilder();
//		for (int i = input.length() - 1; i >= 0; i--) {
//			reversed.append(input.charAt(i));
//		}
//		System.out.println(reversed);
//		sc.close();
//	}
//}

//	第三題:有個字串陣列如下(八大行星):{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,“uranus”,“neptune”}請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)。
//public class hw4_37 {
//
//	public static void main(String[] args) {
//
//		String[] planetArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//
//		String vowel = "aeiou";
//		int count = 0;
//		for (int i = 0; i < planetArray.length; i++) {
//			String str = planetArray[i];
//			for (int j = 0; j < str.length(); j++) {
//				char c = str.charAt(j);
//
//				if (vowel.indexOf(c) != (-1)) {
//					count += 1;
//				}
//			}
//		}
//		System.out.println("共有: " + count + " 個母音");
//	}
//}

//	第四題:阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
//			員工編號 25 32 8 19 27
//			身上現金 2500 800 500 1000 1200
//			請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//import java.util.Scanner;
//
//public class hw4_37 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請小華輸入欲借的金額: ");
//		int money = sc.nextInt();
//		int[][] array = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
//		int count = 0;
//		StringBuilder empno = new StringBuilder();
//		for (int i = 0; i < array[1].length; i++) {
//			if (money <= array[1][i]) {
//				count += 1;
//				empno.append(array[0][i]).append(" ");
//			}
//		}
//		if (count > 0) {
//			System.out.print("「有錢可借的員工編號: " + empno);
//			System.out.println("共 " + count + " 人!」");
//		} else {
//			System.out.println("「無人可借小文錢!」");
//		}
//
//		sc.close();
//	}
//}

//	第五題:請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天,例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」。
//import java.util.Scanner;
//
//public class hw4_37 {
//
//	public static void main(String[] args) {
//		System.out.println("請輸入以下日期\n西元yyyy年\nmm月\ndd日");
//		Scanner sc = new Scanner(System.in);
//
//		int[] date = new int[3];
//		for (int i = 0; i < 3; i++) {
//			date[i] = sc.nextInt();
//		}
//
//		sc.close();
//
//		int year = date[0];
//		int month = date[1];
//		int day = date[2];
//
//		int[] MonthOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		// 加入閏年條件
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			MonthOfDays[1] = 29;
//		}
//		// 檢查月份
//		if ((month < 1) || (month > 12)) {
//			System.out.println("月份輸入不正確，應輸入01~12之間!");
//			return;
//		}
//		// 檢查日期
//		if ((day < 1) || (day > MonthOfDays[month - 1])) {
//			System.out.println("日期輸入錯誤，應符合當月份的實際範圍日期!");
//			return;
//		}
//
//		int sum = 0;
//		for (int i = 0; i < month - 1; i++) {
//			sum += MonthOfDays[i];
//		}
//		sum += day;
//
//		System.out.println("「輸入的日期為該年第" + sum + "天」");
//	}
//}

//	第六題:班上有8位同學,他們進行了6次考試結果,請算出每位同學考最高分的次數
public class hw4_37 {

	public static void main(String[] args) {
		int[][] scoresArray = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highestScoreCount = new int[8];
		for (int[] testNum : scoresArray) {
			int highestScore = testNum[0];
			for (int score : testNum) {
				if (score > highestScore) {
					highestScore = score;
				}
			}
			for (int i = 0; i < highestScoreCount.length; i++) {
				if (testNum[i] == highestScore) {
					highestScoreCount[i]++;
				}
			}
		}

		for (int j = 0; j < highestScoreCount.length; j++) {
			System.out.println((j + 1) + "號同學考最高分的次數為 " + highestScoreCount[j] + "次");
		}
	}
}
package hw3;

//	第一題:請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形。(進階:加入直角三角形的判斷)
//import java.util.Scanner;
//
//public class hw3_37 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] data = new int[3];
//
//		System.out.println("請輸入三個數字");
//		for (int i = 0; i < data.length; i++) {
//			data[i] = sc.nextInt();
//		}
//
//		if (data[0] <= 0 || data[1] <= 0 || data[2] <= 0) {
//			System.out.println("結果為: 不是三角形!");
//		} else if (data[0] == data[1] && data[0] == data[2] && data[1] == data[2]) {
//			System.out.println("結果為: 正三角形!");
//		} else if (data[0] == data[1] || data[0] == data[2] || data[1] == data[2]) {
//			System.out.println("結果為: 等腰三角形!");
//		} else if (Math.pow(data[0], 2) + Math.pow(data[1], 2) == Math.pow(data[2], 2)) {
//			System.out.println("結果為: 直角三角形!");
//		} else {
//			System.out.println("結果為: 其他三角形!");
//		}
//		sc.close();
//	}
//}

//	第二題:請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息。
//import java.util.Scanner;
//
//public class hw3_37 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("開始猜數字吧!");
//		int i;
//		i = (int) (Math.random() * 10) + 0;  //產生亂數
//		while (true) {
//			int guess = sc.nextInt();
//			if (guess != i) {
//				System.out.println("答錯囉");
//			} else {
//				System.out.println("答對了!答案就是" + i);
//				break;
//			}
//		}
//	}
//}
//	第二題(進階):產生0~100亂數,每次猜就會提示你是大於還是小於正確答案。
//import java.util.Scanner;
//import java.util.Random;
//
//public class hw3_37 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Random num = new Random();
//
//		int ans = num.nextInt(101);
//		System.out.println("請猜一個數字(範圍:0~100)");
//		while (true) {			
//			int guess = sc.nextInt();
//			if (guess == ans) {
//				System.out.println("恭喜~答對了!");
//				break;
//			}else if (guess<0||guess>100) {
//				System.out.println("你猜的數字已經超過範圍了(範圍:0~100)");
//			}
//			else if (guess > ans) {
//				System.out.println("猜錯了! 正確答案比你猜的還小~\n請繼續猜一個數字(範圍:0~100)!");
//			} else {
//				System.out.println("猜錯了! 正確答案比你猜的還大~\n請繼續猜一個數字(範圍:0~100)!");
//			}
//		}
//		sc.close();
//	}
//}

//	第三題:阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數。
import java.util.Scanner;

public class hw3_37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文，請問你不想要出現哪個數字?(1~9)");
		int hatNum = sc.nextInt();
		int num;
		System.out.println("你可以選擇的號碼有:");
		int count = 1;
		if (hatNum >= 1 && hatNum <= 9) {
			for (num = 1; num <= 49; num++) {
				if (num / 10 == hatNum || num % 10 == hatNum) {
					continue;
				}
				System.out.print(num + "\t");
				if (count % 6 == 0) {
					System.out.println();
				}
				count++;
			}
		} else {
			System.out.println("輸入的數字超過範圍了(範圍:1~9)");
		}
		System.out.println("總共有" + (count - 1) + "個數字可選");
		sc.close();
	}
}
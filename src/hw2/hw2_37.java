package hw2;

public class hw2_37 {

	public static void main(String[] args) {

//	迴圈的課堂練習(第一題):使用for迴圈+while迴圈輸出九九乘法表
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}
//	}

//	迴圈的課堂練習(第二題):使用for迴圈+do while迴圈輸出九九乘法表
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//		System.out.println();
//		}
//	}

//	迴圈的課堂練習(第三題):使用while迴圈+do while迴圈輸出九九乘法表
//		int i = 1;
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			i++;
//			System.out.println();
//		}
//	}

//	==========作業2由此開始==========
//	第一題:請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//		int sum = 0;
//		for (int i = 0; i <= 1000; i++) {
//			if (i % 2 == 0)
//				sum += i;
//		}
//		System.out.println(sum);
//	}

//	第二題:請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//		int sum = 1;
//		for (int i = 1; i <= 10; i++) {
//				sum *= i;
//		}
//		System.out.println(sum);
//	}

//	第三題:請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//		int sum = 1;
//		int i = 1;
//		while (i <= 10) {
//			sum *= i;
//			i++;
//		}
//		System.out.println(sum);
//	}

//	第四題:請設計一隻Java程式,輸出結果為以下: 
//         1 4 9 16 25 36 49 64 81 100
//		int num;
//		for (int i = 1; i <= 10; i++) {
//			num = (int) Math.pow(i, 2);
//			System.out.print(num+" ");
//		}
//	}

//	第五題:阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//		for (int i = 1; i <= 49; i++) {
//			if (i / 10 == 4 || i % 10 == 4) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//	}

//	第六題:請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		for (int i = 10; i >= 1; i--){
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}

//	第七題:請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char l = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(l);
			}
			l++;
			System.out.println();
		}
	}
}
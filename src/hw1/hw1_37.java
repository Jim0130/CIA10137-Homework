package hw1;

public class hw1_37 {
	public static void main(String[] args) {

//	第一題:請設計一隻Java程式,計算12,6這兩個數值的和與積	
//		int a = 12, b = 6;
//		System.out.println(a + b);
//		System.out.println(a * b);
//	}

//  第二題:請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)	
//	    int egg= 200;
//	    System.out.println((egg/12)+" 打"+ (" "+egg%12)+" 顆");		
//	}

//  第三題:請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//		int time = 256559;
//		int t1 = time / 86400;
//		int t2 = time % 86400;
//		int t3 = t2 / 3600;
//		int t4 = t2 % 3600;
//		int t5 = t4 / 60;
//		int t6 = t4 % 60;
//		System.out.println(t1 + "天" + t3 + "小時" + t5 + "分鐘" + t6 + "秒鐘");
//    }

//  第四題:請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		final double PI = 3.1415, r = 5;
//		System.out.println("圓面積:" + (Math.pow(r, 2) * PI));
//		System.out.println("圓周長:" + (2 * r) * PI);
//	}

//	第五題:某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
//		  (複利公式:FV=PV*(1+i)n次方)
//		int s = 1500000;
//		double i = 0.02;
//		System.out.println("本金加利息共"+s * (Math.pow((1 + i), 10)) + "元");		
//	}
		
//	第六題:請寫一隻程式,利用System.out.println()印出以下三個運算式結果(並請用註解各別說明答案的產生原因)
		System.out.println(5 + 5); // 數字相加即為該數值。
		System.out.println(5 + '5'); // 單引號為字元，經查詢Unicode字元5的數值為43，故53+5=58。
		System.out.println(5 + "5"); // 雙引號代表字串，故字串串接即為55。
	}
}
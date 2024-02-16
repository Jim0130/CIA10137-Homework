package hw5;

//	第一題:請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形。

//import java.util.Scanner;
//
//public class hw5_37 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入寬與高:");
//
//		int weight = sc.nextInt();
//		int height = sc.nextInt();
//		starSquare(weight, height);
//		sc.close();
//	}
//
//	public static void starSquare(int weight, int height) {
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < weight; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//	第二題:請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值。

//import java.util.Arrays;
//import java.util.Random;
//
//public class hw5_37 {
//	
//	public static void main(String[] args) {
//	    hw5_37 num1 = new hw5_37();
//	    num1.randAvg();
//	}
//	
//	public void randAvg() {
//	    int[] randNum = new int[10];
//	    Random num2 = new Random();
//	    int sum = 0;
//	    double average;
//	
//	    for (int i = 0; i < randNum.length; i++) {
//	        randNum[i] = num2.nextInt(101);
//	    }
//	    System.out.println("本次亂數結果: ");
//	    System.out.println(Arrays.toString(randNum));
//	
//	    for (int i : randNum) {
//	        sum += i;
//	    }
//	    average = (double) sum / randNum.length;
//	
//	    System.out.println(average);
//	}
//}

//	第三題:利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳。

//public class hw5_37 {
//
//	public int maxElement(int[][]intArray) {
//		int maxInt = 0;
//		for (int[] int1 : intArray) {
//			for (int Int2 : int1) {
//				if (Int2 > maxInt) {
//					maxInt = Int2;
//				}
//			}
//		}
//		return maxInt;
//	}
//	
//	public double maxElement(double[][] doubleArray) {
//		double maxDouble = 0;
//		for (double[] double1 : doubleArray) {
//			for (double Double2 : double1) {
//				if (Double2 > maxDouble) {
//					maxDouble = Double2;
//				}
//			}
//		}
//		return maxDouble;
//	}
//	
//	public static void main(String[] args) {
//		int[][] intArray = new int[][] { { 1, 6, 3 }, { 9, 5, 2 } };
//		double[][] doubleArray = new double[][] { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//
//		hw5_37 h = new hw5_37();
//		System.out.println(h.maxElement(intArray));
//		System.out.println(h.maxElement(doubleArray));
//	}
//}

//	第四題:。

//	第五題:身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合。
//
//import java.util.Random;
//
//public class hw5_37 {
//
//	public String genAuthCode() {
//		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//		StringBuilder sb = new StringBuilder();
//		Random random = new Random();
//		
//		for (int i = 0; i < 8; i++) {
//			sb.append(characters.charAt(random.nextInt(characters.length())));
//		}
//		
//		return sb.toString();
//	}
//	
//	public static void main(String[] args) {
//		hw5_37 h = new hw5_37();
//		System.out.println("本次隨機產生驗證碼為: \n" + h.genAuthCode());
//	}
//}
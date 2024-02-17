package hw7;

//	第一題:請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料。
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class hw7_37 {
//
//	public static void main(String[] args) {
//		File file = new File("C:\\CIA101_Workspace\\CIA10137-Homework\\src\\hW7\\Sample.txt");
//
//		int byteCount = 0;
//		int charCount = 0;
//		int lineCount = 0;
//		try {
//			FileReader fileReader = new FileReader(file);
//
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//			String line;
//
//			while ((line = bufferedReader.readLine()) != null) {
//
//				if (!line.trim().isEmpty()) {
//
//					lineCount++;
//
//					charCount += line.trim().length();
//				}
//
//				byteCount += line.getBytes().length;
//			}
//
//			bufferedReader.close();
//			fileReader.close();
//
//			System.out.println("Sample.txt檔案共有" + byteCount + "個位元組," + charCount + "個字元," + lineCount + "列資料。");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}

//	第二題:請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)。
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Random;
//
//public class hw7_37 {
//	
//	public static void main(String[] args) {
//		Random random = new Random();
//        int[] randomInteger = new int[10];
//        for (int i = 0; i < randomInteger.length; i++) {
//        	// 產生1到1000的隨機整數
//            randomInteger[i] = random.nextInt(1000) + 1; 
//        }
//
//        // 寫入檔案
//        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\CIA101_Workspace\\CIA10137-Homework\\src\\hW7\\Data.txt", true))) {
//            for (int num : randomInteger) {
//                writer.println(num);
//            }
//            System.out.println("隨機的整數已寫入Data.txt檔案內 ");
//        } catch (IOException e) {
//            System.err.println("寫入檔案時發生錯誤： " + e.getMessage());
//        }
//    }
//}

//	第三題:請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案。

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class hw7_37 {
//
//	public static void main(String[] args) {
//		copyFile("C:\\CIA101_Workspace\\CIA10137-Homework\\src\\hW7\\hw7_3.txt",
//				"C:\\CIA101_Workspace\\CIA10137-Homework\\src\\hW7\\hw7_3_1.txt");
//	}
//
//	public static void copyFile(String hw7_3FileName, String hw7_3_1FileName) {
//		try (FileInputStream fis = new FileInputStream(hw7_3FileName);
//				FileOutputStream fos = new FileOutputStream(hw7_3_1FileName)) {
//			byte[] buffer = new byte[1024];
//			int bytesRead;
//
//			while ((bytesRead = fis.read(buffer)) != -1) {
//				fos.write(buffer, 0, bytesRead);
//                //確保將緩衝區中的內容寫入檔案而不保留在緩衝區中。
//				fos.flush();
//			}
//			System.out.println("檔案複製成功！");
//		} catch (IOException e) {
//			System.err.println("發生錯誤： " + e.getMessage());
//		}
//	}
//}

//	第四題:請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡(注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾)。

//	第五題:承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何(請利用多型簡化本題的程式設計)。


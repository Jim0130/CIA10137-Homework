package hw8;

/*	第一題:請建立一個Collection物件並將以下資料加入:
Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
• 移除不是java.lang.Number相關的物件
• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成 */

//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//public class hw8_37 {
//
//	public static void main(String[] args) {
//		 Collection<Object> collection = new ArrayList();
//	        collection.add(Integer.valueOf(100));
//	        collection.add(Double.valueOf(3.14));
//	        collection.add(Long.valueOf(21L));
//	        collection.add(Short.valueOf("100"));
//	        collection.add(Double.valueOf(5.1));
//	        collection.add("Kitty");
//	        collection.add(Integer.valueOf(100));
//	        collection.add(new Object());
//	        collection.add("Snoopy");
//	        collection.add(new BigInteger("1000"));
//
//	        // 1.使用Iterator印出這個物件裡的所有元素。
//	        System.out.println("使用Iterator印出所有元素: ");
//	        Iterator<Object> iterator = collection.iterator();
//	        while (iterator.hasNext()) {
//	            System.out.println(iterator.next());
//	        }
//
//	        System.out.println("=============================");
//	        
//	        // 2.使用傳統for印出這個物件裡的所有元素。
//	        System.out.println("使用傳統for迴圈印出所有元素: ");
//	        Object[] array = collection.toArray();
//	        for (int i = 0; i < array.length; i++) {
//	            System.out.println(array[i]);
//	        }
//
//	        System.out.println("=============================");
//	        
//	        // 3.使用傳統foreach印出這個物件裡的所有元素。
//	        System.out.println("使用傳統foreach迴圈印出所有元素: ");
//	        for (Object obj : collection) {
//	            System.out.println(obj);
//	        }
//
//	        System.out.println("=============================");
//	        
//	        // 移除不是java.lang.Number相關的物件。
//	        Iterator<Object> removeIterator = collection.iterator();
//	        while (removeIterator.hasNext()) {
//	            Object obj = removeIterator.next();
//	            if (!(obj instanceof Number)) {
//	                removeIterator.remove();
//	            }
//	        }
//
//	        // 再次印出所有元素。
//	        System.out.println("移除非Number相關的物件元素：");
//	        for (Object obj : collection) {
//	            System.out.println(obj);
//	        }
//	}
//}

/*	第二題:請設計一個Train類別,並包含以下屬性:
- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
- 目的地 dest,型別為String - 票價 price,型別為double

   設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
需使用的集合裡
- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
- (1254, “區間”, “屏東”, “基隆”, 700)
- (118, “自強”, “高雄”, “台北”, 500)
- (1288, “區間”, “新竹”, “基隆”, 400)
- (122, “自強”, “台中”, “花蓮”, 600)
- (1222, “區間”, “樹林”, 七堵, 300)
- (1254, “區間”, “屏東”, “基隆”, 700)

• 請寫一隻程式,能印出不重複的Train物件(請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)*/

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//public class hw8_37 {
//	
//	public static void main(String[] args) {
//		
//		List<Train> trains = new ArrayList();
//
//        Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//        Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
//        Train train3 = new Train(118, "自強", "高雄", "台北", 500);
//        Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
//        Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
//        Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
//        Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
//
//        trains.add(train1);
//        trains.add(train2);
//        trains.add(train3);
//        trains.add(train4);
//        trains.add(train5);
//        trains.add(train6);
//        trains.add(train7);
//
//        // 使用Set去除重複的Train物件
//        Set<Train> uniqueTrains = new HashSet<>(trains);
//
//        // 印出不重複的Train物件(使用迭代器（iterator）)
//        System.out.println("使用Iterator印出不重複的Train物件: ");
//        Iterator<Train> iterator = uniqueTrains.iterator();
//        while (iterator.hasNext()) {
//            Train train = iterator.next();
//            System.out.println(train);
//        }
//
//        System.out.println("===========================================");
//        // 印出不重複的Train物件(使用傳統for)
//        System.out.println("使用傳統for迴圈印出不重複的Train物件: ");
//        Object[] array = uniqueTrains.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        System.out.println("===========================================");
//        // 印出不重複的Train物件(使用foreach)
//        System.out.println("使用foreach迴圈印出不重複的Train物件: ");
//        for (Train train : uniqueTrains) {
//            System.out.println(train);
//        }
//    }
//}

/*
- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
- (1254, “區間”, “屏東”, “基隆”, 700)
- (118, “自強”, “高雄”, “台北”, 500)
- (1288, “區間”, “新竹”, “基隆”, 400)
- (122, “自強”, “台中”, “花蓮”, 600)
- (1222, “區間”, “樹林”, 七堵, 300)
- (1254, “區間”, “屏東”, “基隆”, 700)

• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出(請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)*/

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//public class hw8_37 {
//
//	public static void main(String[] args) {
//
//		List<Train> trains = new ArrayList();
//
//		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
//		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
//		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
//		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
//		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
//		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
//
//		trains.add(train1);
//		trains.add(train2);
//		trains.add(train3);
//		trains.add(train4);
//		trains.add(train5);
//		trains.add(train6);
//		trains.add(train7);
//
//// Train物件以班次編號由大到小排序
//		Collections.sort(trains);
//
//// 班次編號由大到小印出的Train物件(使用迭代器(iterator)) :
//		System.out.println("使用Iterator且班次編號由大到小印出的Train物件: ");
//		Iterator<Train> iterator = trains.iterator();
//		while (iterator.hasNext()) {
//			Train train = iterator.next();
//			System.out.println(train);
//		}
//
//		System.out.println("==========================================");
//// 班次編號由大到小印出的Train物件(使用傳統for) :
//		System.out.println("使用for迴圈且班次編號由大到小印出的Train物件: ");
//		Object[] array = trains.toArray();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//
//		System.out.println("==========================================");
//// 班次編號由大到小印出的Train物件(使用foreach)
//		System.out.println("使用foreach迴圈且班次編號由大到小印出的Train物件: ");
//		for (Train train : trains) {
//			System.out.println(train);
//		}
//	}
//}

/*
 * - (202, “普悠瑪”, “樹林”, “花蓮”, 400) - (1254, “區間”, “屏東”, “基隆”, 700) - (118, “自強”,
 * “高雄”, “台北”, 500) - (1288, “區間”, “新竹”, “基隆”, 400) - (122, “自強”, “台中”, “花蓮”,
 * 600) - (1222, “區間”, “樹林”, 七堵, 300) - (1254, “區間”, “屏東”, “基隆”, 700)
 * 
 * • 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件(請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class hw8_37 {

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<>();

		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		trains.add(train5);
		trains.add(train6);
		trains.add(train7);

// Train物件以班次編號由大到小排序
		Collections.sort(trains);

// 使用TreeSet集合排序並不重複印出Train物件
		TreeSet<Train> uniqueTrainsSorted = new TreeSet<>(new Comparator<Train>() {
			// 使用匿名類別實現Comparator介面的方式：
			@Override
			public int compare(Train t1, Train t2) {
				return Integer.compare(t2.getNumber(), t1.getNumber());
			}
		});
		uniqueTrainsSorted.addAll(trains);

// 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用迭代器(iterator)) :
		System.out.println("使用Iterator不僅能讓班次編號由大排到小，還可以不重複Train物件: ");
		Iterator<Train> iterator = uniqueTrainsSorted.iterator();
		while (iterator.hasNext()) {
			Train train = iterator.next();
			System.out.println(train);
		}

		System.out.println("===================================================");
// 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用傳統for) :
		System.out.println("使用for迴圈不僅能讓班次編號由大排到小，還可以不重複Train物件: ");
		Object[] array = uniqueTrainsSorted.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("===================================================");
// 不僅能讓班次編號由大排到小， 還可以不重複Train物件(使用foreach)
		System.out.println("使用foreach迴圈不僅能讓班次編號由大排到小，還可以不重複Train物件: ");
		for (Train train : uniqueTrainsSorted) {
			System.out.println(train);
		}
	}
}
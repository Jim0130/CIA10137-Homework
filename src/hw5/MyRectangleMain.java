package hw5;

/*第四題-2:請另外建立一個MyRectangleMain類別,此類別只有main方法
(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
(2) 使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果。*/

public class MyRectangleMain {
	
	public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle();
        myRectangle.setWidth(10);
        myRectangle.setDepth(20);
        System.out.println(myRectangle.getArea());

        MyRectangle myRectangle1 = new MyRectangle(10, 20);
        System.out.println(myRectangle1.getArea());
    }
}
package chap01;

public class constance {
    public static void main (String[] args){

        final int WIDTH = 30;
        final int HEIGHT = 10;

        int triangleArea = (WIDTH * HEIGHT) / 2;
        int rectangleArea = WIDTH * HEIGHT;
        int total = triangleArea+rectangleArea;

        System.out.println("triangle:" + triangleArea);
        System.out.println("rectangle:" + rectangleArea);
        System.out.printf("total:%d", total);

    }
}

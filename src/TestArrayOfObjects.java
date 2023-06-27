public class TestArrayOfObjects {
    public static void main(String[] args) {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle();
        }
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i].setRadius((int) (Math.random() * 10));
        }
        nPrintArrayOfObjectsRadius(circleArray);
        System.out.println(" ");
        nPrintArrayOfObjectsArea(circleArray);
        printTotalArea(circleArray);
    }

    public static void nPrintArrayOfObjectsRadius(Circle[] circles) {
        for (int i = 0; i < circles.length; i++) {
            System.out.println("The radius of circle: " + (i + 1) + " is: " + circles[i].getRadius());
        }
    }

    public static void nPrintArrayOfObjectsArea(Circle[] circles) {
        for (int i = 0; i < circles.length; i++) {
            System.out.println("The area of circle: " + (i + 1) + " is: " + circles[i].getArea());
        }
    }

    public static void printTotalArea(Circle[] circles) {
        double total = 0;
        for (int i = 0; i < circles.length; i++) {
            total += circles[i].getArea();
        }
        System.out.println("The total Area is: " + total);
    }
}
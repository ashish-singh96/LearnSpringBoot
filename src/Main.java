// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Square square1=new Square(3);
//        AreaCalculator areaCalculator=new AreaCalculator(square1);
//        areaCalculator.printArea();

        Triangle t1=new Triangle(4,5);
        AreaCalculator areaCalculator =new AreaCalculator(t1);
        areaCalculator.printArea(false);

    }
}
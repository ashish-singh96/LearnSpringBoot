
public class AreaCalculator {

    Square square;
    Triangle triangle;

    public  AreaCalculator(Square square){
        this.square=square;
    }

    public  AreaCalculator(Triangle triangle){ this.triangle=triangle;}

    public void printArea(boolean flag){
        if(flag){
            System.out.println(square.getSide()*square.getSide());
        }else {
            System.out.println(triangle.getHeight()*triangle.getBase());
        }

    }

}

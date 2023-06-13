
public class AreaCalculator {

    Square square;

    public  AreaCalculator(Square square){
        this.square=square;
    }

    public void printArea(){
        System.out.println(square.getSide()*square.getSide());
    }

}

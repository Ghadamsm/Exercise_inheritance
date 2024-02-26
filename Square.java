public class Square extends Rectangle{



    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }



    public double getSide (){

        double side = getLength() * getLength() ;


        return side ;
    }




}

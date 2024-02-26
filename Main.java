
public class Main {
    public static void main(String[] args) {



        Circle c1 = new Circle("green" , true , 1.0);
        Circle c2 = new Circle("green" , true , 2.0);
        Circle c3 = new Circle("green" , true , 3.0);


        System.out.println("Circle : ");
        System.out.println("1- Area : " + c1.getArea() + "\n1- Perimeter : " + c1.getPerimeter());
        System.out.println("2- Area : " + c2.getArea() + "\n2- Perimeter : " + c2.getPerimeter());
        System.out.println("3- Area : " + c3.getArea() + "\n3- Perimeter : " + c3.getPerimeter() + "\n \n ");





        Rectangle R1 = new Rectangle("green" , true , 1.0 , 1.0 );
        Rectangle R2 = new Rectangle("green" , true , 2.0 , 3.0);
        Rectangle R3 = new Rectangle("green" , true , 3.0 , 4.0);


        System.out.println( "---------------------------------------" + "\n" + "Rectangle : ");
        System.out.println("1- Area : " + R1.getArea() + "\n1- Perimeter : " + R1.getPerimeter()) ;
        System.out.println("2- Area : " + R2.getArea() + "\n2- Perimeter : " + R2.getPerimeter()) ;
        System.out.println("3- Area : " + R3.getArea() + "\n3- Perimeter : " + R3.getPerimeter()+ "\n \n ") ;





        Square s1 = new Square("green" , true , 1.0 , 4);
        Square s2 = new Square("green" , true , 0 , 2);
        Square s3 = new Square("green" , true , 0 , 6);


        System.out.println( "---------------------------------------" + "\n" +"Square : ");
        System.out.println("1- " + s1.getSide());
        System.out.println("2- " + s2.getSide());
        System.out.println("3- " + s3.getSide());
    }
}
import java.util.Scanner;
public class Shapearea {
    void area(float x){
        System.out.print("\nThe area of square is "+Math.pow(x,2)+" sq units\n");
    }
    void area(float x,float y){
        System.out.print("The area of rectangle is "+x*y+" sq units\n");
    }
    void area(double x){
        double z=3.14*x*x;
        System.out.print("The area of the circle is "+z+" sq units\n" );
    }
}
class Overload{
    public static void main(String args[]){
        float s,l,b;
        double r;
        Scanner reader=new Scanner(System.in);
        Shapearea obj=new Shapearea();
        System.out.print("Enter the side of square: ");
        s=reader.nextFloat();
        System.out.print("Enter the length of rectangle: ");
        l=reader.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        b=reader.nextFloat();
        System.out.print("Enter the radius of circle: ");
        r=reader.nextDouble();
        obj.area(s);
       obj.area(l,b);
        obj.area(r);
    }
}

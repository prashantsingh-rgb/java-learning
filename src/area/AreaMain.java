package area;

class Area{
    Area(String m){
        System.out.println("this is area constructor");
        System.out.println(m);
    }
    int r,l,b;
    void getArea(){
        System.out.println("This is area class");
    }
}
 class Circle extends Area{
    Circle(int r){
        super("This is area Constructor");
        super.r=r;
    }
void getCircleArea(){
    double result = Math.PI *super.r * this.r;
    System.out.println("Area of circle="+result);
}
 }

public class AreaMain {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        c.getArea();
        c.getCircleArea();

        Area a = new Circle(34);
        a.getArea();   //UpCasting
//        Circle c = (Circle) new Area("abc");
//        c.getArea(); //DownCasting
//        c.getCircleArea();
    }
}

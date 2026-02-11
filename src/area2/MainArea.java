package area2;

abstract class Area{
    abstract void getArea();
}

class Rectangle extends Area{

    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
void getArea(){
 int r=l*b;
    System.out.println("Area of Rectangle ="+r);

}

void displayResult(){
    System.out.println("This is Display Function in rectangle");
}
}
public class MainArea {

    public static void main(String[] args) {
      Rectangle r1 = new Rectangle(24,26);
      r1.getArea();
    }
}

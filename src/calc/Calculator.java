package calc;

import java.sql.SQLOutput;

class Sum{
    int num1,num2;
    Sum(){
        //user defined default constructor
        this(10,10);
    }
    Sum(int num1,int num2){
     this.num1=num1;
     this.num2=num2;
    }
    void getSum(){
        System.out.println("Sum "+(num1+num2));
    }
}

class Multiple{
     void getAns(int a, int b){
         System.out.println(a*b);
     }
}
public class Calculator {
    public static void main(String[] args) {
      Sum s1;  //Object declaration;
      s1=new Sum(23,34); // Object  instantiation
      s1.getSum();
      new Sum(24,67).getSum();

    Multiple m1= new Multiple();
    m1.getAns(4,3);
    }
    
}

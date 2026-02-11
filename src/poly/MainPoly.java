package poly;

class Animal{
    String name;
    String sound;
    void makeSound(){
        System.out.println("This is Animal Class");
    }
    void display(){
        String result = String.format("Name=%s and Sound =%s",name,sound);
        System.out.println(result);
    }

}
class Cat extends Animal{
    int legs;
    Cat(String name,String sound, int legs){
        super.name=name;
        super.sound=sound;
        this.legs=legs;
    }
   void makeSound()
}
public class MainPoly {
}

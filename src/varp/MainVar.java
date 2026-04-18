package varp;

class Message{
    void getMessage(){
        System.out.println("This is called by Var!");
    }
}

public class MainVar {
    public static void main(String[] args) {

        String msg="""
                This is line 1
                This is line 2
                This is line 3
                This is line 4
                """;
                System.out.println(msg);




    //     var m= new Message();
    //     m.getMessage();
    //     var r="Java 10";
    //    var n1=10.50;
    //    var n2=20;
    //    var s=n1+n2;
    //     System.out.println("Sum="+s);
    }
}

package switchex;

public class MainSwitchEx {
    public static void main(String[] args) {
        int day = 1;
        String result=switch(day){
            case 1,7-> {
            System.out.println("thisis 1 & 7 case");
            yield "Monday";
        }
            case 2,3,4-> "Tuesday";
        default-> "NO Day";
        };
        System.out.println(result);
    }
}

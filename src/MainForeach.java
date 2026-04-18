import java.util.Arrays;
import java.util.List;

public class MainForeach {

    public static void main(String[] args) {
        int data[]=new int[] {12,34,5,66,78,45};
        List<int[]> listData= Arrays.asList(data);
        System.out.println(listData.get(0)[0]);
    }
}
package blog1;

import java.util.Arrays;
import java.util.List;

public class LIstExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,2,1,4,5,6,7);

        for(Integer integer : list){
            System.out.println(integer);
        }

    }

}

package blog1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        //List 생성 1
        List<String> list1 = Arrays.asList("Lars", "Simon");

        //List 생성 2
        List<String> list2 = new ArrayList<>();
        list2.add("Lars");
        list2.add("Simon");

        //메소드 참조를 이용해서 콘솔에 출력
        list1.forEach(System.out::println);
        list2.forEach(System.out::println);



    }

}

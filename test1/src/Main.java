import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arge){
        List<String> names = Arrays.asList("test", "test1","test2");
        long count = 0;

        /*for(String name : names){
            if(name.contains("es")){
                count++;
            }
        }*/

        names.stream().filter(name -> name.contains("es"));

        count = names.stream().filter(name -> name.contains("es")).count();
        System.out.println("Count : " + count); //3

    }


    /*public static void main(String[] arge){
        *//*System.out.println("aaa");
        Goods com = new Computer();
        com.cal(3,4);
        com.cal2(3,4);*//*

        //Goods com = (int num1, int num2) -> {return num1 + num2; };
//        Goods com = (num1, num2) -> {return num1 + num2; };
        Goods com = (num1, num2) ->  num1 + num2;

        System.out.println(com.cal(3, 4));
    }*/
}

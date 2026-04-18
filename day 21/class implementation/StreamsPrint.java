import java.util.*;

public class StreamsPrint{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list=Arrays.asList(1,2,3,4,5);
        // for(int i:list){
        //     System.out.println(i);
        // }


        // list.stream().forEach(System.out::println);

        // list.stream().filter(i->i%2!=0).forEach(System.out::println);

        // list.stream().filter(i->i%2!=0).map(i->i*i).forEach(System.out::println);

        // System.out.println(list.stream()
        //     .filter(i->i%2!=0)
        //     .map(i->i*i)
        //     .reduce(0,Integer::sum));

        int sum=list.stream()
            .filter(i->i%2!=0)
            .map(i->i*i)
            .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger= new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(10);

        for(int i=0; i<listInteger.getSize();i++){
            System.out.println("element "+ i+": "+ listInteger.get(i));
        }

        listInteger.get(6);    // out of bound
        System.out.print("element 6: "+ listInteger.get(6));
        listInteger.get(-1);
        System.out.print("element 6: "+ listInteger.get(-1));




    }
}

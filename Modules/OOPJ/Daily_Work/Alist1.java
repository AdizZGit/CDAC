package pack_1;

import java.util.ArrayList;

public class Alist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Yo...");
        for (Integer e : list) {
            System.out.print(e+ " ");
        }
    }
}

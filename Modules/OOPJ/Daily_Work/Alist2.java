package pack_1;

import java.util.ArrayList;

class Alist {
    
    public static ArrayList<String> getStringList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        return list;  
    }
    
    public static ArrayList<Double> getDoubleList() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.1);
        list.add(2.1);
        list.add(3.1);
        list.add(4.1);
        return list;
    }
    
    public static void printDoubleList(ArrayList<Double> list) {
        for (Double element : list) {
            System.out.println(element);
        }
    }
    
    public static void printStringList(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}

public class Alist2 {
    public static void main(String[] args) {
    
        ArrayList<String> stringList = Alist.getStringList();
        Alist.printStringList(stringList);
        
       
        ArrayList<Double> doubleList = Alist.getDoubleList();
        Alist.printDoubleList(doubleList);
    }
}

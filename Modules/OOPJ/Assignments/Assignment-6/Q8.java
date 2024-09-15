/*8.use getter and setter methods instead of acceptRecord and printRecord.
 * 
 * 
 */
package pack_7;
import java.util.Scanner;
class A{
    private int arr[];
    public A(int size){
        arr = new int[size];
    }
    public void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ener 5 Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public int[] getA(){
        return arr;
    } 
    public void print(){
         System.out.println("The Array Elements Are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
public class Q8{
    public static void main(String args[]){
        A a=new A(5);
        a.set();
        a.print();
    }
}

/*Output
 * Ener 5 Array Elements
4
5
6
7
8
The Array Elements Are
4
5
6
7
8

 */
 * 
 * /
 */
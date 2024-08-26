public class SumOfDigits {
    public static void main(String[] args) {
      int num=9876;
      int rem ,sum=0;
      while(num>0){
       rem=num%10;
       sum+=rem;
       num=num/10;
      
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}

/* rem=6,7,8,9
	sum=(6,13,21,30)
	num=987,98,9,0*/
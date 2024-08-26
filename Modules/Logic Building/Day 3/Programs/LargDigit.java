public class LargDigit{
 public static void main(String[] args) {
	int num=4825;
	int max=0 ,min=9, rem=0;  //max=0 if any no. is > than 0 then that no is max . if any no is small than 9 then thaat number is min
	while(num>0){
	rem=num%10;
	if(rem>max){ 
	max=rem;}
	if(rem<min){
	min=rem;}
	num/=10;
	}
	System.out.println("Largest Digit: "+max);System.out.println("Smallest Digit: "+min);
 }




}

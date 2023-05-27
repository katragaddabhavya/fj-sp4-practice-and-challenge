import java.util.Scanner;
public class SumofEvenOdd {
    public static void main(String[] args) 
    {
        int num;
		 int sumE = 0; 
		 int sumO = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  eight digit number :");
        num = sc.nextInt();
     while (num!=0){
			int reminder= num%10;
			if (reminder%2==0){
				sumE=sumE+reminder;
			}else{
				sumO=sumO+reminder;
			}
			num=num/10;
		}
       
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}
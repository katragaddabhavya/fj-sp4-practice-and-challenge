import java.util.Scanner;


public class AddNumber {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int num=1;
		int sum=0;
		for (num=1;num<=100;num++){
            sum=sum+num;
		}
			System.out.println("sum:"+sum);

		}
}

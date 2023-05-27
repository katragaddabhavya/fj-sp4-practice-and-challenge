import java.util.Scanner;

public class WatAPizza {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the details");
		System.out.println("customername");
		String customername= sc.next();
		System.out.println("customeremail");
		String customeremail= sc.next();
		System.out.println("phonenumber");
	    long phonenumber= sc.nextLong();
		System.out.println("address");
		String address= sc.next();
//TASK2
		int pizzaordered;
		float  priceofpizza= 12.99f;
		char pizzasize='M';
		int garlicbreadordered;
      	float  priceofgarlicbreadordered=5.99f;
		 int beveragesordered;
      	float priceofbeverages=1.99f;
		  int choice1;
		  float totalbill;
		  int a;
		
		  float pizzatotalbill=0;
		  float garlicbreadtotalbill=0;
		  float beveragestotalbill=0;
		  do {

		 System.out.println("1. Pizza");
		 System.out.println("2. garlicbread");
		System.out.println("3. beverages");
		System.out.println(" enter 1. Pizza , 2.garlicbread, 3.bevereges");
		 choice1= sc.nextInt();
		switch(choice1){
			case 1:
				{
				System.out.println("number of pizzaordered");
					 pizzaordered=sc.nextInt();
	            pizzatotalbill= pizzaordered*priceofpizza;
			  
				System.out.println("your pizzatotalbill is:"+pizzatotalbill);	
						}
			break;
			case 2:
					{
						System.out.println("number of garlicbreadordered");
					 garlicbreadordered=sc.nextInt();
	            garlicbreadtotalbill= garlicbreadordered*priceofgarlicbreadordered;
			  
				System.out.println("your garlicbreadtotalbill is:"+garlicbreadtotalbill);	
						}
			break;
			case 3:
				{
					System.out.println("number of beveragesordered");
					 beveragesordered=sc.nextInt();
	            beveragestotalbill= beveragesordered*priceofbeverages;
			  
				System.out.println("your beveragestotalbill is:"+beveragestotalbill);	
						}
			break;
			default:
			System.out.println("wrong choice entered");
		}
		totalbill=(pizzatotalbill+garlicbreadtotalbill+beveragestotalbill);
		System.out.println("Do you want to continue : 1-yes 0-No");
		a =sc.nextInt();
		  }while(a==1);
		  System.out.println("totalbill:" +totalbill);
		  if(totalbill>=50){
            double discount =(totalbill*0.1);
			double discountedamount=(totalbill-discount);
			System.out.println("the total discounted bill amount:");
		  }else{
			  System.out.println("No discount is provided since the discounted amount is less than 50:");
		  }
	}
}

package ohh;
import java.util.*;

public class Slice {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter amount of investment:");
   int f=sc.nextInt();
		
	    System.out.println("Enter interest you want Monthly:");
	    int r=sc.nextInt();     

	    System.out.println("Enter amount you want to add monthly:");
	    int j=sc.nextInt();
	     
		double in=0;  
		
	     in= f+(f*r/100);//10900  First month  total gain 10000 +900=10900
		
	     
	     double y=(f*r/100);//900  we got 9 percent intrest on 10000 for an month
		
		  
		
		//this will return 10900
		System.out.println("Total first month:"+in);
		
		//first month 
		System.out.println(y);
		
		double l=0;
		
		double temp=0;
		
		 double t=0;
		
		//for loop 
		for(int i=2; i<=4; i++) {
			  
       double x=in+j+l; //in=13900 j=3000 l=1251    
		System.out.println("Total amount="+x); //x=18151
        
		temp=x;//  temp=18151
        in=temp;   //in =18151
        
        //then
        //x=in+j+l; in=18151 +3000+1633  x=22784    
        //x values is assigned to in via temp and monthly 3000 increased
    
        l=(x)*9/100;
	
        System.out.println("Monthly interest earned ="+l);// 2month=1251 ,3month=1633 
        t+=l;

		}
		
		    System.out.println("total interest earned:"+(t+y) );
		 	
		
	}

}

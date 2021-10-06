import java.io.*;
import java.util.*;
class First{
public static void main(String args[]){
 	int numb;
 	int rem;
 	int temp;
 	int waste;
 	int tempsum=0;
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Enter a number");
 	numb=sc.nextInt();
 	
 	while(numb!=0){
 	rem=numb%10;
 	
 	if(rem%2!=0)
 	{
 	temp=rem;
 	tempsum=tempsum+rem;
 	//System.out.println("Sum of odd number:"+tempsum);
 	
 	
 	//System.out.println(rem);
 	}
 	else if(rem%2==0){
 	waste=rem;
 	//System.out.println("nothing");
 	}
 	
 	numb=numb/10;
 	}
 	System.out.println("Sum of odd number you have entered is:"+tempsum);
 	
 	

}
}


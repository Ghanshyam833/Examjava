import java.io.*;
import java.util.*;
class Numbers{

int lim;
int i;
int numb;
int high;
int low;
int sum=0;
void read(){
int arr1[]=new int arr1[lim];
System.out.println("Enter the limit");
Scanner sc=new Scanner(System.in);
lim=sc.nextInt();
for(i=0;i<lim;i++)
{
System.out.println("Enter a positive number:");
arr1[i]=sc.nextInt();
}
System.out.println(arr1[i]);
}
void highest(){
high=arr1[0];

for(i=0;i<lim;i++)
{

if(high<arr1[i])
{
high=arr1[i];
}
else{
high=arr1[0];
}
}
System.out.println("Highest of these numbers is:"+high);
}
void lowest(){
low=arr1[0];
for(i=0;i<lim;i++){

if(lowest>arr1[i])
{
low=arr1[i];
}
else{
low=arr1[0];
}
}
System.out.println("lowest number is:"+low);
}
void average(){
for(i=0;i<lim;i++)
{
sum=sum+i;
avg=(sum/lim);

}
System.out.println("the average of these numbers is:"+avg);
}
}

class Second{
public static void main(String args[]){
Numbers obj=new Numbers();
obj.read();
obj.highest();
obj.lowest();
obj.average();
}
}

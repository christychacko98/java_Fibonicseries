import java.util.Scanner;
class Fiboseries{  
public static void main(String args[])  
{    
 int a,b,c,i,count=10;  
 Scanner sc = new Scanner(System.in);  
 System.out.print("Enter value for a: ");  
   a = sc.nextInt();  
   System.out.print("Enter value for b : ");  
       b = sc.nextInt();  
         
 System.out.print(a+" "+b);  
    
 for(i=2;i<count;++i)
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
  
}}  

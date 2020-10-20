public class Fibonacci
{
  public static void main(String[] args)
{
System.out.println("The 10th terms of Finonacci series are as follows :");
int num1=0;
int num2=1;
System.out.println(num1);
System.out.println(num2);
int num3;
int count =2;
for(count = 2; count<10 ; count++){

num3=num1+num2;
System.out.println(num3);
num1=num2;
num2=num3;

}
}
}
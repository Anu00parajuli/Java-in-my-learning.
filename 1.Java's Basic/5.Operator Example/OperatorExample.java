class OperatorExample{
public static void main(String args[]){
System.out.println("Java Unary Operator");
int x = 10;
System.out.println("x++ : "+ x++); // 10 print huncha, but yo statement ma x ko value 11 huncha.
System.out.println("++x : "+ ++x); //11+1= 12, yesma x ko value 12 huncha.
System.out.println("x-- : "+ x--); //12 print huncha but yo statement ma x ko value 11 huncha.
System.out.println("--x : "+ --x); //11-1=10, yesma x ko value 10 huncha
System.out.println(x++ + ++x);//x ko value 10 cha, suru ko operator pachi x ko value 11 huncha, arko operator add garda 12 huncha , so total value 10+12=22 huncha.
System.out.println("Example of ! and tilde");
System.out.println(" ~x means (-x)-1 ");
System.out.println("~x  "+ ~x);
boolean y=true;
System.out.println("!y = "+ !y);
System.out.println("Left and Right Shift Operator");
System.out.println("10<<2" + 10<<2); // 10*2^2 left shift
System.out.println("10<<3" + 10<<3); // 10*2^3
System.out.println("10>>2" + 10>>2); // 10/2^2 right shift
System.out.println("10>>3" + 10>>3); // 10/2^3
System.out.println("Difference between >> and >>>");
 //For positive number, >> and >>> works same  
    System.out.println(20>>2);  //5
    System.out.println(20>>>2);  //5
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  //-5
    System.out.println(-20>>>2);  //1073741819


}//main
}//OperatorExample
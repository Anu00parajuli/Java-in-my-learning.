/* Java Labeled For Loop
  Syntax:
    labelname:
   for(initialization; condition to be checked ; increment/decrement){
     code to be executed
    }

 We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful if we have nested for loop so that we can break/continue specific for loop.

Usually, break and continue keywords breaks/continues the innermost for loop only.
*/

public class LabeledLoop{
public static void main(String []args){
 aa:
for(int i =1 ; i < 6 ; i++){
 bb:
 for (int j= 1; j <i ; j++){
 System.out.println("*");
if (i==2 && j==2 ){
break aa;
}
}//j
} //i
}//main
} //class
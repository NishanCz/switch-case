import java.util.*;
public class switchcase(){
public static void main(String[] args){
int choice;
System.out.println("Pick one: 1.Hi\t2. Hey\t3. Hello\t");
Scanner s= new Scanner(system.in);
choice= s.nextInt();
switch(choice);
{
case 1: System.out.println("You sai Hi");
break;
case 2: System.out.println("You sai Hey");
break;
case 3: System.out.println("You sai Hello");
break;
default:System.out.println("Invalid Choice");
}
}
}

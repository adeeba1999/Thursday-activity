import java.util.*;
class Switch2{
public static void main(String[] args){
int day;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the day number");
day=sc.nextInt();
switch(day)
{
case1:System.out.println("Monday");
      break;
case2:System.out.println("Tuesday");
      break;
case3:System.out.println("Wednesday");
      break;
case4:System.out.println("Thursday");
      break;
case5:System.out.println("Friday");
      break;
case6:System.out.println("Saturday");
      break;
case7:System.out.println("Sunday");
      break;
default:System.out.println("Invalid day number");
        break; 
}
}
}



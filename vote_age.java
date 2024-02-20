import java.util.Scanner;
class vote{
 public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = sc.nextInt();

if(age>=18)
System.out.println("Hurrah! You can Vote") ;
else
System.out.println("Sorry, You can't vote");
}}

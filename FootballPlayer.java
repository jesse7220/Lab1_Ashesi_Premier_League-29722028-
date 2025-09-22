import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args)
    {Scanner input = new Scanner(System.in);
String name;
int age;
double height;
double weight;
int jerseyNo;

System.out.print("Enter name of player");
name = input.nextLine();

System.out.print("Enter player age");
age=input.nextInt();

System.out.print("Enter height");
height=input.nextDouble();

System.out.print("Enter weight pounds");
weight=input.nextDouble();

System.out.print("Enter number on jersey")
jerseyNo=input.nextInt();

System.out.println("\n Details of Player ");
System.out.println("Name -" + name);
System.out.println("Age -" + age);
System.out.println("Height -" + height + "m");
System.out.println("Weight -" + weight + "lbs");
System.out.println("Jersery Number - " + jerseyNo);

input.close();
}
}


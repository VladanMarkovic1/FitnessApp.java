import java.util.Scanner;

public class overallHealthEbook {
static Scanner scanner = new Scanner(System.in);
static boolean exit = false;
    static void healthEbook(){

        while(!exit){
System.out.println("-------------------------------");
System.out.println("Chapters");
System.out.println("1.Training");
System.out.println("2.Nutrition");
System.out.println("3.Sleep");
System.out.println("4.Exit");
System.out.println("Which information do you need?");

int choice = scanner.nextInt();

switch(choice){
case 1:training.training();
break;
case 2:nutrition.nutrition();
break;
case 3:recovery.recovery();
break;
case 4:exit=true;
System.out.println("Exiting...");
}
        }

    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class goals{
    static void goals(){
        Scanner scanner = new Scanner(System.in);
boolean exit=false;

        Map<String, String[]> userGoals = new HashMap<>();
while(!exit){
    System.out.println("------------------------------------");
        System.out.println("1.Set your goals.");
        System.out.println("2.Display your goals");
        System.out.println("3.Edit your goals");
        System.out.println("4.Delete your goals");
        System.out.println("5.Exit");
        
        int choice = scanner.nextInt();

        switch(choice){
    
case 1:System.out.println("----------------------------");
System.out.println("Enter your username:");
String username= scanner. nextLine();
scanner.nextLine();
setGoals.setGoals(userGoals, username);
break;
case 2:System.out.println("---------------------------");
System.out.println("Enter your username:");
String displayUsername= scanner. nextLine();
scanner.nextLine();
displayGoals.displayGoals(userGoals,displayUsername);
break;
case 3:System.out.println("---------------------------");
System.out.println("Enter your username:");
String editUsername= scanner. nextLine();
scanner.nextLine();
editGoals.editGoals(userGoals, editUsername);
break;
case 4:System.out.println("----------------------------");
System.out.println("Enter your username:");
String deleteUsername = scanner.nextLine();
deleteGoals.deleteGoals(userGoals,deleteUsername);
break;
case 5:System.out.println("----------------------------");
 exit = true;
System.out.println("Exiting...");
        }
    }
    }
}
    
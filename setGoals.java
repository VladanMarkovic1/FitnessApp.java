import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class setGoals {

    static Scanner scanner = new Scanner(System.in);
static Map<String, String[]>userGoals = new HashMap<>();

    static void setGoals(Map<String, String[]> userGoals,String username){


        System.out.println("-------------------------------------------");
System.out.println("Write down number of your goals for today.");
System.out.println("You can write maximum 5 goals for one day!");

int numOfGoals = scanner.nextInt();
scanner.nextLine();

String goals [] = new String[numOfGoals];
for(int i=0;i<numOfGoals;i++){
System.out.println("Enter goal number " + (i+1) + " :");
goals[i]=scanner.nextLine();
}
userGoals.put(username, goals);
System.out.println("Goals set succesfully");
}
    }


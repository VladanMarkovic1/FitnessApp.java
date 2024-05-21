import java.util.Map;
import java.util.Scanner;

public class editGoals {
static Scanner scanner = new Scanner(System.in);

    static void editGoals (Map<String,String[]> userGoals,String username) {
if(!userGoals.containsKey(username)){
System.out.println("User not found!");
return;
}

String[] goals = userGoals.get(username);
System.out.println("Select number of goal you want to edit:");
for(int i=0;i<goals.length;i++ ) {
System.out.println((i+1) +"." + goals[i]);
}

int goalNumber = scanner.nextInt();
scanner.nextLine();

if(goalNumber<1 || goalNumber>goals.length){
System.out.println("Invalid goal number!");
return;
}

System.out.println("Enter new goal:");


goals[goalNumber - 1] = scanner.nextLine();
        System.out.println("Goal updated successfully!");
}

    }


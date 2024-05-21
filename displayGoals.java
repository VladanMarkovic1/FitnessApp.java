import java.util.Map;
import java.util.Scanner;

class displayGoals{
static Scanner scanner = new Scanner(System.in);

   

static void displayGoals(Map<String, String[]> userGoals,String username){
    if(!userGoals.containsKey(username)){
System.out.println("User not found!");
return;
    }
    String[] goals = userGoals.get(username);
    System.out.println("Today goals:" );
    for (int i = 0; i < goals.length; i++) {
        System.out.println((i + 1) + ". " + goals[i]);

    }
}
}
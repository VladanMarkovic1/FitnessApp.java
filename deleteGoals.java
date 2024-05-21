import java.util.Map;
import java.util.Scanner;

public class deleteGoals {
static Scanner scanner = new Scanner(System.in);

    static void deleteGoals(Map<String, String[]> userGoals, String username){
if(!userGoals.containsKey(username)){
    System.out.println("User not found!");
return;
}
System.out.println("Enter number of goal you want ");
String[] goals=userGoals.get(username);
for(int i = 0 ; i<goals.length; i++){
System.out.println((i+1) +"." + goals[i]);
}
int goalNumber=scanner.nextInt();
if(goalNumber<1 || goalNumber>goals.length){
System.out.println("Invalid number");
return;
}
String[] updatedGoals= new String[goals.length-1];
for(int i=0 ,j=0;i<goals.length;i++){
if(i != goalNumber-1){
updatedGoals[j++]=goals[i];
}
}
userGoals.put(username, updatedGoals);
System.out.println("Goal deleted succesfully");
    }
}

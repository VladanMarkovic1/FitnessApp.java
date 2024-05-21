import java.util.Scanner;

public class training {
    static void training(){
Scanner scanner = new Scanner(System.in);

System.out.println(" Regular exercise enhances cardiovascular health, strengthens muscles.");
System.out.println("Additionally, it boosts mood, reduces stress, and enhances cognitive function, promoting overall well-being.");
System.out.println("-------------------------------------------------------------------------------------");
System.out.println("Do you want free trainig plan? Yes/No");
String answer = scanner.next();
if(answer.equals("Yes")){
    System.out.println("-----------------------------------------------");
    System.out.println("Monday: Chest, Shoulders and Triceps workout");
    System.out.println("Tuesday: Back and biceps workout");
    System.out.println("Wednesday: Core and legs workout");
    System.out.println("Thursday: Active recovery");
    System.out.println("Friday: Push workout");
    System.out.println("Saturday: Pull workout");
    System.out.println("Sunday: Mobility workout");
}
else if(answer.equals("No")){
return;
}
}
}

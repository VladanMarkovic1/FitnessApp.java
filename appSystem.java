import java.util.Scanner;

public class appSystem {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Welcome to your fitness app!");
        System.out.println("In this app you can track your goals and learn something about muscles!");
        System.out.println("What interests you?");
        System.out.println("1.Tracking your goals");
        System.out.println("2.Overall health eBook ");
System.out.println("----------------------------------");

int choice = scanner.nextInt();

switch(choice){
case 1:goals.goals();
break;
case 2:overallHealthEbook.healthEbook();
}



    }
}

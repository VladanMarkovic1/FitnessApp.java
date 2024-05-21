import java.util.Scanner;

public class recovery {
    static void recovery(){
Scanner scanner = new Scanner(System.in);
while(true){
    System.out.println("--------------------------------");
System.out.println("Recovery for muscles.Enter 1");
System.out.println("Recovery for soul.Enter 2");
System.out.println("---------------------------------");

String recoveryOption = scanner.next();

if(recoveryOption.equals("1")){
System.out.println("1.Cold plunges");
System.out.println("2.Streching");
System.out.println("3.Foam roller");
System.out.println("4.Healthy nutrition");
System.out.println("5. 8 hours of sleep");
break;
    }
    else if(recoveryOption.equals("2")){
System.out.println("1.Praying");
System.out.println("2.Spemdimg time with family");
System.out.println("3.Spending time in nature");
System.out.println("4.Reading");
break;
    }
    else{
System.out.println("Invalid choice");
    }
    }
}
}

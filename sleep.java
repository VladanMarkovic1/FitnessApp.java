import java.util.Scanner;

public class sleep {
    static void sleep(){
Scanner scanner = new Scanner(System.in);

System.out.println("How many hours you sleep per day?Be honnest!");
int hoursOfSleep = scanner.nextInt();
if(hoursOfSleep<8){
 System.out.println("You must hear this before doing it again");   
 System.out.println("------------------------------------------------");
System.out.println("1.Reduced Cognitive Function: Insufficient sleep impairs your ability to concentrate, learn, and make decisions effectively");
System.out.println("2.Mood Swings: Sleep deprivation can lead to irritability, mood swings, and heightened stress levels.");
System.out.println("Over time, this can strain relationships and impact your emotional well-being.");
System.out.println("3.Weakened Immune System: Your body needs sleep to repair and strengthen its defenses against illness and infection.");
}
else if(hoursOfSleep>=8  || hoursOfSleep<=9) {
System.out.println("You are doing great job.Sleep is wery important!");
}
else{
System.out.println("Remember, your dreams won't come knocking if you're lost in slumber.");
System.out.println("Seize the day, awaken your ambitions, and chase after them with unwavering determination. ");
System.out.println("The world awaits your unique talents and contributions.");
System.out.println("Rise and shine, for today is the first day of the rest of your awakened life!");
}

    }
}

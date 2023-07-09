import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hoursWorked = new int[7];
        for (int i = 0; i < 7; i++) {
            hoursWorked[i] = sc.nextInt();
        }
        int hourlyRate = 100;
        int dailyhoursLimit = 8;
        int weeklyhourlimit = 40;
        int salary = 0;
        for (int i = 0; i < 7; i++) {
            int dailysalary = hoursWorked[i] * hourlyRate;
            if (hoursWorked[i] > dailyhoursLimit) {
                int extraHours = hoursWorked[i] - dailyhoursLimit;
                dailysalary += extraHours * 15;

            }
            salary += dailysalary;
        }
        int totalhours = calculateTotalHours(hoursWorked);
        if (totalhours > weeklyhourlimit) {
            int extraHours = totalhours - weeklyhourlimit;
            salary += extraHours * 25;
        }
        salary += calculateweekendBonus(hoursWorked);
        System.out.print(salary);
    }
    private static int calculateTotalHours(int[] hoursWorked){
        int totalhours=0;
        for(int i=0;i<7;i++){
            totalhours+=hoursWorked[i];
        }
        return totalhours;
    }
    private static int calculateweekendBonus(int[] hoursWorked){
        int sh=hoursWorked[6];
        int sunhours=hoursWorked[6];
        int weekendBonus=0;
        weekendBonus+=sh*0.25*100;
        weekendBonus+=sunhours*0.5*100;
        return   weekendBonus;
    }
}


// import java.time.LocalDate;
// import java.time.Period;
// import java.util.Scanner;

// public class AgeCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Birth year: ");
//         int y = sc.nextInt();
//         System.out.print("Birth month (1–12): ");
//         int m = sc.nextInt();
//         System.out.print("Birth day: ");
//         int d = sc.nextInt();
//         sc.close();

//         LocalDate birthDate = LocalDate.of(y, m, d);
//         LocalDate today = LocalDate.now();
//         Period diff = Period.between(birthDate, today);

//         System.out.printf("You are %d years, %d months, and %d days old.%n",
//                           diff.getYears(), diff.getMonths(), diff.getDays());
//     }
// }
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if age is 18 or more
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        scanner.close();
    }
}


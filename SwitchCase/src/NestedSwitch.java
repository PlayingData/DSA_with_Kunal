import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sundarapandyan");
            case 2 -> System.out.println("Anandha Krishnan");
            case 3 -> {
                System.out.println("Emp ID 3");
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter a correct EmpId");

        }
    }
}

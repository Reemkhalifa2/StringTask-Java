import java.util.Scanner;
public class StringMenuDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        while (true) {
            System.out.println();
            System.out.println("1. length of the string");
            System.out.println("2. convert the string to uppercase");
            System.out.println("3. convert the string to lowercase");
            System.out.println("4. check whether the string contains yes");
            System.out.println("5. compare the string with another string");
            System.out.println("0. exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(str.length());
                    break;
                case 2:
                    System.out.println(str.toUpperCase());
                    break;
                case 3:
                    System.out.println(str.toLowerCase());
                    break;
                case 4:
                    System.out.println(str.contains("yes"));
                    break;
                case 5:
                    System.out.println("Enter string to compare: ");
                    String str2 = sc.nextLine();
                    System.out.println(str.equalsIgnoreCase(str2));
                    break;
                case 0:
                    return;//exit the loop
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
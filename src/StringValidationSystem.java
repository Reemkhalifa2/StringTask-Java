import java.util.Scanner;
public class StringValidationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("str length: " +str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("lowercase: " + str.toLowerCase());
        System.out.println("Enter string: ");
        String str2 = sc.nextLine();
        System.out.println("is " +str + " contain " + str2 + " : " +str.contains(str2));

        System.out.println("Enter string: ");
        String str3 = sc.nextLine();
        System.out.println("is " +str + " equal to  " + str3 + " : " +str.equalsIgnoreCase(str3));

        System.out.println(str.substring(0,4));
        if(str.length()>5){
            System.out.println("String have more than 5 characters");
        }else{
            System.out.println("String is short");
        }
    }
}
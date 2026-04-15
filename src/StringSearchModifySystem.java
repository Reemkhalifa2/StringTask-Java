import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("Enter world to search for: ");
        String word = sc.nextLine();
        System.out.println("is str have " +word+" "+str.contains(word));
        String replaceWord = sc.nextLine();
        System.out.println(str.replace("a" ,replaceWord));
        System.out.println(str.substring(2,4));
        System.out.println(str.charAt(5));
        if(str.length()>8){
            System.out.println("String length more than 8 ");
        }else{
            System.out.println("string is short");
        }


    }
}

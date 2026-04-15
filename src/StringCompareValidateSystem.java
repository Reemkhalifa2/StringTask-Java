import javax.swing.plaf.synth.SynthLookAndFeel;
import java.security.*;
import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sample string: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("Enter word: ");
        String word =sc.next();
        System.out.println(str.equals(word));
        String prefix =sc.next();
        System.out.println(str.startsWith(prefix));
        String suffix =sc.next();
        System.out.println(str.endsWith(suffix));
        if(str.length()>8){
            System.out.println("str longer than 8");
        }else{
            System.out.println("str is short");
        }

    }
}

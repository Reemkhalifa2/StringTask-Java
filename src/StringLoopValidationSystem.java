import javax.swing.plaf.synth.SynthLookAndFeel;
import java.security.*;
import java.util.Scanner;

public class StringLoopValidationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sample string: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        Integer vowelsCounter = 0;
        for(int i=0; i<str.length();i++) {
            char ch =str.charAt(i);
            System.out.println(ch);
            if(ch =='a' || ch =='e' || ch =='i' || ch == 'o' || ch =='u'){
                vowelsCounter++;
            }
        }
        System.out.println("Vowels number: " + vowelsCounter);
        System.out.println("Enter word: ");
        String word =sc.next();
        System.out.println(str.contains(word));
        if(str.length()>10){
            System.out.println("str longer than 10");
        }else{
            System.out.println("str is short");
        }

    }
}

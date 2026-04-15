public class StringDoWhileDemo {
    public static void main(String[] args) {
        String str = "String Do While Demo";
        System.out.println(str);

        System.out.println(str.length());
        // integer variable to use as the loop counter
        Integer i =0;
        Integer lowerCaseCounter = 0;
        Integer spaceCounter = 0;
        do {
            char ch = str.charAt(i);
            System.out.println(ch);
            if(Character.isLowerCase(ch)){
                lowerCaseCounter++;
            }if(ch == ' '){
                spaceCounter++;
            }
            i++;
        }while (i<str.length());
        System.out.println("Number of LowerCase: " + lowerCaseCounter);
        System.out.println("Number of spaces: " + spaceCounter);


    }
}

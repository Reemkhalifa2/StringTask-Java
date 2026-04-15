public class StringWhileDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        // integer variable to use as the loop counter
        Integer i = 0;
        Integer spaceCounter = 0;
        Integer upperCaseCounter = 0;
        //while loop that runs while the counter is less than the length of the string
        while (i<str.length()){
            char ch = str.charAt(i);
            System.out.println(ch);
            if(ch == ' '){
                spaceCounter++;
            }
            if(Character.isUpperCase(ch)){
                upperCaseCounter++;
            }
            i++;
        }
        System.out.println("number of space in str: " + spaceCounter);
        System.out.println("number of upperCase in str: " + upperCaseCounter);
    }
}

public class StringCheckDemo {
    public static void main(String[] args) {
        String str = " Hello there";
        System.out.println(str);

        //substring() method to extract part of the message
        System.out.println(str.substring(0,5));

        // replace() method to change one word in the string
        System.out.println("replace there with every one: "+ str.replace("there" , "every one"));

        // contains() method to check whether the message includes a specific word
        System.out.println(str.contains("yes"));

        //Use the charAt() method to display a character at a specific position
        System.out.println(str.charAt(6));

        String str2 = "Welcome";
        System.out.println(str2);
        str2.replace("o", "*");


    }
}

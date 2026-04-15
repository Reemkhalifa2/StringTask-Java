public class StringCompareDemo {
    public static void main(String[] args) {
        String name = "Sara";

        System.out.println(" Name: "+ name);
        //charAt() method to display a character at a specific position
        System.out.println(name.charAt(2));

        //substring() method to extract part of the string
        System.out.println(name.substring(0,2));

        String name2 = "Noor";
        // equals() method to compare both strings
        System.out.println(name.equals(name2));

        String msg ="Hello";
        String msg2 = "Hello";
        System.out.println(msg.equals(msg2));



    }
}

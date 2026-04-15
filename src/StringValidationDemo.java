public class StringValidationDemo {
    public static void main(String[] args) {
        String str = " Hello there";
        System.out.println(str);

        //startsWith() method to check whether the string starts with a specific word
        System.out.println(str.startsWith("s"));

        //Use the endsWith() method to check whether the string ends with a specific word
        System.out.println(str.endsWith("Hi"));

        //replace() method to change one part of the string
        System.out.println(str.replace("l","|"));

        // substring() method to extract a part of the string
        System.out.println(str.substring(4,6));

        //ength() method to display the total number of characters in the string
        System.out.println(str.length());




    }
}

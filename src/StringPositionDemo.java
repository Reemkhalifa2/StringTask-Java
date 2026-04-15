public class StringPositionDemo {
    public static void main(String[] args) {
        String str = " Hello there";
        System.out.println(str);

        //indexOf() method to find the position of a character or word
        System.out.println("position of o" +str.indexOf("o"));

        // replace() method to change one word in the string
        System.out.println("replace there with every one: "+ str.replace("there" , "every one"));


    }
}

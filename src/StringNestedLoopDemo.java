public class StringNestedLoopDemo {
    public static void main(String[] args) {
        String str ="Hello";
        String str2 ="Welcome";
        System.out.println(str);
        System.out.println(str2);
        System.out.println("length of str 1: "+str.length());
        System.out.println("length of str 1: "+str2.length());
        Integer matchCounter = 0;

        for(int i=0; i<str.length();i++){
            for(int j=0; j<str2.length();j++){
                if(str.charAt(i) == str2.charAt(j)){
                    System.out.println(str.charAt(i));
                    matchCounter++;
                }

            }
        }
        System.out.println("Total matching characters: " + matchCounter);
        for(int i=0; i<str.length();i++){
            for(int j=0; j<str2.length();j++){
                    System.out.println(str.charAt(i));
                }
        }


    }
}

public class StringLoopDemo {
    public static void main(String[] args) {
        String str = "He1ll3o";
        System.out.println(str);

        Integer size = str.length();
        System.out.println(size);
        Integer count =0;
        Integer digit = 0;
        for(int i =0 ; i<size ; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count ++;
            }
            if(Character.isDigit(ch)){
                digit++;
            }
        }
        System.out.println("vowels:" + count);
        System.out.println("consonants:" + (size-count));
        System.out.println("Number of digits: " + digit);
    }
}

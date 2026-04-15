public class StringIfElseIfDemo {
    public static void main(String[] args) {
        String str ="StringIfElseIfDemo";
        if(str.isEmpty()){
            System.out.println("string is empty");
        }else if(str.length()<5){
            System.out.println("string is short");
        } else if (str.startsWith("Hi")) {
            System.out.println("str start with hi");
        }else if (str.endsWith("!!")) {
            System.out.println("str end with !!");
        } else if (str.equalsIgnoreCase("stringifElseifDemo")) {
            System.out.println("true");
        }else{
            System.out.println("The condition not applied");
        }
    }
}

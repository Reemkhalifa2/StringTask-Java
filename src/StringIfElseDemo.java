public class StringIfElseDemo {
    public static void main(String[] args) {
        String username = "user123";
        System.out.println(username);

        // check if the username length is greater than 5
        if(username.length()>5){
            System.out.println("Username is correct");
        }else{
            System.out.println("username is too short");
        }

        String password = "abc123";
        if(password.equals("password123")){
            System.out.println("password is correct");
        }else{
            System.out.println("password is incorrect ");
        }
        System.out.println(username.contains("@"));
        if(username.isEmpty()){
            System.out.println("Username is empty");
        }else{
            System.out.println("Username not empty");
        }

    }
}

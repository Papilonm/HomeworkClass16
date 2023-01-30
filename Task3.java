public class Task3 {
    //3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the class only where it was declared and executed by calling it is name

    private String mth(String str) {

        System.out.println(str.replaceAll("[^aeiouAEIOU]", ""));
        return str;
    }

    public static void main(String[] args) {
        Task3 mp=new Task3();
        mp.mth("cambodia");

    }
}

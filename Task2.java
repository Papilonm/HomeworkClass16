public class Task2 {
    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.



    public String mth (String str){
        StringBuilder strbd=new StringBuilder(str);
        String finalstring=strbd.reverse().toString();
        System.out.println(finalstring);
        return finalstring;
    }

    public static void main(String[] args) {
        Task2 mp=new Task2();
        mp.mth("Hola amigo");
    }
}

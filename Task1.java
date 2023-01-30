public class Task1 {
    //1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.

    int sumarr(int []arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }return sum;

    }


    public static void main(String[] args) {

        int[]arr={12,54,2,6,7};
Task1 mp=new Task1();

        System.out.println(mp.sumarr(arr));
    }
}

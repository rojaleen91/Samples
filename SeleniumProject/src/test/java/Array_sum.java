public class Array_sum {
    public static void main(String[] args) {
        int array[]={1,4,3,56,43};
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}

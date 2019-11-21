public class bubbleSorting {
    public static void main(String args[])
    {
        String before_bubble_sort[]={"k","l","a","p","c"};
        for(int i = 0; i<before_bubble_sort.length; i++)
        {
            for(int j=i+1;j<before_bubble_sort.length;j++)
            {
                if(before_bubble_sort[j].compareTo(before_bubble_sort[i])<0){
                  String temp;
                  temp=before_bubble_sort[i];
                  before_bubble_sort[i]=before_bubble_sort[j];
                  before_bubble_sort[j]=temp;

                }
            }
            System.out.println(before_bubble_sort[i]);
        }
    }
}

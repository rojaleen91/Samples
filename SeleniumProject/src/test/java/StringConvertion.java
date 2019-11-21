public class StringConvertion {
    public static void main(String args[]) {
        String str="123";
        //parseInt()
        int converted_string_parseint=Integer.parseInt(str);
        System.out.println(converted_string_parseint);
        //valueOf()
        int converted_string_valueof=Integer.valueOf(str);
        System.out.println(converted_string_valueof);
        int a=1234;
        String converted_a=Integer.toString(a);
        System.out.println(converted_a);
        String format=String.format("%d",a);
        System.out.println(format);
    }
    }


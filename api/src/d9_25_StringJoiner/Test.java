package d9_25_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");//间隔符
        joiner.add("a");
        joiner.add("b");
        joiner.add("c");
        System.out.println(joiner.toString());


        System.out.println(getArrayDate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static String getArrayDate(int[] arr)
    {
        if(arr == null || arr.length == 0){
            return null;
        }

        StringJoiner joiner = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            joiner.add(String.valueOf(arr[i]));

        }
        return joiner.toString();
    }
}

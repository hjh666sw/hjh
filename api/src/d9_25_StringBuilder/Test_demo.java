package d9_25_StringBuilder;

public class Test_demo{
    public static void main(String[] args) {

        //拼接案列
        System.out.println(getArrayDate(new int[]{1, 2, 3, 4, 5}));
    }
    public static String getArrayDate(int[] arr)
    {
        if(arr == null || arr.length == 0){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }
            else
            sb.append(arr[i]).append(",");
        }
        sb.append("]");
        return sb.toString();

    }
}

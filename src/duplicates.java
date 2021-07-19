public class duplicates {


    public static void main(String[] args) {
        int []arr={1,3,5,5,8,12,8,14};
        for (int g=0;g<arr.length;g++){
            for(int d=g+1;d<arr.length;d++){
                if(arr[g]==arr[d]) {
                    System.out.println(arr[g]);
                }
            }
        }
    }
}

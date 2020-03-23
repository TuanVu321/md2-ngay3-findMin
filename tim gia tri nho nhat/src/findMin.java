public class findMin {
    public static int minValue(int[]arr){
        int min=arr[0];
        int id=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                id = i;
            }
        }
        return id;
    }
    public static void main(String[] args) {
        int[] arr ={15,2,3,5,9,8,1,7,41,56};
        int index = minValue(arr);
        System.out.println(index);
    }
}

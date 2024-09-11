public class Solution {
    public static int findDuplicateNumber(int[] arr){
        int hare=arr[0];
        int tortoise=arr[0];
        do{
            tortoise=arr[tortoise];
            hare=arr[arr[hare]];
        }
        while(tortoise!=hare);
        tortoise=arr[0];
        while (tortoise!=hare){
            tortoise=arr[tortoise];
            hare=arr[hare];
        }
        return tortoise;
    }
    public static void main(String[] args){
        int[] arr={3,1,5,8,4,4,2};
        int duplicate=findDuplicateNumber(arr);
        System.out.println("Duplicate Number:"+duplicate);
    }
}

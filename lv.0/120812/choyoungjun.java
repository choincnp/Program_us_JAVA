import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1000];
        int answer = 0;
        int max = 0;
        int max1 = 0;
        for (int i=0;i<array.length;i++){
            arr[array[i]]++;
        };
        System.out.println(Arrays.toString(arr));
        for (int j=0;j<arr.length;j++){
            if (arr[j]>max){answer = j;
            max = arr[j];}
           else if (arr[j]==max){max1 = arr[j];}
           
       };
       System.out.println(answer);
       return (max==max1)? -1 : answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 11, 13, 12};
        int key;
        for(int i=1; i<arr.length;i++){
            key = arr[i];
            int j = i - 1;
            while(j>= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
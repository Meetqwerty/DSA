public class prac {

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pi=partion(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    
public static int partion(int[] arr,int low,int high){
    int  pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++){
        if(pivot>arr[j]){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;
    return i+1;
}
public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr,0,arr.length-1);

        System.out.println("\nAfter Quick Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

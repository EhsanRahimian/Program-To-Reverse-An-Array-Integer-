
package programtoreverseanarrayorstring;
/*
Given an array, the task is to reverse the array.

Iterative way :

1) Initialize start and end indexes as start = 0, end = n-1
2) In a while loop, swap arr[start] with arr[end] and change start and end as follows :
start = start +1, end = end – 1
*/


public class ProgramToReverseAnArray {
    public static void reverseArray(int arr[], int start, int end)
    {
        while(start<end)
        {
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();           
    }

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6};
        printArray(arr);
        System.out.print("Reversed array \n");
        reverseArray(arr,0,5);
        printArray(arr);
        
    }
    
}

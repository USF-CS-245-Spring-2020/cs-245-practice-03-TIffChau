public class BinaryRecursiveSearch implements Practice03Search
{
    int min, max;

    public int search(int [] arr, int target) {
        min = 0;
        max = arr.length - 1;
        return binsearch(arr, target, min, max);
    }

    public int binsearch(int [] arr, int target, int min, int max) {
        if (min>max)
        {
            return -1;
        }

        int mid = (min+max) / 2;
        if (target == arr[mid])
        {
            return mid;
        }

        else if (target > arr[mid]) 
        {
            return binsearch(arr,target,mid+1,max);
        }
        else
        {
            return binsearch(arr,target,min,mid-1);
        }
    }

    public String searchName() {
        return "Binary Recursive Search";
    }
}
package practice;

public class FindMissingNumber
{
	public static void main(String[] args) {
		 
		int[] arr1={7,5,6,1,4,2};
		System.out.println("Missing number from array arr1: "+missingNumber(arr1));
		int[] arr2={5,3,1,2};
		System.out.println("Missing number from array arr2: "+missingNumber(arr2));
 
	}
 
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
	}

}
/*static int search(int ar[],  
                  int size) 
{ 
    int a = 0, b = size - 1; 
    int mid = 0; 
    while ((b - a) > 1) 
    { 
        mid = (a + b) / 2; 
        if ((ar[a] - a) != (ar[mid] - mid)) 
            b = mid; 
        else if ((ar[b] - b) != (ar[mid] - mid)) 
            a = mid; 
    } 
    return (ar[mid] + 1); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int ar[] = { 1, 2, 3, 4, 5, 6, 8 }; 
    int size = ar.length; 
    System.out.println("Missing number: " + 
                        search(ar, size)); 
} 
} */
  

/*{
	int Sum;
	int Sum_N;

	public int missingNumber(int [] arrA, int size){
		Sum_N = size*(size+1)/2;		
		for(int i=0;i<arrA.length;i++){
			Sum +=arrA[i];
		}
		return Sum_N-Sum;
	}
	public static void main(String args[]){
		int [] arrA = {1,2,3,4,5,7,8,9,10};
		System.out.println("Missing number is :" + (new FindMissingNumber()).missingNumber(arrA,10));
	}
}*/

public class halfquery1 {
	public static int asd(int [] arr,int key){
		int min = 1;
		int max = arr.length;
		int mid =(max+min)/2;
		
		while(min<max)
		{
			mid = (max+min)/2;
			if(key<arr[mid])
				max = mid-1;
			else if(key>arr[mid])
				min = mid+1;
			else
				return mid;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr []= {1,5,8,9,45,78,79,80,81};
	    asd(arr, 9);
	System.out.println(asd(arr, 78));
		
	}

}


public class halfQuery {
public static void main(String[] args) {
	int arr []= {1,5,8,9,45,78,79,80,81};
   
System.out.println(sdf_search(arr,78));
}
	public static int sdf_search(int [] arr,int key){
		int min= 1;
		int max = arr.length;
		int mid;
		
		while(min<max){
			mid = (min+max)/2;
			if(key>arr[mid])
				min = mid+1;
			else if (key<arr[mid])
				max = mid-1;
			else 
				return mid;
			}
		return -1;
		}
		}
	



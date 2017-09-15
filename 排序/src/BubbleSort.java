
public class BubbleSort {
	 public static void main(String[] args) {
		int[]arr = {5,1,6,4,2,8,9};
		bubbleSort(arr);
	
		for(int s:arr){
			System.out.println(s);
		}
	}
public static void bubbleSort(int [] aasdf){
	for(int x = 0;x<aasdf.length-1;x++)
	{
		for(int y = 0;y<aasdf.length-x-1;y++)
		{
			if(aasdf[y]>aasdf[y+1])
			{
				int temp = aasdf[y];
				aasdf[y] = aasdf[y+1];
				aasdf[y+1] = temp;
			}
		}
	}
}


}
	
	
	
	
	
	

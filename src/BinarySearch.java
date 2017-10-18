import java.util.Arrays;

public class BinarySearch {
	
	public int iterative(int[] array,int l,int r,int search)
	{
		while(l<r&& search >=array[l]&& search<=array[r])
		{
			int mid=l+(r-l)/2;
			if(array[mid]==search)
				return mid;
			else if(search>array[mid])
			{
				l=mid+1;
			}
	
			else if(search<array[mid])
			{
				r=mid-1;
			}
		}
		return -1;
	}
	public int recursive(int[] array,int l,int r,int search)
	{
		if(r>=l&&search >=array[l]&&search<=array[r])
		{
			int mid=l+(r-l)/2;
			if(search==array[mid])
				return mid;
			if(search<array[mid])
				return recursive(array, l,mid-1, search);
			
			if(search>array[mid])
				return recursive(array, mid+1, r, search);
			
		}
		return -1;
	}
	

	public static void main(String[] args) 
	{
		BinarySearch binary=new BinarySearch();
		// TODO Auto-generated method stub
		int []array={1,2,3,10,5,6,7,9,8,4,11};
		Arrays.sort(array);
		int search=10;
		
		//int x=binary.recursive(array, 0, array.length-1, search);
		int x=binary.iterative(array, 0, array.length-1, search);
		if(x>0)
			System.out.println("Found"+x);
		else
			System.out.println("Not Found");
		
		
	}

}

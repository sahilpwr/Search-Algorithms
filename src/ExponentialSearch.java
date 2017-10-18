import java.util.Arrays;

public class ExponentialSearch {

	
	public int Exponential(int []array, int search)
	{
		int n=array.length;
		
		if(array[0]==search)
			return 0;
		int i=1;
		while(i<n && array[i]<=search)
			i*=2;
		return Arrays.binarySearch(array, i/2, Math.min(i, n), search);
	}
	public static void main(String[] args) {
		ExponentialSearch expo=new ExponentialSearch();
		
		int []array={1,2,3,10,5,6,7,9,4,8,11};
		Arrays.sort(array);
		int search=2;
		InterpolationSearch inter=new InterpolationSearch();
		int x=expo.Exponential(array, search);
		
		if(x>=0)
			System.out.println("Found"+x);
		else
			System.out.println("Not Found");

	}

}

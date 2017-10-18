import java.util.Arrays;

public class InterpolationSearch {

	public int Interpolation(int []array,int l,int r,int search)
	{
		
		while(r>=l&& search >=array[l]&&search<=array[r])
		{
			int pos=l+(search-array[l])*((r-l)/(array[r]-array[l]));
			if(array[pos]==search)
				return pos;
			else if(search<array[pos])
				r=pos-1;
			else if(search>array[pos])
				l=pos+1;
			
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
	
		int []array={1,2,3,10,5,6,7,9,4,8,11};
		Arrays.sort(array);
		int search=11;
		InterpolationSearch inter=new InterpolationSearch();
		int x=inter.Interpolation(array, 0, array.length-1, search);
		if(x>=0)
			System.out.println("Found"+x);
		else
			System.out.println("Not Found");
		
	}

}

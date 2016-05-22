package csd.blr;

public class Largest {

	public int find(int[] arr) throws Exception {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		if(arr.length<=0)
			throw new Exception("Arr is empty.");
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]){
				max = arr[i];
			}
		}
		
		return max;
	}

}

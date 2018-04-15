package program1;

public class mergeArray
{

	public static void main(String[] args) 
	{
		 int sum=0;	
int[] arr1={1,2,3,5};
int[] arr2={1,2,3,5,7,8};

for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		if(arr1[i]==arr2[j])
		{
			System.out.println(arr1[i]);
			//System.out.println("sum"+arr1[i]);
		
		}
		
		
	}
	 sum=arr1[i]+arr1[i];	
	 System.out.println("sum"+sum);
	
}


	}
	

}

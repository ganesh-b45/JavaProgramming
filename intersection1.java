import java.util.*;
 abstract class Array_intersection_and_union1
{
  int arr1[],arr2[];

  void setarray(int[] arr1, int[] arr2) {
	this.arr1 = arr1;
	this.arr2 = arr2;
}
 abstract int[] getResultantArray();
}
class intersection extends Array_intersection_and_union1
{

	
        int res[]=new int[5];
	int[] getResultantArray() {
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;i<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					res[i]=arr1[i];
				}
			}
		}
		return res;
	}
	
}
class intersection1
{
	public static void main(String args[])
	{
		int a1[]= new int[] {1,2,3,4,5};
		int a2[]= new int[] {3,4,5,6,7};
		 intersection obj=new intersection();
		obj.setarray(a1, a2);
		int [] result=obj.getResultantArray();
		for(int i=0;i<result.length;i++)
{

                 System.out.println(result[i]);


}
		
	}
}
	 
	 
	 
	 
	 
	 
	 
	 

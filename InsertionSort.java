public class InsertionSort implements Practice03Sort
	{
		public void sort(int[] a)
		{
			for(int i=0;i<a.length;i++)
			{
				int temp=a[i];
				int j=i-1;
				while(temp<a[j]&&j>=0)
				{
					a[j+1]=a[j];
					--j;
				}
				--j;
			}
		}
	}
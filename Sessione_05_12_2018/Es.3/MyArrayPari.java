public class MyArrayPari{
	public static boolean isPari(int [] a){
		for (int i=0; i<a.length; i++) {
			int count=0;
			for (int j=0; j<a.length; j++)
				if(a[i]==a[j]) count++;
			if(count % 2 != 0) return false;
		}
		return true;
	}
}
public class MyArrayExternal{
	public static int[] external (int[]a){
		if(a.length==0) return null;
		int pTot=a[0];
		for(int i=1; i<a.length; i++) pTot*=a[i];
		int [] result = new int[a.length];
		for(int i=0; i<a.length; i++) result[i]=pTot/a[i];
		return result;
	}
}
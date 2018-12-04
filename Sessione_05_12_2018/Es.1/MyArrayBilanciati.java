public class MyArrayBilanciati{
	
	public static boolean isBilanciati ( int [] a, int [] b){
		final int LUNG=a.length;
		if(LUNG!=b.length || LUNG==0 ) return false;
		int x=a[0]+b[0];
		for (int i=1; i<LUNG; i++) if(a[i]+b[i] != x ) return false;
		return true;
	}
	
}
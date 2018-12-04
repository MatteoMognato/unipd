public class MyArraySplit{
	public static int [] split (int [] array ){
		int [] a = (int[])array.clone();
		final int L=a.length;
		for (int i=0; i<L;i++){
			if(a[i] %2==0){ //pari
				boolean presente=false; 
				//presente sarà true se è presente un dispari successivo a i
				int j=i+1;
				while(!presente && j<L){
					presente= (a[j]%2==1);
					if(!presente) j++;
				}
				//se presente allora shifto tutti gli elementi fino a j e a[j] lo butto su a[i]
				if(presente){
					int el=a[j];
					for (int v=j; v>i; v--) a[v]=a[v-1];
					a[i]=el;
				}
			}
		}
		return a;
	}
}
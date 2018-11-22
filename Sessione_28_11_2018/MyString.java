public class MyString{
	//secondo Esercizio
	public static boolean isTandem(String s){
		return s.length()>0&&s.length()%2==0? s.substring(0, s.length()/2).equals(s.substring(s.length()/2, s.length())): false;
	}
	
	//terzo esercizio
	/*Soluzione 2
    public static boolean isCharContenuto(String s, char x){
        for (int i=0; i<s.length(); i++) if(s.charAt(i)==x) return true;
        return false;
    }
    */
    public static boolean intersection(String s1, String s2){
        //soluzione 3 definitiva
        for (int i=0; i<s1.length(); i++) if(s2.contains(s1.charAt(i)+"")) return true;
        /*  Soluzione 1
        for(int i=0; i<s1.length(); i++){
            for (int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)) return true;
            }
        }
        */
        /* Soluzione 2
        for (int i=0; i<s1.length(); i++) if(isCharContenuto(s2, s1.charAt(i))) return true;
        */
        return false;
    }
	
}
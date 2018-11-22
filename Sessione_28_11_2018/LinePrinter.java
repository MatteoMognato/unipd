// LinePrinter.java

public class LinePrinter {

    /** 
     Stampa una sequenza di lunghezza assegnata formata 
     da ripetute occorrenze di un carattere assegnato
     @param lunghezza lunghezza della sequenza
     @param carattere carattere da stampare
     */

     private void sequenza(int lunghezza, char carattere) {
         if (lunghezza < 1) return;
         for (int i = 0; i < lunghezza; i++)
             System.out.print(carattere);
    }

    /** 
     Stampa carattere di fine riga
     */

     private void nuovaRiga() {
         System.out.print("\n");
    }

    /** 
     Stampa un segmento orizzontale di coordinate assegnate
     @param inizio coordinata di inizio segmento
     @param fine coordinata di fine segmento
     */

     public void unSegmento(int inizio, int fine) {
         if (inizio < 1 || fine < 1 || inizio > fine) return;
         if (fine > 60) return;
         sequenza(inizio - 1, ' ');
         sequenza(fine - inizio + 1, '*');
         nuovaRiga();
    }

    /**
     Stampa due segmenti orizzontali successivi di coordinate assegnate
     @param inizio1 coordinata di inizio primo segmento
     @param fine1 coordinata di fine primo segmento
     @param inizio2 coordinata di inizio secondo segmento
     @param fine2 coordinata di fine secondo segmento
     */
     public void dueSegmenti(int inizio1, int fine1, int inizio2, int fine2) {
         if (inizio1 < 1 || inizio2 < 1 || fine1 < 1 || fine2 < 1) return;
         if (fine2 > 60) return;
         if (fine1 - inizio1 < 0 || fine2 - inizio2 < 0) return;
         if (inizio2 - fine1 < 2) return;
         sequenza(inizio1 - 1, ' ');
         sequenza(fine1 - inizio1 + 1, '*');
         sequenza(inizio2 - fine1 - 1, ' ');
         sequenza(fine2 - inizio2 + 1, '*');
         nuovaRiga();
    }

	public void treSegmenti(int i1, int f1, int i2, int f2, int i3, int f3){
		if (i1<1 || f1<1 || i2<1 || f2<1 || i3<1 || f3<1 ) return;
		if(f3>60) return;
		if(f1-i1<0 || f2-i2<0 || f3-i3<0 ) return;
		if(i2-f1<2 || i3-f2<2) return;
		sequenza(i1-1, ' ');
		sequenza(f1-i1+1, '*');
		sequenza(i2-f1-1, ' ');
		sequenza(f2-i2+1, '*');
		sequenza(i3-f2-1, ' ');
		sequenza(f3-i3+1, '*');
		nuovaRiga();
	}
}
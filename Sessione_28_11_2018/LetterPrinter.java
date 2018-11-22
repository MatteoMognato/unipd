public class LetterPrinter{
	public static void main(String [] args){
		LinePrinter l=new LinePrinter();
		final int WIDTH=15;
		//stampa la X
		for (int i=1; i<WIDTH; i++){
			if(i<(WIDTH-i-1)) l.dueSegmenti(i,i, WIDTH-i, WIDTH-i);
			else if(i>(WIDTH-i-1)) l.dueSegmenti( WIDTH-i, WIDTH-i, i, i);
			else l.unSegmento(i, i);
		}
		//
		System.out.println("\n\n\n\n");
		//stampa la N
		for (int i=1; i<WIDTH; i++){
			if(i==1 || i==WIDTH-1) l.dueSegmenti(1,1, WIDTH-1, WIDTH-1);
			else l.treSegmenti(1,1, i, i, WIDTH-1, WIDTH-1);
		}
	}
}
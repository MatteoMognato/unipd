# Lettore EBook
Si tratta di un mini progettino che simula il funzionamento di un lettore Ebook quindi da la possibilità di aggiungere libri con i rispettivi autori e poter vedere la lista dei libri che si possiede ordinati per autore.
Il progetto è provisto di 3 classi + classe Tester ( `LettoreEBookTester` ) e sono:
- `Autore` che contiene le variabili d'istanza nome, cognome; per correttezza si è ipotizzato che per distinguere in modo univoco un autore non sia sufficiente solo il cognome ma anche il nome. Se ci sono 2 con nome e cognome uguale son cazzi :) 
- `Libro` che contiene le variabili d'istanza String titolo, int numeroPagine, e Autore autore
- `LettoreEBook` che memorizza i dati di autori e libri su 2 ArrayList uno di tipo Autore e uno di tipo Libro. La classe contiene i seguenti metodi:
    - private int  cercaAutore(String unCognome) che restituisce l'indice, nell'ArrayList autori, dell’autore avente il cognome specificato, se esiste, e -1 se non esiste.
    - private int cercaLibro(String unTitolo) che restituisce l'indice, nell'ArrayList libri, del libro avente il titolo specificato, se esiste, e -1 se non esiste.
    - public boolean aggiungiAutore(String unNome, String unCognome) .
    - public boolean aggLibro(String unTitolo, int unNumeroPagine, String unNome, String unCognome) .
    - public boolean rimuoviLibro(String unTitolo) rimuove dall’ArrayList libri il libro specificato e ritorna l'esito della rimozione, (true) se il libro e` stato trovato ed eliminato, (false) altrimenti. 
    
    - public boolean rimuoviAutore(String unCognome) rimuove dall'eBook l'autore specificato e tutti i libri di tale autore.  Il metodo restituisce true se l'autore e` stato trovato ed eliminato, e false altrimenti. 

Si noti che nel progetto vengono introdotti i metodi toString() per tutte le classi e equals(Autore a) per Autore.
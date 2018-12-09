# MyArrayExternal
la classe `MyArrayExternal` possiede un solo metodo statico: 
```sh
static int[] external (int[] unArray)
```
che dato l'array fornito come parametro esplicito(unArray) restituisce un nuovo array (result) che:

 - ha la stessa lunghezza dell'array di partenza e 

 - ogni casella (result[i]) è il prodotto di tutti i numeri dell'array iniziale eccetto il valore che si trova nella casella[i] dell'array fornito come parametro esplicito (unArray).

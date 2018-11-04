# Esercizio 1
##### 4/11/2018 Basic

La regola delle 10,000 ore ipotizza che 'to become truly great at something you need not just talent and opportunity but 10,000 hours of serious practice'.   Questa ipotesi è stata formulata nel libro 'Outliers', pubblicato da Malcolm Gladwell nel 2008.

Progettare una classe PianoAttivita per rappresentare il piano di lavoro di un aspirante esperto che vuole sviluppare una esperienza professionale in un campo che richiede molte ore di apprendimento ed esperienza. 

Dovete definire un insieme appropriato di variabili d'istanza per la classe PianoAttivita. Tali variabili rappresentano informazioni relative al piano di lavoro dell'utente, quali ad esempio: quante ore al giorno vengono dedicate all'attività prescelta, quanti giorni alla settimana l'utente sarà impegnato, quante settimane all'anno di vacanza sono previste, ecc.

La classe PianoAttivita contiene un metodo public double calcolaAnni(int oreAttivita), che restituisce un numero frazionario che rappresenta quanti anni devono trascorrere perchè l'utente accumuli il numero di ore di attività passato in ingresso tramite il parametro oreAttivita, seguendo il piano di lavoro rappresentato dalle variabili d'istanza (ore al giorno di lavoro, ecc.). Ad esempio, se calcolaAnni(10000) restituisce 7.8 vuol dire che l'utente accumulerà 10000 ore di attivita in 7.8 anni, seguendo i ritmi impostati.

Sviluppare infine una classe PianoAttivitaTester in modalità interattiva, che chieda all'utente tutte le informazioni riguardanti il piano di lavoro, che servono per impostare le variabili d'istanza, ed inoltre un ammontare di ore target, e restituisca la conversione in anni.
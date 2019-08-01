

<div class=”mermaid”>
  graph TD;

  InserimentoDati[Inserimento date per prenotazione]- ->Controllo{Periodo libero?};

  Controllo- ->|No|EsitoNegativo[Notifica periodo occupato];
  EsitoNegativo- ->InserimentoDati;

  Controllo- ->|Si|EsitoPositivo[Ritorna importo];
</div>


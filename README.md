# struttureData_Liste
classe : Nodo
attributi:
valore : String
netx : Nodo

classe : Lista
attributi:
size : int
cursore : Nodo
primoRiferimento : Nodo

azioni base della lista

{valore} = l.visita({void})
"Restituire il {valore} alla posizione {cursore} corrente e sostituire il {cursore} con la posizione successiva"

{valore} = l.lettura({indice})
"Restituire il {valore} alla posizione {indice}"

{indice} = l.ricerca({valore})
"Scorrere tutta la lista fino al primo {valore} e restituisce la posizione {indice}"

{void} = l.inserimento({valore, indice})
"Inserire il {valore} alla posizione {indice} della lista"

{void} = l.accodamento({valore})
"Inserire il {valore} alla fine della lista"

{void} = l.eliminazione({indice})
"Eliminare il valore alla posizione {indice} dalla lista"

{void} = l.eliminazioneCompleta({valore})
"Eliminare tutti i {valore} dalla lista"



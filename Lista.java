public class Lista{
int size;
Nodo cursore;
Nodo primoRiferimento;


//Getter&Setter

public int getSize() {
    return size;
}

public void setSize(int size) {
    this.size = size;
}


public Nodo getCursore() {
    return cursore;
}

public void setCursore(Nodo cursore) {
    this.cursore = cursore;
}


public Nodo getPrimoRiferimento() {
    return primoRiferimento;
}

public void setPrimoRiferimento(Nodo primoRiferimento) {
    this.primoRiferimento = primoRiferimento;
}

public void Accoda(Nodo){

}

public void elimina(Nodo){

}

public Nodo visita() {
    if (cursore == null) {
        return null;
    }

    Nodo nodoCorrente = cursore;
    cursore = cursore.getNext();
    return nodoCorrente;
}


}
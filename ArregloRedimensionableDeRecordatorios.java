package aed;

class ArregloRedimensionableDeRecordatorios {

    private Recordatorio[] lista;

    public ArregloRedimensionableDeRecordatorios() {
        lista = new Recordatorio[0]; //esta ok 
    }

    public int longitud() {
        return lista.length; //esta ok
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] lista_2 = new Recordatorio[lista.length + 1];
        for (int j = 0; j < lista.length; j++) {
            lista_2[j] = lista[j];
       // lista_2 [lista_2.length -1] = new Recordatorio(i.
        
        }
    }

    public Recordatorio obtener(int i) {
        return lista[i];
    }

    public void quitarAtras() {
        Recordatorio[] lista_3 = new Recordatorio[lista.length]; 
        for (int j = 0; j < lista.length; j++) {
            lista_3[j] = lista[j];
        }
    }
    
    public void modificarPosicion(int indice, Recordatorio valor) {
        Recordatorio[] lista_4 = new Recordatorio[lista.length];
        for (int j = 0; j < lista.length; j++) {
            lista_4[j] = lista[j];
        }
        lista_4[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
    }
    
//arreglar 

    public ArregloRedimensionableDeRecordatorios copiar() {
        Recordatorio[] recordatorio_nuevo = new Recordatorio[lista.length];
        for (int j = 0; j < lista.length; j++) {
            recordatorio_nuevo[j] = lista[j];
        }
        return recordatorio_nuevo;
    }
}

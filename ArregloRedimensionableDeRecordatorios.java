package aed;

class ArregloRedimensionableDeRecordatorios {

    private Recordatorio[] lista;

    public ArregloRedimensionableDeRecordatorios() {
        lista = new Recordatorio[0];
    }

    public int longitud() {
        return lista.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] lista_2 = new Recordatorio[lista.length + 1]; 
        lista_2[0] = i;
        for (int j = 1; j < lista.length; j++) {
            lista_2[j] = lista[j];
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

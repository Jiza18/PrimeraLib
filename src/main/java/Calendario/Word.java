package Calendario;


public class Word {
    public static void main(String[] args) throws Exception {

        Portadas portadas = new Portadas();

        portadas.generarDocumentacion("Nombre del documento","Esta libreria es para generar documentos .docx" +
                ". Puede servir para generar documentacion dentro de tu programa o guardar algun string " +
                "de tu programa en un archivo externo");

    }
}
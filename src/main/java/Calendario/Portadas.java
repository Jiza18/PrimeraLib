package Calendario;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;

public class Portadas {
    public void generarDocumentacion(String fileName, String contenido) throws Exception {

        Document doc = new Document();


        DocumentBuilder builder = new DocumentBuilder(doc);

        // Insert text to the document A start
        builder.moveToDocumentStart();
        builder.setBold(true);
        builder.write(contenido);



        doc.save(fileName + ".docx");
    }
}

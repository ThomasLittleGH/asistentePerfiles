package asistenteperfil;

import com.spire.doc.*;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.ParagraphStyle;
import com.spire.doc.documents.TextSelection;
import com.spire.doc.fields.DocPicture;
import com.spire.doc.fields.TextRange;
import com.spire.doc.reporting.MergeImageFieldEventArgs;
import com.spire.doc.reporting.MergeImageFieldEventHandler;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author telit
 */
public class WordExport {

    public void WordExport(String perfil, String name, String rut, String s) {
        try {
            //Load the template document

            Document document = new Document("data//ETC.docx") {
            };

            //Get the first section
            Section section = document.getSections().get(0);
            //Get the first table in the section
            Table table = section.getTables().get(0);

            //Create a map of values for the template
            Map<String, String> map = new HashMap<String, String>();
            map.put("perfil", perfil);
            map.put("nombre", name);
            map.put("rut", rut);
            //Call the replaceTextinTable method to replace text in table
            replaceTextinTable(map, table);

            section = document.addSection();
            
            Paragraph bodyParagraph_1 = section.addParagraph();
            bodyParagraph_1.appendText(s);

            //Create and apply a style for title paragraph
            ParagraphStyle style1 = new ParagraphStyle(document);
            style1.setName("Arial-12");
            style1.getCharacterFormat().setBold(false);;
            style1.getCharacterFormat().setTextColor(Color.BLACK);
            style1.getCharacterFormat().setFontName("Arial");
            style1.getCharacterFormat().setFontSize(12f);
            document.getStyles().add(style1);
            bodyParagraph_1.applyStyle("Arial-12");

            //Save the result document
            document.saveToFile(name + ".docx", FileFormat.Docx_2013);
        } catch (Exception ex) {
            Logger.getLogger(WordExport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Replace text in table  
    static void replaceTextinTable(Map<String, String> map, Table table) {
        for (TableRow row : (Iterable<TableRow>) table.getRows()) {
            for (TableCell cell : (Iterable<TableCell>) row.getCells()) {
                for (Paragraph para : (Iterable<Paragraph>) cell.getParagraphs()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);
                    }
                }
            }
        }
    }

    //Replace text with image  
    static void replaceTextWithImage(Document document, String stringToReplace, String imagePath) {
        TextSelection[] selections = document.findAllString("${" + stringToReplace + "}", false, true);
        int index = 0;
        TextRange range = null;
        for (Object obj : selections) {
            TextSelection textSelection = (TextSelection) obj;
            DocPicture pic = new DocPicture(document);
            pic.loadImage(imagePath);
            range = textSelection.getAsOneRange();
            index = range.getOwnerParagraph().getChildObjects().indexOf(range);
            range.getOwnerParagraph().getChildObjects().insert(index, pic);
            range.getOwnerParagraph().getChildObjects().remove(range);
        }
    }

    //Replace text in document body  
    static void replaceTextinDocumentBody(Map<String, String> map, Document document) {
        for (Section section : (Iterable<Section>) document.getSections()) {
            for (Paragraph para : (Iterable<Paragraph>) section.getParagraphs()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);
                }
            }
        }
    }

    //Replace text in header or footer  
    static void replaceTextinHeaderorFooter(Map<String, String> map, HeaderFooter headerFooter) {
        for (Paragraph para : (Iterable<Paragraph>) headerFooter.getParagraphs()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                para.replace("${" + entry.getKey() + "}", entry.getValue(), false, true);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Lintang Dwi
 */
public class Write_Docx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         String teks = "Prodi Ilmu Dan cok Komputer" ;
         
         XWPFDocument documentDocx = new XWPFDocument();
         
         String outDocxEn = "F://Tes.docx";
         FileOutputStream outDocx = new FileOutputStream (new File(outDocxEn));
         
         XWPFParagraph paragraphDocx = documentDocx.createParagraph();
         XWPFRun runDocx = paragraphDocx.createRun();
         runDocx.setText(teks);
         
         documentDocx.write(outDocx);
         outDocx.close();
         System.out.println("Docx written succesfully");
         
    }
    
}

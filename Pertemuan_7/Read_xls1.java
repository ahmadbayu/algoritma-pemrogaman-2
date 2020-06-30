/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author  mm c compt
 */
public class Read_xls1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        {
            InputStream ExcelFileToRead = new FileInputStream("C:/Test.xls");
            HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFRow row;
            HSSFCell cell;

            Iterator rows = sheet.rowIterator();

            while (rows.hasNext()) {
                row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                while (cells.hasNext()) {
                    cell = (HSSFCell) cells.next();

                    if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
                        System.out.print(cell.getStringCellValue() + " ");
                    } else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + " ");
                    } else {
                        //U Can Handel Boolean, Formula, Errors
                    }
                }
                System.out.println();
            }

        }
    }
}

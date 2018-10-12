package package2;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Readandwriteexcel
{

	public static void main(String[] args) throws BiffException, IOException, WriteException 
	{
		//connect to excel file
		File f=new File("Book2.xls");
		//open excel file for reading
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);//0 for sheet1(tests)
		int nour1=rsh1.getRows();
		int nouc1=rsh1.getColumns();
		//open same excel sheet for writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh1=wwb.getSheet(0); //0 for sheet1
		String x=(rsh1.getCell(0,1).getContents());
		System.out.println(x);
		//open same excel sheet for writing
	
        WritableCellFormat cf=new  WritableCellFormat();
        cf.setAlignment(Alignment.JUSTIFY);
        cf.setWrap(true);
        
        Label l=new Label(nouc1,1,"printed",cf);
        wsh1.addCell(l);
//        try
//        {
//    	
//
//        cf.setAlignment(Alignment.JUSTIFY);
//        cf.setWrap(true);
//        
//        Label l=new Label(nouc1,1,"x",cf);
//        wsh1.addCell(l);
//        }
//		catch(Exception ex)
//        {
//			System.out.println(ex.getMessage());
//        }
        wwb.write();//save
		wwb.close();
		rwb.close();
	}

}

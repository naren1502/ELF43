package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataReading {
	@Test
	public void readData(String data[]) {
		FileInputStream fis=null;
		Workbook workbook=null;
		try {
			fis=new FileInputStream(new File("./testData/testData.xlsx"));
			workbook=WorkbookFactory.create(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

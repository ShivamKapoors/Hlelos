package listeners;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import org.testng.annotations.DataProvider;

import Base.Page;

public class Testutil  extends Page{
	
	public static String scrrenshot;
	public static String screenshotname;
	public static void takscreenshot() throws IOException
	{
		
//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d= new Date();
	String scrrenshot=d.toString().replaceAll(":", "_").replace(" ", "_")+".jpeg";
//	FileUtils.copyFile(src, new File("C:\\Users\\shiva\\eclipse-workspace\\Projects\\Selenium_Maven_Projects\\target\\surefire-reports\\html\\"+scrrenshot));
	}
	
	@DataProvider(name="dp1")
	public Object[][] getdata(Method m)
	{
		
		String sheetname=m.getName();
		System.out.print(sheetname);
		int rows=excel.getRowCount(sheetname);//0
		int cols=excel.getColumnCount(sheetname);//-1
		
		Object [][] data= new Object[rows-1][cols];
		
		for (int row=2; row<=rows; row++)
		{
			
			for (int col=0;col<cols;col++)
			{
				data[row-2][col]= excel.getCellData(sheetname, col, row);
			}
		}
		
		return data;
		
		
		
	}
	

}

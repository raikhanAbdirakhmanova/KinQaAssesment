package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;

public class Utils {

    public static void waitForVisibility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static String getCell(int row , int cell) throws Exception {

        File file = new File("src/KinBook.xlsx");


        FileInputStream inputStream = new FileInputStream(file);


        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        Row rows = sheet.getRow(row);

        return (rows.getCell(cell)).toString();
    }
}

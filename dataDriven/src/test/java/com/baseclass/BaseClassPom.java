package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPom {

	public static WebDriver driver;

	// getDate
//	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {
//		File file = new File(
//				"C:\\Users\\Arun\\eclipse-workspace3\\dataDriven\\src\\test\\resources\\AdactinInputdata.xlsx");
//		FileInputStream stream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(stream);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNum);
//		Cell cell = row.getCell(cellNum);
//		CellType type = cell.getCellType();
//		switch (type) {
//		case STRING:
//			res = cell.getStringCellValue();
//			break;
//		case NUMERIC:
//			if (DateUtil.isCellDateFormatted(cell)) {
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat f = new SimpleDateFormat("dd-MM-YYYY");
//				res = f.format(dateCellValue);
//			} else {
//				double numericCellValue = cell.getNumericCellValue();
//				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
//				res = valueOf.toString();
//			}
//		default:
//			break;
//		}
//		return res;
//	}

	// 1.getDriver
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2.loadUrl
	public void loadUrl(String Url) {
		driver.get(Url);
	}

	// 3.maximize
	public void maximize() {
		driver.manage().window().maximize();
	}

	// 4.sendkey
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void clk(WebElement element) {
		element.click();
	}

}

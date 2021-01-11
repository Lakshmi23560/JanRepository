
package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Testbase {

	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream file;;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static BrowserUtilities oBrowsUtil = new BrowserUtilities();

	// initializing property and extent report
	public static void propertyExtentSetup() throws Exception {
		// property file for global properties

		try {
			prop = new Properties();
			file = new FileInputStream(
					System.getProperty("user.dir") + ("\\src\\main\\java\\Configurations\\config.properties"));
			prop.load(file);
			String browserName = prop.getProperty("browser");
			System.out.println(browserName);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		try {
			file = new FileInputStream(
					System.getProperty("user.dir") + ("\\src\\main\\java\\Configurations\\log4j.properties"));
			prop.load(file);
			PropertyConfigurator.configure(prop);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		driver = oBrowsUtil.launchBrowser(prop.getProperty("browser"));
		// extent report
		try {
			String filename = new SimpleDateFormat("'Zoopla_'yyyyMMddHHmmSS'.html'").format(new Date());
			String path = System.getProperty("user.dir") + ("\\src\\main\\java\\extentreports\\") + filename;
			System.out.println(path);
			reports = new ExtentReports(path);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public static String takeScreenshot() throws Exception {
		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		String imagePath = System.getProperty("user.dir") + "/report/" + "ScreenShots/"
				+ new SimpleDateFormat("'Image_'YYYYMMddHHmmss'.png'").format(new Date());
		File destFile = new File(imagePath);
		FileUtils.copyFile(srcFile, destFile);
		return imagePath;
	}
}

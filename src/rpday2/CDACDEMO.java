package rpday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CDACDEMO {

	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pawar\\Desktop\\SDM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cdac.in/");
	}

	public void search() {
		driver.findElement(By.id("w-input-search")).sendKeys("delhi");
		driver.findElement(By.id("w-button-search")).click();
		driver.findElement(By.xpath("//*[@id=\"w-button-search\"]")).click();
		driver.findElement(By.linkText("Products & Services")).click();
	}

	public static void main(String[] args) {

		CDACDEMO ob = new CDACDEMO();
		ob.launchBrowser();
		ob.search();
	}

}
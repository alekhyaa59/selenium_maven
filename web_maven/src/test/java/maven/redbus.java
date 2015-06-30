package maven;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class redbus {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		InputStream ist=Thread.currentThread().getContextClassLoader().getResourceAsStream("data.properties");
		p.load(ist);
		//p.load(new FileInputStream("data.properties"));
		FirefoxDriver fd=new FirefoxDriver();
		fd.get(p.getProperty("url"));
		fd.findElement(By.id(p.getProperty("from"))).sendKeys("hyderabad");
		fd.findElement(By.id(p.getProperty("to"))).sendKeys("bangalore");
		Thread.sleep(2000);
		fd.findElement(By.xpath("(//*[@id='rbcal_txtOnwardCalendar']/table[2]/tbody/tr[6]/td[2])[position()=2]")).click();
		//fd.findElement(By.id(p.getProperty("date"))).click();
		fd.findElement(By.id(p.getProperty("search"))).click();
	}
}

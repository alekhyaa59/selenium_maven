package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class yahoo_compose 
	{

		FirefoxDriver fd;
		public void open()
		{
			fd=new FirefoxDriver();
			fd.manage().window().maximize();
			fd.get("http://www.yahoomail.com");
		}
		public void login()
		{
			fd.findElement(By.name("username")).sendKeys("venkat123456a");
			fd.findElement(By.name("passwd")).sendKeys("mq123456");
			fd.findElement(By.name("signin")).click();
		}
		public void compose() throws Exception
		{
			Thread.sleep(5000);
	        fd.findElement(By.xpath("//*[@class='composeicon']")).click();
	        Thread.sleep(3000);
	        fd.findElement(By.id("to")).sendKeys("tvgrgowthami@gmail.com");
	        fd.findElement(By.id("Subj")).sendKeys("hello");
	        fd.findElement(By.name("Content")).sendKeys("this is sample mail");
	        fd.findElement(By.name("action_compose_attach")).click();
	        Thread.sleep(1000);
	        //Runtime.getRuntime().exec("e:\\feb_15_wk\\fileupload.exe");
	        Runtime.getRuntime().exec("e:/selenium_praticse/yahoo.exe");
	        fd.findElement(By.id("upload_file_0")).click();
	        Thread.sleep(1000);
	        fd.findElement(By.id("attach_button_bottom")).click();
	        Thread.sleep(10000);
	        fd.findElement(By.id("send_top")).click();
		}
		public static void main(String[] args) throws Exception 
		{
			yahoo_compose yc=new yahoo_compose();
			yc.open();
			yc.login();
			yc.compose();

		}

	}

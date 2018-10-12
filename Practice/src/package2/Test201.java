package package2;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test201 
{

	public static void main(String[] args)  throws Exception 
	{
        //Automating pioneer broadband site to login 
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selfcare.pioneer.co.in/userportal/login.do?requesturi=http%3A%2F%2F1.254.254.254%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("ch_kkeshava");
		driver.findElement(By.name("password")).sendKeys("0sg382");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
	
	}

}

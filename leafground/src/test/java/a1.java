import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a1 {
	
	@Test
	
	public void testleaf()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rama\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://leafground.com/pages/Edit.html");

		 d1.close();
	}}
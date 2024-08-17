package pack2;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprog {

	public static void main(String[] args) throws Exception {

		String path = "C:/Users\\admin/eclipse-workspace_javapro/YZX/driver_c/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/");
		driver.findElement(By.xpath("//*[@href=\"register.htm\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("test");
		driver.findElement(By.xpath("(//*[@class=\"button\"])[3]")).click();
		driver.close();	
		
	}

}

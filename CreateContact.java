package seleniuminstall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver(); 
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	        driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	        driver.findElement(By.id("firstNameField")).sendKeys("subash");
	        driver.findElement(By.id("lastNameField")).sendKeys("bose");
	        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("ss");
	        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bb");
	        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("banking");
            driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("safe banking");
            driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("subash@gmail.com");
            driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']/child::option[40]")).click();
	        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	        driver.findElement(By.xpath("//a[text()='Edit']")).click();
	        driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).clear();
	        driver.findElement(By.xpath("//textarea[contains(@name,'importantNote')]")).sendKeys("good");
	        driver.findElement(By.xpath("//input[contains(@name,'submitButton')]")).click();
	        String TitleName=driver.getTitle();
			System.out.println(TitleName);
	         

	}
	

}

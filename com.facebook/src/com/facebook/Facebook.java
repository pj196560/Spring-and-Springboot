package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on create new account
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		//enter the first name
		driver.findElement(By.name("firstname")).sendKeys("dhanraj");
		Thread.sleep(3000);
		
		
		//enter surname
		driver.findElement(By.name("lastname")).sendKeys("Phatangare");
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("dhanarajphatangare66@gmail.com");
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("dhanarajphatangare66@gmail.com");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("dhanaraj@122");
		Thread.sleep(3000);
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByValue("26");
		Thread.sleep(3000);
		
		
		

		WebElement month = driver.findElement(By.id("month"));
		Select select1= new Select(month);
		select1.selectByVisibleText("Jan");
		Thread.sleep(3000);
		

		WebElement year = driver.findElement(By.id("year"));
		Select select2= new Select(year);
		select2.selectByValue("1998");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		Thread.sleep(3000);
		
		System.out.println("first page of facebook was tested");
		
	}

}

package New;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class WaitWatcher {
	@Test
	 WebDriver driver;
	 
	public void launchBrowser() {
		System.setProperty("webdriver.driver.chromedriver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.weightwatchers.com/us/");
		
		
		String pTitle=driver.getTitle();
		System.out.println("Page Title: "+pTitle);
		Assert.assertEquals(pTitle, "Weight Loss Program, Recipes &amp; Help | Weight Watchers");
		
		((WebElement) driver.findElement(By.className("menu-link__inner-wrapper"))).click();
	
		String pTitle1=driver.getTitle();
		System.out.println("Page Title: "+pTitle1);
		Assert.assertEquals(pTitle1, "Get Schedules &amp; Times Near You");
		
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.className("btn spice-translated")).click();
		
		driver.findElement(By.className("filter-buttons__button btn-toggle")).click();
		driver.findElement(By.className("filter-buttons__button btn-toggle btn-toggle--multi")).click();
		
		Select se=new Select(driver.findElement(By.className("meeting-location")));
		List<WebElement>element= se.getOptions();
		System.out.println(element.size());
		se.selectByVisibleText("WW Studio Flatiron");
		WebElement seNew= se.getFirstSelectedOption();
		System.out.println(seNew.getText());
		
		driver.findElements(By.className("schedule-detailed-day"));
		System.out.println("className");
	}}
	
	
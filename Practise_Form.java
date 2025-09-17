package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practise_Form {

	EdgeDriver driver;


	@AfterTest(enabled = true)

	public void after() {
		driver.quit();
	}

	@Test
	public void test() throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		for (int i = 0; i < 5; i++) {

			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_MINUS);

		}

		r.keyRelease(KeyEvent.VK_CONTROL);




		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Forms = driver.findElement(By.xpath("//*[text()='Forms']"));
		js.executeScript("arguments[0].scrollIntoView(true)", Forms);
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();

		WebElement widgets = driver.findElement(By.xpath("//div[text()='Widgets']"));

		js.executeScript("arguments[0].scrollIntoView(true)", widgets );

		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();

		WebElement Firstname = driver.findElement(By.id("firstName"));
		Firstname.sendKeys("Karthik");

		driver.findElement(By.id("lastName")).sendKeys("Mohan");
		driver.findElement(By.id("userEmail")).sendKeys("karthikmohan@gmail.com");

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		driver.findElement(By.id("userNumber")).sendKeys("8610053352");
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select select = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		select.selectByValue("1998");
		Select select1 = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		select1.selectByValue("3");
		driver.findElement(By.xpath("//div[text()='22']")).click();



		ArrayList <String> option = new ArrayList <String>();

		option.add("Maths");
		option.add("Computer Science");
		option.add("Physics");

		for (String dropdown : option) {

			WebElement sub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
			sub.click();

			sub.sendKeys(dropdown);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(sub));


			List<WebElement> fDrop = driver.findElements(By.xpath("//div[@id='subjectsContainer']//following::div[contains(@class, 'subjects') and contains(@class, 'option')]"));

			for(WebElement dynamic : fDrop) {

				String text = dynamic.getText();

				if (text.equalsIgnoreCase(dropdown)) {

					dynamic.click();
					break;

				}
			}

		}

		WebElement check1 = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement check2 = driver.findElement(By.id("hobbies-checkbox-2"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(check1).click().perform();
		action1.moveToElement(check2).click().perform();

		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\Documents\\postman.txt");

		driver.findElement(By.id("currentAddress")).sendKeys("chennai");

		JavascriptExecutor jes = (JavascriptExecutor)driver;
		WebElement submit = driver.findElement(By.id("submit"));
		jes.executeScript("arguments[0].scrollIntoView(true)", submit);

		driver.findElement(By.xpath("//div[@id= 'state']")).click();
		driver.findElement(By.xpath("//div[@id='react-select-3-option-0']")).click();
		driver.findElement(By.xpath("//div[@id='city']")).click();
		driver.findElement(By.id("react-select-4-option-1")).click();

		submit.click();



	}

}

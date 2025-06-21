package seleniumAssessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.activation.CommandObject;
import javax.print.attribute.standard.Chromaticity;
import javax.security.auth.Subject;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.devtools.v113.css.model.Value;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder;

public class Question1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\eclipse-workspace\\maveric\\Test-data\\edge driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		for (int i = 0; i <5; i++) {
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);

		}
		robot.keyRelease(KeyEvent.VK_CONTROL);



		WebElement firstname =	 driver.findElement(By.id("firstName"));
		firstname.sendKeys("Karthik");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Mohan");
		WebElement gender  = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		gender.click();

		driver.findElement(By.id("userEmail")).sendKeys("Km1025@gmail.com");
		WebElement usernum =  driver.findElement(By.xpath("//input[@id='userNumber']"));
		usernum.sendKeys("8610053454");
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.click();
		WebElement month =	driver.findElement(By.className("react-datepicker__month-select"));

		Select monthselect = new Select(month);

		monthselect.selectByValue("3");

		WebElement year =  driver.findElement(By.className("react-datepicker__year-select"));

		Select yearselect = new Select(year);

		yearselect.selectByValue("1998");

		driver.findElement(By.xpath("//div[text()='22']")).click();

		//subject
		//WebElement	Subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		//		//		 driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")).click();
		//Subject.sendKeys("M");
		//
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Maths");

		//updated xpath
		//div[@id='subjectsContainer']//following::div[contains(@class,'subjects') and contains(@class,'option')]

		
        
		ArrayList<String> suboption = new ArrayList<>();
		//these are the options i need to select so put them in arraylist
		suboption.add("Maths");
		suboption.add("Chemistry");
		suboption.add("Commerce");

		for (String string : suboption) {

			WebElement sub=	driver.findElement(By.xpath("//*[@id='subjectsContainer']/div/div[1]"));
			sub.click();
		   Thread.sleep(1000);
		   
		   WebElement sub1=driver.findElement(By.id ("subjectsInput"));
			
		   sub1.sendKeys("m");
	       
			List<WebElement> listopt=	driver.findElements(By.xpath("//div[@id='subjectsContainer']//following::div[contains(@class,'subjects') and contains(@class,'option')]"));

			//listopt.size();

			for (int i = 0; i <= listopt.size()-1; i++) {

				if(listopt.get(i).getText().contains(string)) {

					listopt.get(i).click();
					break;
				}
			}
		}

//		driver.findElement(By.xpath("//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).click();
//		Thread.sleep(2000);
Actions action = new Actions(driver);


		WebElement checkboxElement = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));

		action.moveToElement(checkboxElement).click().build().perform();



		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].scrollIntoView(false);",cAddress );
		//		driver.findElement(By.xpath("//*[text()='Sports']]")).click();
		WebElement	cAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\eclipse-workspace\\maveric\\Test-data\\javatest.txt");
		cAddress.sendKeys("test test");
		//WebElement	state =driver.findElement(By.xpath("//div[@id='state']"));
		//driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));

		
WebElement stat=driver.findElement(By.xpath("//div[@id=\"state\"]"));
stat.click();
		
driver.findElement(By.xpath("//div[@id=\"react-select-3-option-2\"]")).click();
		
 WebElement city =  driver.findElement(By.xpath("//div[@id=\"city\"]"));
city.click();

driver.findElement(By.xpath("//div[@id=\"react-select-4-option-0\"]")).click();

			
		driver.findElement(By.xpath("//button[@id='submit']")).click();





	}

}

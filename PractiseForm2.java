package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseForm2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

		
	}

}

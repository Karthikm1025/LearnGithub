package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		//find the position of button

		WebElement position = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']/span[2]"));

		Point pos=	position.getLocation();
		int xvalue=	pos.getX();
		int yvalue=pos.getY();
		System.out.println(xvalue+ " " + yvalue);
	
		//find the height and width of this button
		
		WebElement size = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']/span[2]"));
		
		int height =size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height +" "+ width);
	
		// find the color of button
		
		WebElement color= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt96']/span[2]"));
		
		String buttoncolor=color.getCssValue("background-color");
       System.out.println(buttoncolor);
       
       // Clicking the button
       
       WebElement action = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span"));
       action.click();
       
	}

}

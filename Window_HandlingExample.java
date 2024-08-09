package selenium_Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_HandlingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/window.xhtml");

		String parentwindow=Driver.getWindowHandle();

		//Firstbutton
		
				WebElement firstbutton = Driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		
				firstbutton.click();
		
				Set<String> newW=Driver.getWindowHandles();
		
		for(String newwindow:newW) {

			Driver.switchTo().window(newwindow);
		}
		//       
		//		Thread.sleep(3000);
		//		Driver.close();
		//		Driver.switchTo().window(parentwindow);


		//Finding number of windows

		//		WebElement multiplewin = Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		//       
		//		multiplewin.click();
		//		Thread.sleep(3000);
		//		Set<String> multiple=Driver.getWindowHandles();
		//
		//		int numbofw=   multiple.size();
		//		System.out.println(numbofw);


		//Closing all windows except parent window

		WebElement closeallwin=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));

		closeallwin.click();

		Set<String> close=  Driver.getWindowHandles();

		for(String allwindow:close) {

			if (!allwindow.equals(parentwindow)) {
				//System.out.println("this is not parent window");
				Driver.switchTo().window(allwindow);
				Thread.sleep(3000);
				//System.out.println("this is  parent window");
				Driver.close();
			}
		}



	}

}

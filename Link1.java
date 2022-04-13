package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SaurabhK\\Desktop\\Software testing\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	List<WebElement> a = driver.findElements(By.xpath("//a"));
	int b = a.size();
System.out.println(b);

System.out.println("--------------Text----------------");
for(int i=0;i<=46;i++) {
	System.out.println(a.get(i).getText());
	
}

}

}

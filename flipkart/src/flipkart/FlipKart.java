package flipkart;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
driver.findElement(By.xpath("//div[@class='_3wU53n'  and text()='Realme C2 (Diamond Blgetue, 16 GB)' ]")).click();
Set<String> ST=driver.getWindowHandles();
Iterator<String> it =ST.iterator();

driver.switchTo().window(it.next());
driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter Delivery Pincode']")).sendKeys("534002");

	}

}

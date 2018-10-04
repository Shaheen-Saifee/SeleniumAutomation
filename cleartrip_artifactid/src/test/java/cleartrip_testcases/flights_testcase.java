package cleartrip_testcases;

import java.io.IOException;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cleartrip_groupid.base;
import junit.framework.Assert;
import page_objects.flights_pages;

public class flights_testcase extends base
{


@BeforeTest
public void beforetest() throws IOException, InterruptedException
{
	WebDriver driver = initializedriver();
	Thread.sleep(300);
}

@Test
public void verify_heading() throws IOException, InterruptedException
	{
	flights_pages fp = new flights_pages(driver);
	WebElement heading = fp.getHeading();
	String heading_txt = heading.getText();
	Assert.assertEquals("Search flights", heading_txt);

   }

@Test
public void verify_suheading()
    {
	flights_pages fp = new flights_pages(driver);
	WebElement subheading = fp.getSubHeading();
	String subheading_txt = subheading.getText();
	Assert.assertEquals("Fly anywhere. Fly everywhere.", subheading_txt);
    }

@Test
public void verifying_flashSale()
    {
	flights_pages fp = new flights_pages(driver);
	WebElement flashbanner = fp.getFlashBanner();
	String flashbanner_txt = flashbanner.getText();
	Assert.assertEquals("Flash Sale: Enjoy the lowest airfare starting at Rs.949. Book Now.", flashbanner_txt);
	flashbanner.click();
	Set<String> ids = driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	String parentwindow = it.next();
	String childwindow = it.next();
	driver.switchTo().window(childwindow);
	String title_page = driver.getTitle();
	Assert.assertEquals("Airline Flash Sale! | Cleartrip", title_page);
	driver.close();
	driver.switchTo().window(parentwindow);
    }

@Test
public void verifying_pagination()
{
	flights_pages fp = new flights_pages(driver);
	
	 int count = fp.getSidePagination().size();
	 
	 System.out.println(count);
	 
	 for(WebElement element : fp.getSidePagination()) 
	 {
		 String abc = element.getText();
		 System.out.println(abc);
		 
	 }
	 
	 ArrayList<String> txt = new ArrayList<String>();
	 
	 for(WebElement element : fp.getSidePagination()) 
	 {
		txt.add(element.getText());
		 
	 }
	 
	 System.out.println(txt);
	 
	 
   Collections.reverse(txt);
   System.out.println(txt);
   System.out.println(Collections.min(txt));
}

@AfterTest
public void aftertest()
{
	driver.close();
}

}

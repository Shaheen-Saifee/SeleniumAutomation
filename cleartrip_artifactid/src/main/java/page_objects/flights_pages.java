package page_objects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cleartrip_groupid.base;

public class flights_pages extends base
{
	WebDriver driver;
	public flights_pages(WebDriver driver)
	{
		this.driver = driver;
	}
	

	flights_xpaths fx = new flights_xpaths();

	
    By heading =  fx.heading ;
    By subHeading = fx.subheading;
    By oneway_Radiobtn = fx.oneway_Radiobtn;
    By roundTrip_Radiobtn = fx.roundTrip_Radiobtn;
    By multiCity_Radiobtn = fx.multiCity_Radiobtn;
    By fromTxtBox = fx.fromTxtBox;
    By toTxtBox = fx.toTxtBox;
    By departDate = fx.departDate;
    By adultsDropDown = fx.adultsdropdown;
    By childrenDropDown = fx.childerdropdown;
    By infantDropDown = fx.infantdropdown;
    By moreOptionLink = fx.moreOptionLink;
    By searchFlightLink = fx.searhflightlink;
    By sidePagination = fx.sidepagination;
    By flashBanner = fx.flashbanner;
    
	
	
    public WebElement getHeading()
    {
    	WebElement heading_element = driver.findElement(heading);
    	return heading_element;
    }
    
    public WebElement getSubHeading()
    {
    	WebElement subHeading_element = driver.findElement(subHeading) ;
    	return subHeading_element;
    }
    
    public WebElement getOneway_Radiobtn()
    {
    	WebElement getoneway_Radiobtn_element = driver.findElement(oneway_Radiobtn) ;
    	return getoneway_Radiobtn_element;
    }
    
    public WebElement getRoundTrip_Radiobtn()
    {
    	WebElement roundTrip_Radiobtn_element = driver.findElement(roundTrip_Radiobtn) ;
    	return roundTrip_Radiobtn_element;
    }
    
    public WebElement getMultiCity_Radiobtn()
    {
    	WebElement multiCity_Radiobtn_element = driver.findElement(multiCity_Radiobtn) ;
    	return multiCity_Radiobtn_element ;
    }
    
    public WebElement getFromTxtBox()
    {
    	WebElement fromTxtBox_element = driver.findElement(fromTxtBox) ;
    	return fromTxtBox_element ;
    }
    
    public WebElement getToTxtBox()
    {
    	WebElement toTxtBox_element = driver.findElement(toTxtBox) ;
    	return toTxtBox_element ;
    }
    
    public WebElement getDepartDate()
    {
    	WebElement departDate_element = driver.findElement(departDate) ;
    	return departDate_element;
    }
    
    public WebElement getAdultsDropDown()
    {
    	WebElement adultsDropDown_element = driver.findElement(adultsDropDown) ;
    	return adultsDropDown_element;
    }
    
    public WebElement getChildrenDropDown()
    {
    	WebElement childredDropDown_element = driver.findElement(childrenDropDown) ;
    	return childredDropDown_element;
    }
    
    public WebElement getInfantDropDown()
    {
    	WebElement InfantDropDown_element = driver.findElement(infantDropDown) ;
    	return InfantDropDown_element;
    }
    
    public WebElement getMoreOptionLink()
    {
    	WebElement moreOptionLink_element = driver.findElement(moreOptionLink) ;
    	return moreOptionLink_element;
    }
   
    public WebElement getSearhFlightLink()
    {
    	WebElement searchFlightLink_element = driver.findElement(searchFlightLink) ;
    	return searchFlightLink_element;
    }
    
    public List<WebElement> getSidePagination()
    {
    	List<WebElement> sidePagination_element = driver.findElements(sidePagination);
    	return sidePagination_element;
    }
    
    public WebElement getFlashBanner()
    {
    	WebElement flashBanner_element = driver.findElement(flashBanner) ;
    	return flashBanner_element;
    } 
    
}

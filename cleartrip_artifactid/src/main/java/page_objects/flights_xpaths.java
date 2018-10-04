package page_objects;

import org.openqa.selenium.By;
public class flights_xpaths
{


	By heading = By.xpath("//form[@id='SearchForm']/h1");
	By subheading = By.xpath("//*[@id='SearchForm']/h2");
	By oneway_Radiobtn = By.xpath("//*[@id='SearchForm']/nav/ul/li[1]/label/strong");
	By roundTrip_Radiobtn = By.xpath("//*[@id='SearchForm']/nav/ul/li[2]/label");
	By multiCity_Radiobtn = By.xpath("//*[@id='SearchForm']/nav/ul/li[3]/label/strong");
	By fromTxtBox = By.xpath("//*[@id='FromTag']");
	By toTxtBox = By.xpath("//*[@id='ToTag']");
	By departDate = By.xpath("//*[@id='DepartDate']");
	By adultsdropdown = By.xpath("//*[@id='Adults']");
	By childerdropdown = By.xpath("//*[@id='Childrens']");
	By infantdropdown = By.xpath("//*[@id='Infants']");
	By moreOptionLink = By.xpath("//*[@id='MoreOptionsLink']");
	By searhflightlink = By.xpath("//*[@id='SearchBtn']");
	By sidepagination = By.xpath("//*[@id='airHomeOfferBlock']/ul/li");
	By flashbanner = By.xpath("//*[@id='flightsHomeFlashSaleBanner']");

}

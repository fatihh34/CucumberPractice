package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {
    public NinjaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phoneButton;

    @FindBy(xpath = "//h4")
    public List<WebElement>phones;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement>sepetler;

    @FindBy(xpath = "//*[@id='cart-total']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@class='text-left']")
    public List<WebElement>namesOfCart;


}

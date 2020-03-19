package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KinPage {

    public KinPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "fieldset>input ")
    public WebElement nameFieldInput;

    @FindBy(xpath = "(//input[@type ='radio'])[1]")
    public WebElement radioYes;

    @FindBy(xpath = "(//input[@type ='radio'])[2]")
    public WebElement radioNo;

    @FindBy(xpath = "//input[@name = 'title']")
    public WebElement titleInput;

    @FindBy(xpath = "//input[@value='book author']")
    public WebElement authorInput;

    @FindBy(xpath = "//input[@name = 'pages']")
    public WebElement pagesInput;

    @FindBy (xpath = "//input[@name = 'dewey_decimal']")
    public WebElement dDSInput;

    @FindBy (css = "select")
    public WebElement dropRead;

    @FindBy(xpath = "//select[2]")
    public WebElement dropDownWeek;

    @FindBy (xpath = "//select[3]")
    public WebElement dropStar;

    @FindBy (xpath = "//button")
    public WebElement submitButton;
}

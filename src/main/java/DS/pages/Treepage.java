package DS.pages;

<<<<<<< HEAD
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DS.driverfactory.Driverfactory;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Treepage {

	public WebDriver driver = Driverfactory.getDriver();

	public Treepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private DataStructurePage dataStructurePage = new DataStructurePage(Driverfactory.getDriver());

	private By getsatartbut = By.xpath("//a[@href='tree']");
	private By overviewLink = By.xpath("//a[@href='overview-of-trees']");
	private By treelinks = By.xpath("//div[@id='content']//li//a");
	private By output = By.xpath("//pre[@id='output']");
	private By trybutton = By.xpath("//a[text()='Try here>>>']");
	private By editor = By.xpath("//div[contains(@class,'CodeMirror')]//textarea");
	private By runbutton = By.xpath("//button[@type='button' and contains(@onclick, 'runit')]");

	public void overviewButtonClick() {
		driver.findElement(overviewLink).click();
	}

	public void consoleoutput() {
		System.out.println(driver.findElement(output).getText());
	}

	public void getsatartbut() {
		driver.findElement(getsatartbut).click();
	}

	public void treelinks() {
		driver.findElement(treelinks).click();
	}

	public void treehomelinksValid() {

		List<WebElement> treeLinks = driver.findElements(treelinks);
		for (int i = 0; i < treeLinks.size(); i++) {
			System.out.println("Treelinks Size:"+ treeLinks.size());
		
			List<WebElement> treeLinks1 = driver.findElements(treelinks);
			String originalStyle = treeLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", treeLinks1.get(i), "style",
			originalStyle + "border: 2px solid red;");
			treeLinks1.get(i).click();
			driver.findElement(trybutton).click();
			driver.findElement(editor).sendKeys(dataStructurePage.pythoncCodeForPositive(null, null, null, 1, 0));
			driver.findElement(runbutton).click();
			driver.navigate().back();

		}

	}

	public void treehomelinksinvalid() throws InterruptedException {

		List<WebElement> treeLinks = driver.findElements(treelinks);

		for (int i = 0; i < treeLinks.size(); i++) {
			System.out.println("Treelinks Size:"+ treeLinks.size());
			List<WebElement> treeLinks1 = driver.findElements(treelinks);
			String originalStyle = treeLinks1.get(i).getAttribute("style");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", treeLinks1.get(i), "style",
					originalStyle + "border: 2px solid red;");

			treeLinks1.get(i).click();
			driver.findElement(trybutton).click();
			driver.findElement(editor).sendKeys(dataStructurePage.pythoncCodeFornegative(null, null, null, 2, 0));
			driver.findElement(runbutton).click();
			driver.switchTo().alert().accept();
			driver.navigate().back();
		}
	}
=======
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Treepage {
	public WebDriver driver;
	public Treepage (WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By user_name = By.xpath("//*[@id='id_username']");
	private By pass_word = By.xpath("//*[@id='id_password']");
	private By sucessmsg= By.xpath("//div[@class='alert alert-primary']");
	private By getsatartbut = By.xpath("//div[6]/div/div/a");
	private By overviewlink = By.xpath("//a[text()='Overview of Trees'][1]");
	private By trybutton = By.linkText("Try here");
	
	public void loginusername(String loginname) {
		driver.findElement(user_name).sendKeys(loginname);
	}
	
	public void loginpassword(String passwd) {
		driver.findElement(pass_word).sendKeys(passwd);
	} 
	
	 
	public void urloggedinsucessmsg() {
	System.out.println(driver.findElement(sucessmsg).getText());
		
	}
	
	public void treegetstartbutton() {
		
		driver.findElement(getsatartbut).click();
		
	}
	public void overviewoftrees() {
		//WebElement clicklink=driver.findElement(overviewlink);
		//Actions a  = new Actions(driver);
      //a.moveToElement(clicklink).build().perform();
		WebElement link1 = driver.findElement(overviewlink);

		JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", link1);
	
		}
	public void clickontryhere() {
		//driver.findElement(trybutton).click();
	}
	
	
	
	
>>>>>>> main
}

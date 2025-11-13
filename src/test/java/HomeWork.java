import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
        wd.manage().window().maximize();
    }
    @Test
    public void xPathHomeWork(){
        //HomeWork xPath
        WebElement btnRegistration = wd.findElement(By.xpath("//input/..//button[text() = 'Registration']"));
        WebElement phonebook = wd.findElement(By.xpath("//*[text() = 'PHONEBOOK']"));
        WebElement aboutUpTheTree = wd.findElement(By.xpath("//a[3]/.."));
        WebElement aboutByText = wd.findElement(By.xpath("//a[text() = 'ABOUT']"));
        WebElement formX = wd.findElement(By.xpath("//form"));
        WebElement h1X = wd.findElement(By.xpath("//a/.."));
        WebElement brX = wd.findElement(By.xpath("//button[2]/../.."));
        WebElement navbarX = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));
        WebElement loginX = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));
        WebElement rootX = wd.findElement(By.xpath("//*[@id = 'root']"));
        WebElement containerX = wd.findElement(By.xpath("//*[@class = 'container']"));
        WebElement button1 = wd.findElement(By.xpath("//button"));
        WebElement homeHrefX = wd.findElement(By.xpath("//*[@href = '/home']"));
        WebElement aboutHrefX = wd.findElement(By.xpath("//*[@href = '/about']"));
        WebElement loginHrefX = wd.findElement(By.xpath("//*[@href = '/login']"));

        //done in class
        //by parts xPath
        WebElement placeholderX1 = wd.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement placeholderX2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'sword')]"));
        WebElement placeholderX3 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Pass')]"));


    }

    @Test
    public void locators() {
        //by tagName
        WebElement form = wd.findElement(By.tagName("form"));
        WebElement formCss = wd.findElement(By.cssSelector("form"));
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1Css = wd.findElement(By.cssSelector("h1"));
        WebElement br = wd.findElement(By.tagName("br"));
        WebElement brCss = wd.findElement(By.cssSelector("br"));



        //by class
        WebElement navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbarCss = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement loginCss = wd.findElement(By.cssSelector(".login_login__3EHKB"));




        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement rootCss = wd.findElement(By.cssSelector("#root"));

        //   "//*[@attribute = 'name']" - * means pass


        //by attribute
        WebElement homeHref = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement aboutHref = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement loginHref = wd.findElement(By.cssSelector("[href = '/login']"));


        //one of elements find by attribute > start, end, contains
        WebElement emailInput = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement passwordInput = wd.findElement(By.cssSelector("[placeholder *= 'ass']"));
        WebElement loginSubmit = wd.findElement(By.cssSelector("[name $= 'sword']"));
        // WebElement registrationSubmit = wd.findElement(By.cssSelector("br:last-child")); br is not a parent - it is additional line

        //by parts xPath
        WebElement placeholderxpath1 = wd.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement placeholderxpath2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'sword')]"));
        WebElement placeholderxpath3 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Pass')]"));


        //WebElement a3xpath = wd.findElement(By.xpath("//a[3]"));
        //down the house
        //div>div>form>input == div>div input
        //div/div/form/input ==div/div//input
        //up the house
        //div/div/h1/..


    }



    @Test
    public void classwork(){
        //parent
        //h1/parent::div = //h1/parent::*
        WebElement parent = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement parentUp = wd.findElement(By.xpath("//h1/.."));
        WebElement parentName = wd.findElement(By.xpath("//h1/parent::div"));

        //ancestor
        WebElement ancestor = wd.findElement(By.xpath("//h1/ancestor::*")); //he will find all ancestor numerate from the start element up
        WebElement ancestorDivRoot = wd.findElement(By.xpath("//h1/ancestor::div"));//two divs
        WebElement ancestorDivRoot2 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor-or-self
        WebElement h1 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));//all ancestors and self
        List<WebElement> ancestorsAndI = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> followingSibling =wd.findElements(By.xpath("//h1/following-sibling::*"));
        List<WebElement> precedingSibling = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
        WebElement precedingA = wd.findElement(By.xpath("//a[3]/preceding-sibling::a[1]"));

    }
    @Test
    public void classwork2(){
        WebElement btnLogin2 = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = btnLogin2.getText();
        System.out.println(text);

        WebElement form2 = wd.findElement(By.xpath("//form"));
        String textForm = form2.getText();
        System.out.println("**********");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("***********");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text btr--->"+br.getText());
    }

    @AfterTest
    public void close(){
        wd.quit();
    }

}

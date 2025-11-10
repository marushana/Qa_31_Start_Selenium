import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void locators(){
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

        //by attribute
        WebElement homeHref = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement aboutHref = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement loginHref = wd.findElement(By.cssSelector("[href = '/login']"));


        //one of elements find by attribute > start, end, contains
        WebElement emailInput = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement passwordInput = wd.findElement(By.cssSelector("[placeholder *= 'ass']"));
        WebElement loginSubmit = wd.findElement(By.cssSelector("[name $= 'sword']"));
        WebElement registrationSubmit = wd.findElement(By.cssSelector("br:last-child"));
        




    }
}

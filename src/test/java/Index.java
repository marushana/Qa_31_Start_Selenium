import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/marus/OneDrive/Рабочий%20стол/Лекции/QAAuto/QA31/21.index%20(1).html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators(){
        //by tagName
        WebElement el =  wd.findElement(By.tagName("button"));
        WebElement el3 = wd.findElement(By.cssSelector("button"));


        List<WebElement> list = wd.findElements(By.tagName("a"));
        int i = list.size();
        WebElement el2 = list.get(2);
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //byClass
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        WebElement form = wd.findElement(By.id("form1"));
        WebElement form1 = wd.findElement(By.cssSelector("#form1"));

       //by attribute
        WebElement href = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        //WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder ^='Type']"));//if starts = ^
        //WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder $= 'name']")); //if ends = $
        //WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder *= 'your']")); //if contains = *


        //by name
        WebElement nameName = wd.findElement(By.name("name"));
        WebElement nameName1 = wd.findElement(By.cssSelector("[name='name']"));

        //by linkText not recommended
        WebElement linkText = wd.findElement(By.linkText("Item 2"));
        WebElement a1 = wd.findElement(By.partialLinkText("m 2"));


        //List<WebElement>

    }

//    @AfterClass
//    public void quit(){
//        wd.close();
//    }
}

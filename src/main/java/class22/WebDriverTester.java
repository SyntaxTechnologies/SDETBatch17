package class22;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {

    public static void main(String[] args) throws InterruptedException {
     //   WebDriver w=new ChromeDriver();
     //   WebDriver w=new FirefoxDriver();
       // WebDriver w=new EdgeDriver();
        WebDriver[] browsers={new EdgeDriver(),new FirefoxDriver(),new ChromeDriver()};

        for(WebDriver w:browsers) {
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }

        /*ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        Thread.sleep(2000);
        c.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println(c.getTitle());
        Thread.sleep(2000);
        c.close();

        FirefoxDriver f=new FirefoxDriver();
        f.manage().window().maximize();
        Thread.sleep(2000);
        f.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println(f.getTitle());
        Thread.sleep(2000);
        f.close();*/




    }
}

package class20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5SeleniumProfessional {
    public static void main(String[] args) throws InterruptedException {

        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for(WebDriver d:arr){
            d.manage().window().maximize();
            Thread.sleep(2000);
            d.navigate().to("https://google.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://facebook.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://amazon.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().back();
            d.close();
            // Break till 2:01

        }

    }
}

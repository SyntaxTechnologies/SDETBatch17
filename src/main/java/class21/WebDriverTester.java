package class21;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver d:arr){
            d.openBrowser();
            d.loadURL("Amazon.com");
            d.performTesting();
            d.close();
        }




    }
}

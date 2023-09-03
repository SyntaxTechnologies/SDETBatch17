package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(3000);
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(3000);
        chrome.navigate().refresh();
        Thread.sleep(3000);
        chrome.navigate().back();
        Thread.sleep(3000);
        chrome.close();

    }
}

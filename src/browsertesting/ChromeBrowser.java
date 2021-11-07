package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl ="https://www.nopcommerce.com/en/demo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.close();

    }
}

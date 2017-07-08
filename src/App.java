import org.openqa.selenium.WebDriver;
import util.FactoryWebDriver;

public class App {
    public static void main(String[] args) {
        WebDriver driver = FactoryWebDriver.getWebDriver();

        System.out.println(driver.toString());
    }
}

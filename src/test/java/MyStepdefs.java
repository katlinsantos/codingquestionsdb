import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebElement button;
    WebDriver driver;


    @Given("The system shows try first button")
    public void theSystemShowsTryFirstButton() {
        webDriverSetup();
    }

    @When("John clicks the try first button")
    public void johnClicksTheTryFirstButton() {
        button = driver.findElement(By.id("get-question"));
        button.click();
    }

    @Then("The system shows a sample question")
    public void theSystemShowsASampleQuestion() throws Exception{
        Thread.sleep(30000);
    }

    @And("the try first button changes to the close button")
    public void theTryFirstButtonChangesToTheCloseButton() {
        driver.quit();
    }

    private void webDriverSetup() {

        System.setProperty("webdriver.chrome.driver","C:/dev/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://codingquestionsdb.com/");
    }
}

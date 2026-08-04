package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Locators {
    WebDriver driver;

    //Driver setup and configuration
    @BeforeSuite
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Driver closer
    @AfterSuite
    public void stopBrowser() {
        driver.close();
    }

    //Test
    @Test(priority = 0)
    public void openUrl() throws InterruptedException {
        driver.get("https://shop.falaqdigital.com/");
    }

    @Test(priority = 1)
    public void goHoneyTab() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Go honey tab
        WebElement honeyTab = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@href='/product-category/honey']")
                )
        );

        honeyTab.click();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void filterItems() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate the visible Maximum Price input
        List<WebElement> numberInputs = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.cssSelector("input[type='number']")));

        WebElement maxPrice = null;

        for (WebElement input : numberInputs) {
            if (input.isDisplayed() &&
                    "Maximum price".equals(input.getAttribute("aria-label"))) {
                maxPrice = input;
                break;
            }
        }

        maxPrice.click();
        maxPrice.clear();
        maxPrice.sendKeys("1000");

        // Locate the visible Filter button
        List<WebElement> filterButtons = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//button[contains(normalize-space(),'Filter')]")));

        WebElement filterButton = null;

        for (WebElement button : filterButtons) {
            if (button.isDisplayed()) {
                filterButton = button;
                break;
            }
        }

        filterButton.click();

        Thread.sleep(3000);

        // Locate the visible Clear button
        List<WebElement> clearButtons = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//button[contains(normalize-space(),'Clear')]")));

        WebElement clearButton = null;

        for (WebElement button : clearButtons) {
            if (button.isDisplayed()) {
                clearButton = button;
                break;
            }
        }

        clearButton.click();

        Thread.sleep(5000);
    }

    //Search item
    @Test(priority = 3)
    public void locateSearchBox() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Input item name in search box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[aria-label='Search products']")
                )
        );

        searchBox.sendKeys("Honey");
        Thread.sleep(3000);

        //Select first item from dropdown
        WebElement product = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Honey')]")
                )
        );

        product.click();

        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void addItemToCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Increase Quantity
        WebElement increaseBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button[aria-label='Increase quantity']")
                )
        );

        increaseBtn.click();
        Thread.sleep(3000);

        // Click Add to Cart
        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[.//span[normalize-space()='Add to Cart']]")
                )
        );

        addToCart.click();
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    public void completeCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // View Cart
        WebElement viewCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[starts-with(@aria-label,'View cart')]")
                )
        );

        viewCart.click();
        Thread.sleep(5000);

        // Change Shipment
        WebElement changeShipment = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//label[contains(normalize-space(),'Outside Dhaka')]")
                )
        );

        changeShipment.click();

        // Proceed to Checkout
        WebElement goCheckout = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a[href='/checkout']")
                )
        );

        goCheckout.click();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void completeCheckout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Input full Name
        WebElement fullName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("fullName")
                )
        );

        fullName.sendKeys("Akib Rahman");

        //Input phone No
        WebElement phoneNo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("phone")
                )
        );

        phoneNo.sendKeys("01534363363");

        //Input address
        WebElement address = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("address")
                )
        );

        address.sendKeys("Jessore,Bangladesh");
        Thread.sleep(5000);

        //Complete Order
        WebElement placeOrder = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@type='submit' and contains(.,'PLACE ORDER')]")
                )
        );
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                placeOrder
        );

        Thread.sleep(3000);
        placeOrder.click();

        Thread.sleep(5000);

        //Go back to shopping
        WebElement goBack = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a[routerlink='/shop']")
                )
        );
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                goBack
        );

        Thread.sleep(3000);
        goBack.click();

        Thread.sleep(5000);

    }
}

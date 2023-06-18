package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {

    public static final String XPATH_WAITFOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span";
    public static final String XPATH_SELECT_DAY = XPATH_SELECT + "/select[1]";
    public static final String XPATH_SELECT_MONTH = XPATH_SELECT + "/select[2]";
    public static final String XPATH_SELECT_YEAR = XPATH_SELECT + "/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://www.facebook.pl");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement cookieButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(string(), 'Zezwól na wszystkie pliki cookie')]")));

        // Sprawdź, czy przycisk akceptacji plików cookie jest wyświetlany
        if (cookieButton.isDisplayed()) {
            // Kliknij przycisk akceptacji
            cookieButton.click();
        }

        WebElement createAccountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")));
        if (createAccountButton.isDisplayed()) {
            createAccountButton.click();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_WAITFOR)));

        //17.11.1998
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(16);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(10);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(25);
    }
}

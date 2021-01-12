package ru.stqa.pft.videozen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class ArticleCreationTests {
  private WebDriver driver;
  private String baseUrl;


  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    baseUrl = "https://p-rc-edit.zen.zeta.kaizen.yandex.ru/";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Войти")).click();
    driver.findElement(By.id("passp-field-login")).clear();
    driver.findElement(By.id("passp-field-login")).sendKeys("yndx.test.zen33");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.id("passp-field-passwd")).click();
    driver.findElement(By.id("passp-field-passwd")).clear();
    driver.findElement(By.id("passp-field-passwd")).sendKeys("simple123456");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector(".zen-ui-avatar")).click();
    driver.findElement(By.cssSelector(".zen-ui-header-popup__item:nth-child(2) > .zen-ui-header-popup__item-text")).click();
    driver.findElement(By.cssSelector(".zen-header__add-button")).click();
    driver.findElement(By.cssSelector(".ui-lib-context-menu__item:nth-child(1) .new-publication-dropdown__button-desc")).click();
    //sleep(10000);
    if (isElementPresent(By.cssSelector(".close-cross"))) {
      driver.findElement(By.cssSelector(".close-cross")).click();
    }
    //sleep(10000);
    if (isElementPresent(By.cssSelector(".ui-lib-popup-element__close"))) {
      driver.findElement(By.cssSelector(".ui-lib-popup-element__close")).click();
    }
    sleep(10000);
    if (isElementPresent(By.cssSelector("h1 > .public-DraftStyleDefault-block"))) {
      driver.findElement(By.cssSelector("h1 > .public-DraftStyleDefault-block")).click();
      driver.findElement(By.cssSelector("h1 > .public-DraftStyleDefault-block")).sendKeys("Test12");
    }
    //sleep(10000);
    if (isElementPresent(By.cssSelector(".zen-editor-block"))) {
      driver.findElement(By.cssSelector(".zen-editor-block")).click();
      driver.findElement(By.cssSelector(".zen-editor-block")).sendKeys("Test14");
    }
    driver.findElement(By.cssSelector(".editor-header__edit-btn")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    //sleep(20000);
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }

  private boolean isElementPresent(By by) {
    return !driver.findElements(by).isEmpty();
  }

}

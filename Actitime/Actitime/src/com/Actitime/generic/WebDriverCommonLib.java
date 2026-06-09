package com.Actitime.generic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	/**
	 * This method will maximize the browser window.
	 * 
	 * @param driver The WebDriver instance
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the browser window.
	 * 
	 * @param driver The WebDriver instance
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method will select an option from dropdown using index.
	 * 
	 * @param element The dropdown WebElement
	 * @param index   The index value to select
	 */
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method will select an option from dropdown using visible text.
	 * 
	 * @param element The dropdown WebElement
	 * @param text    The visible text to select
	 */
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method will select an option from dropdown using value.
	 * 
	 * @param element The dropdown WebElement
	 * @param value   The value to select
	 */
	public void selectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method will perform mouse hover action on the given element.
	 * 
	 * @param driver The WebDriver instance
	 * @param target The target WebElement
	 */
	public void mouseHover(WebDriver driver, WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	/**
	 * This method will perform a right-click (context click) on the given element.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The WebElement to right-click
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	/**
	 * This method will double-click on the given element.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The WebElement to double-click
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	/**
	 * This method will click and hold on the given element.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The WebElement to click and hold
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).perform();
	}

	/**
	 * This method will scroll to the given element.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The WebElement to scroll into view
	 */
	public void scrollIntoView(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).perform();
	}

	/**
	 * This method will wait until the element becomes visible.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The WebElement to wait for
	 */
	public void waitForElementToLoad(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will switch to frame using index.
	 * 
	 * @param driver The WebDriver instance
	 * @param index  The frame index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method will switch to frame using name or id.
	 * 
	 * @param driver   The WebDriver instance
	 * @param nameOrId The frame name or id
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	/**
	 * This method will switch to frame using WebElement.
	 * 
	 * @param driver  The WebDriver instance
	 * @param element The frame WebElement
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * This method will switch back to default content.
	 * 
	 * @param driver The WebDriver instance
	 */
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will switch to alert popup.
	 * 
	 * @param driver The WebDriver instance
	 * @return Alert
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	// Switch window and verify url
	   public void switchToWIndows(WebDriver driver, String url) {
			Set<String> allWindowIDs = driver.getWindowHandles();
			for( String id: allWindowIDs) {
				driver.switchTo().window(id);
				if(driver.getCurrentUrl().contains(url)) {
					break;
				}
			}
	   }
	   
	   // Switch window and verify title
	   public void switchToWIndows(String title, WebDriver driver) {
			Set<String> allWindowIDs = driver.getWindowHandles();
			for( String id: allWindowIDs) {
				driver.switchTo().window(id);
				if(driver.getTitle().contains(title)) {
					break;
				}
			}
	
	   }
}

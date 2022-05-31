package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HideAndShowAnimation_Page {

	AppiumDriver driver;

	public HideAndShowAnimation_Page(AppiumDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public WebElement animation;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]")
	public WebElement hide_show_animations;

	@FindBy(how = How.ID, using = "com.example.android.apis:id/hideGoneCB")
	public WebElement hide;

	@FindBy(how = How.CLASS_NAME, using = "android.widget.Button")
	public List<WebElement> elements;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")
	public WebElement one_element;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
	public WebElement three_element;

	@FindBy(how = How.ID, using = "com.example.android.apis:id/addNewButton")
	public WebElement show;


	

	public void AnimationClick() {

		animation.click();
	}

	public void Hide_Show_Animation() {

		hide_show_animations.click();
	}

	public void Hidenimation() throws InterruptedException {

		hide.click();
		Thread.sleep(5000);
	}

	public void ElementClick() throws InterruptedException {

		one_element.click();
		Thread.sleep(4000);
	}

	public void Elementhide() throws InterruptedException {

		three_element.click();
		Thread.sleep(3000);
	}

	public int ElementsNow() {

		return elements.size();
	}

	public void ShowAnimation() throws InterruptedException {

		show.click();
		Thread.sleep(5000);
	}

}

package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DefaultLayoutAnimation_Page {

	AppiumDriver driver;

	public DefaultLayoutAnimation_Page(AppiumDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public WebElement animation;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public WebElement layout;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout")
	public List<WebElement> listSize;

	@FindBy(how = How.ID, using = "com.example.android.apis:id/addNewButton")
	public WebElement addButton;



	public void AnimationClick() {

		animation.click();
	}

	public void DeaultLayout() {

		layout.click();
	}

	public int ListSize() {

		return listSize.size();
	}

	public void AddButton() {

		addButton.click();
	}

}

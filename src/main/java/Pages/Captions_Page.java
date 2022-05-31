package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class Captions_Page {
	
	public String actual="on";
	AppiumDriver driver;
	   public Captions_Page(AppiumDriver driver) {
		   
		   PageFactory.initElements(driver,this);
		   this.driver=driver;
	   }
	   
	   
   
	   
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public WebElement accessibility;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public WebElement services;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageButton")
	public WebElement button;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]")
	public WebElement captions;
	
	@FindBy(how=How.ID,using="com.android.settings:id/switch_widget")
	public WebElement enable_switch;
	
	@FindBy(how=How.ID,using="com.android.settings:id/switch_bar")
	public WebElement switchbar;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
	public WebElement language;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
	public WebElement text_size;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]")
	public WebElement lang_select;
	
	@FindBy(how=How.XPATH,using="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	public WebElement size_select;
	
	@FindBy(how=How.ID,using="com.android.settings:id/preview_text")
	public WebElement preview_text;
	
	
	

	
	
	public void AccessibilityClick() {
		
		accessibility.click();
	}
	
	public void AccesibilityServices() {
		
		services.click();
	}
	
	public void SquareButton() {
		
		button.click();
	}
	
	public void Captions() {
		
		captions.click();
	}

	public void EnableCaptions() {

		String text=switchbar.getText();

		if(text.equalsIgnoreCase("Off")) {
			
			switchbar.click();
		}
	}
	
	public void LanguagSelection() throws InterruptedException {
		
		language.click();
		Thread.sleep(3000);
		lang_select.click();
	}
	
	public void TExtSizeSelect() throws InterruptedException {
		
		text_size.click();
		Thread.sleep(2000);
		size_select.click();
	}

	public void Preview() {
		
		System.out.println(preview_text.getText());
	}
	
}

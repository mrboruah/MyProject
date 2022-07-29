package com.Package;

public class iJMeetHomePage 
{
	@FindBy(css="span.mvlogo-size-app1 img[alt*=ijmeetimage]")
	public WebElement ijMeetlogo;
	
	public void clickonLogo() {
		ijMeetlogo.click();
		sysoit
	}
}

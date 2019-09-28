package WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
    WebDriver driver=new ChromeDriver();
  

	public void launch(String u)
	{
		
		driver.get(u);
		driver.manage().window().maximize();
	}

}

package WebTable;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws Exception{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Web Driver\\jar\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://money.rediff.com/sectors");
    driver.manage().window().maximize();
    WebElement table=driver.findElement(By.xpath("//*[@id='dataTable']/tbody"));
    List<WebElement> r=table.findElements(By.tagName("tr"));
    driver.findElement(By.id("showMoreLess")).click();
    System.out.println(r.size());
    // Printing all the rows values
    int i;
    for(i=1; i<=r.size(); i++)
    {
    
    	WebElement p=table.findElement(By.xpath("//*[@id='dataTable']/tbody/tr[" + i +"]/td[1]/a"));
        System.out.println(p.getText());
        
        table.findElement(By.xpath("//*[@id='dataTable']/tbody/tr[" + i +"]/td[1]/a")).click();
        String v=driver.findElement(By.id("ltpid")).getText();
        System.out.println(v);
       
        driver.navigate().back();
        Thread.sleep(10000);
        driver.findElement(By.id("showMoreLess")).click();
//   	
    }
    
    
    
    //Number of rows in a dynomic table
//List<WebElement> rows=driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr/td[1]"));
//  System.out.println(rows.size());
    
//    driver.findElement(By.id("showMoreLess")).click();
//    //Other way to get Number of rows in a dynomic table
//    WebElement table=driver.findElement(By.xpath("//*[@id='dataTable']/tbody"));
//    List<WebElement> r=table.findElements(By.tagName("tr"));
//    System.out.println(r.size());
//    // Printing all the rows values
//    int i;
//    for(i=1; i<=r.size(); i++)
//    {
//    	//Storing all the rows values in a val String
//    	//Dynomic xpath xpath("tr[" + i +"]/td[1]/a")
//    	String val=table.findElement(By.xpath("tr[" + i +"]/td[1]/a")).getText();
//    	
//    	if(val.equals("S&P BSE Bankex")==true)
//    	{
//    	System.out.println(val);
//    	}
//    }
    driver.close();
	}

}

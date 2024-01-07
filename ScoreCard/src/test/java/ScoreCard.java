import java.io.IOException;
import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScoreCard {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\gd\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-2nd-test-1387604/full-scorecard");
		WebElement table=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody"));
		List<WebElement> tables=table.findElements(By.className("ds-hidden"));
		System.out.println(tables.size());
		for (WebElement row : tables) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Loop through each cell and print the text
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + "\t");
			}
			System.out.println(); 
		}
	}
}

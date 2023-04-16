import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testingauto {
	
	public Testingauto() {
		
	}
	
	public void openURL(String baseURL) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public void login(String baseURL, String userName, String password) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	public void verifyApplication(String baseURL, String userName, String password, String expectedTitle) throws InterruptedException {
		    
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
			 
			ChromeDriver driver = new ChromeDriver();
			
			String actualTitle;
			
			driver.get(baseURL);
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("user-name")).sendKeys(userName);
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("password")).sendKeys(password);
			
			Thread.sleep(5000);
			
			driver.findElement(By.id("login-button")).click();
			
			driver.getTitle();
			actualTitle = driver.getTitle();
			
			System.out.println("The actual title is " + actualTitle);
			System.out.println("The expected title is " + expectedTitle);
			
			if (actualTitle.equals(expectedTitle)) {
			
				System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			}
			
			Thread.sleep(3000);
			
			driver.quit();
	}
	
	public void sortProductHiLo(String baseURL, String userName, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		Select drpProduct = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		drpProduct.selectByVisibleText("Price (high to low)");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public void openFirstResult(String baseURL, String userName, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		Select drpProduct = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		drpProduct.selectByVisibleText("Price (high to low)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public void buyProduct(String baseURL, String userName, String password, String firstName, String lastName, String postalCode) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koinworks-Staff\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		Select drpProduct = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		drpProduct.selectByVisibleText("Price (high to low)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("checkout")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("first-name")).sendKeys(firstName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("postal-code")).sendKeys(postalCode);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("finish")).click();
		
		Thread.sleep(6000);
		
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		Testingauto danielTesting = new Testingauto();
		
/*
		given: user is in browser homepage
		
		when: user type the web url and click enter to open the web url
		
		then: browser should open the website based on the web url

*/		
		
		danielTesting.openURL("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
/*
		given: user is in onboarding page of the website
		
		when: user input user name and password and user click login button
		
		then: user should successfully do login and arrived at website homepage

*/	
		
		danielTesting.login("https://www.saucedemo.com/", "standard_user", "secret_sauce");
		
		Thread.sleep(3000);
		
/*
		
		given: user is in website homepage
		
		when: user successfully do login
		
		then: verify the main title of the website page

*/
		
		danielTesting.verifyApplication("https://www.saucedemo.com/", "standard_user", "secret_sauce", "Swag Labs");
		
		Thread.sleep(3000);
		
/*
		
		given: user is in the homepage of the website
		
		when: user sort the list of product by high to low price
		
		then: user successfully sort the list of product by high to low price

*/
		
		danielTesting.sortProductHiLo("https://www.saucedemo.com/", "standard_user", "secret_sauce");
		
		Thread.sleep(3000);
		
/*
		
		given: user is in homepage of the website and user successfully sort the list of product by high to low price
		
		when: user click the first product result to be choosen
		
		then: user will be directed to detail page of that choosen product

*/
		
		danielTesting.openFirstResult("https://www.saucedemo.com/", "standard_user", "secret_sauce");
		
		Thread.sleep(3000);
		
/*
		
		given: user is in product detail page
		
		when: user click add to cart button and cart icon menu
		
		then: user will be directed to cart page
		
		
		given: user is in cart page
		
		when: user click checkout button
		
		then: user will be directed to checkout information page
		
		
		given: user is in checkout information page
		
		when: user input firstname, lastname and postalcode field and click continue button
		
		then: user will be directed to checkout confirmation page
		
		
		given: user is in checkout confirmation page
		
		when: user click button finish
		
		then: user will be directed to checkout finish page and finally user successfully buy the the product

*/
		
		danielTesting.buyProduct("https://www.saucedemo.com/", "standard_user", "secret_sauce", "daniel", "marsellino", "16432");
		
		
		
	
	}
	
		

}
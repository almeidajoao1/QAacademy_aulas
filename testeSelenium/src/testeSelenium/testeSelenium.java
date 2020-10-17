package testeSelenium;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testeSelenium {

	WebDriver driver = new ChromeDriver(); // Instanciamento de Driver no Chrome

	@Before
	public void abrirDriver() {

		driver.get("http://demo.automationtesting.in/Register.html"); // Abre uma página no navegador

	}

	@Test
	public void testeWebDrvier() throws InterruptedException {
		// TODO Auto-generated method stub

		primeirosCampos();

		verificacao();

		radiobuttonandCheck();

		countries();

		dateofBirth();

		password();

		preencheImagem();

		Thread.sleep(10000);

		// demorar 10 seg p/ fechar ou vc pode usar
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	private void password() {
		driver.findElement(By.xpath("//input[@id='firstpassword']")).click();

		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Sk3@@vTjifUapmQ");

		driver.findElement(By.xpath("//input[@id='secondpassword']")).click();

		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Sk3@@vTjifUapmQ");
	}

	private void countries() {
		List<WebElement> listOption = driver.findElements(By.xpath("//select[@id='Skills']"));// vale para as listas do
		// tipo option;

		for (int i = 0; i < listOption.size(); i++) {

			System.out.println(listOption.get(i).getText());

		}

		Select optionSkills = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));

		optionSkills.selectByVisibleText("Java");

		List<WebElement> listOptionCountries = driver.findElements(By.xpath("//select[@id='countries']"));// selecionar
																											// país

		for (int i = 0; i < listOptionCountries.size(); i++) {

			System.out.println(listOptionCountries.get(i).getText());

		}

		Select optionsCountries = new Select(driver.findElement(By.xpath("//select[@id='countries']")));

		optionsCountries.selectByVisibleText("Brazil");

		driver.findElement(By.xpath(
				"//body/section[@id='section']/div/div/div/form[@id='basicBootstrapForm']/div/div/span/span/span[1]"))
				.click(); // select country

		driver.findElement(By.xpath("//li[contains(text(),'United States of America')]")).click(); // contains para
																									// achar o elemento
																									// equivalente
	}

	private void radiobuttonandCheck() {
		driver.findElement(By.xpath("//div[@id='msdd']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click(); // possível apenas em formato de
																					// listas <li>;
	}

	private void verificacao() {
		assertTrue("Título da página tá errado seu corno", driver.getTitle().contentEquals("Register"));// verificar o
																										// título

		assertTrue(driver.findElement(By.xpath("//label[1]//input[1]")).isSelected()); // verificar se o radio foi
		// selecionado.
	}

	private void primeirosCampos() {
		driver.manage().window().maximize(); // expande a janela

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("João"); // input[@placeholder='First
																								// Name']

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Almeida");// input[@placeholder='Last
																								// Name']

		driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//div//div//textarea"))
				.sendKeys("Rua Prata, 270. Jardim Noumura. Cotia-SP");

		driver.findElement(By.xpath("//div[@id='eid']//input")).sendKeys("vitoralmeida01@gmail.com");

		driver.findElement(By.xpath("//div[4]//div[1]//input[1]")).sendKeys("11920001686");

		driver.findElement(By.xpath("//label[1]//input[1]")).click();

		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	}

	private void dateofBirth() {
		List<WebElement> yearBirth = driver.findElements(By.xpath("//select[@id='yearbox']"));// ano de aniversário

		for (int i = 0; i < yearBirth.size(); i++) {

			System.out.println(yearBirth.get(i).getText());

		}

		Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));

		year.selectByVisibleText("1996");

		List<WebElement> monthBirth = driver.findElements(By.xpath("//select[@placeholder='Month']"));// mês de
																										// aniversário

		for (int i = 0; i < monthBirth.size(); i++) {

			System.out.println(monthBirth.get(i).getText());

		}

		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));

		month.selectByVisibleText("April");

		List<WebElement> dayBirth = driver.findElements(By.xpath("//select[@id='daybox']"));// dia de
		// aniversário

		for (int i = 0; i < dayBirth.size(); i++) {

			System.out.println(dayBirth.get(i).getText());

		}

		Select day = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));

		day.selectByVisibleText("25");
	}

	public void preencheImagem() throws InterruptedException { // enviar imagem para arquivos do tipo type

		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\User\\Pictures\\imagem.png");

	}

	@After
	public void fecharDriver() {

		driver.quit();// fechar a página. Você pode usar o close que ele fecha a aba atual. O quit
		// encerra o processo.
	}

}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage {

//    public MainPage(WebDriver driver){ // конструктор класса MainPage, который принимает объект WebDriver в качестве параметра.
//        setDriver(driver); // Устанавливает переданный объект WebDriver в качестве драйвера для экземпляра класса MainPage
//        driver.get("https://demoqa.com/"); // Переходит на указанный URL-адрес веб-страницы с помощью метода get
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this); /* Инициализирует элементы страницы с помощью PageFactory.
//         *     Она ищет все аннотированные элементы @FindBy в классе MainPage и связывает их с реальными элементами веб-страницы.
//         *     Используется AjaxElementLocatorFactory для ожидания элементов до их появления на странице в течение указанного времени
//         */
//    }

    private void setDriver(WebDriver driver) {
    }


    By textElements = By.xpath("//h5[text()='Elements']");
    By boxElements = By.xpath("//div[contains(@class, 'avatar')]");
    String elements = "Elements";
    String boxElementsJS = "document.querySelector(\".card-body\").click();";

//    public String getTextElements() {
//        return getTextBase(textElements);
//    }


    public boolean validateTextElementsCorrect() {
        return isTextEqual(textElements, elements);
    }

    public void openElementsPage() {
          //clickBase(boxElements);
       jsExecutorBase(boxElementsJS);
    }

}
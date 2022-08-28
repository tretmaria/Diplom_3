package ru.yandex.praktikum.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.XPATH, using = ".//section[2]/div/button")

    private SelenideElement orderButton;
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement accountButton;
    @FindBy(how = How.XPATH, using = ".//h1[text()='Соберите бургер']")
    private SelenideElement createBurgerButton;

    public SelenideElement getCreateBurgerButton() {
        return createBurgerButton;
    }

    public SelenideElement getOrderButton() {
        return orderButton;
    }

    public void clickAccountButton() {
        accountButton.click();
    }
}

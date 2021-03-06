package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.apache.bcel.generic.Select;

public class SearchPage extends BasePage {

    //Products search
    @FindBy(id = "input-search")
    private WebElement keywordsInput;

    //Search by Categories
    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/select/option[4]")
    private WebElement chooseCategory;

    @FindBy(name = "description")
    private WebElement searchInDescriptions;

    @FindBy(name = "sub_category")
    private WebElement searchInSubcategories;

    //Start search
    @FindBy(xpath = "//*[@id = 'button-search']")
    private WebElement startSearchButton;

    public WebElement getKeywordsInput() {
        return keywordsInput;
    }

    public WebElement getChooseCategory() {
        WebElement category = driver.findElement(By.className("form-control"));
        category.selectByVisibleText("Mac");
        return chooseCategory;
    }

    public WebElement getSearchInDescriptions() {
        return searchInDescriptions;
    }

    public WebElement getSearchInSubcategories() {
        return searchInSubcategories;
    }

    public WebElement getStartSearchButton() {
        return startSearchButton;
    }
}

package com.cardlay.test.pagemodel.web.google

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class GoogleSearchPage(private val driver: WebDriver) {

    private var searchInput = By.name("q")
    private var buttonSearch = By.name("btnK")
    private var buttonLuck = By.className("")
    private var login = By.name("btnLogin")

    fun setSearchInputFieldTo(value: String?) {
        driver.findElement(searchInput).sendKeys(value)
    }

    fun clickButtonSearch() {
        driver.findElement(buttonSearch).click()
    }

}

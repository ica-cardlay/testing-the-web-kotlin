package com.cardlay.test.pagemodel.web.google

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class GooglePopup(private val driver: WebDriver) {

    private var buttonAccept = By.id("L2AGLb")

    /**
     * Click the accept button in the cookie data policy popup.
     */
    fun clickButtonAccept() {
        driver.findElement(buttonAccept).click()
    }

}
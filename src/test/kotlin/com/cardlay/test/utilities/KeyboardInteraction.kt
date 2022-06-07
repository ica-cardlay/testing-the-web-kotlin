package com.cardlay.test.utilities

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions

class KeyboardInteraction {

    fun pressKey(driver: WebDriver, key: Keys) {
        val action = Actions(driver)
        action.sendKeys(key).perform()
    }

}
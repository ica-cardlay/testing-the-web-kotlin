package com.cardlay.test.features.web.google

import com.cardlay.test.pagemodel.web.google.GoogleSearchPage
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.net.URISyntaxException
import java.nio.file.Paths

class GoogleSearchTest {

    @Throws(URISyntaxException::class)
    fun getDriverPath(): String? {
        val res = javaClass.classLoader.getResource("geckodriver.exe")!!
        val file = Paths.get(res.toURI()).toFile()
        return file.absolutePath
    }

    @Test
    fun googleTest() {

        // Driver initialization
        getDriverPath()?.let { System.setProperty("webdriver.gecko.driver", it) }
        val driver: WebDriver = FirefoxDriver()

        // basic URL
        val baseUrl = "https://google.com/"

        // Expected title
        val expectedTitle = "mybadtitle"

        // Launch browser
        driver[baseUrl]

        // Something will happen here since WebDriver starts in incognito mode.
        // What will happen, how can we foresee it, and how could we overcome it?

        // Initialize a page from the Page Object Model
        val googleSearchPage = GoogleSearchPage(driver)

        // get the actual value of the title
        val actualTitle = driver.title

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */if (actualTitle.contentEquals(expectedTitle)) {
            println("Test Passed!")
        } else {
            println("Test Failed")
        }

        // Close driver
        driver.close()

    }

    @Test
    fun googleInputTest() {

        // declaration and instantiation of objects/variables
        getDriverPath()?.let { System.setProperty("webdriver.gecko.driver", it) }
        val driver: WebDriver = FirefoxDriver()

        // basic URL
        val baseUrl = "https://google.com/"

        // Launch browser
        driver[baseUrl]

        // Something will happen here since WebDriver starts in incognito mode
        // What will happen and how could we overcome it?

        // Initialize a page from the Page Object Model
        val googleSearchPage = GoogleSearchPage(driver)

        // What to do here?
        googleSearchPage.setSearchInputFieldTo("")

        // What should we assert? How do we know this works?

        // Close driver
        driver.close()
    }

}

package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class base
{
    public static WebDriver driver;

    public static WebDriverWait wait;
    public static Actions action;
    public String browser = "chrome";

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;

    //Web Page Objects:
    public static PageObjects.mainPage mainPage;
    public static PageObjects.mainPagePopup mainPagePopup;
    public static PageObjects.headerBar headerBar;
    public static PageObjects.aboutDropdown aboutDropdown;
    public static PageObjects.contactUsPage contactUsPage;
    public static PageObjects.requestDemoPage requestDemoPage;
    public static PageObjects.bankingSolutions bankingSolutions;
}

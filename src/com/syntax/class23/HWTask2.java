package com.syntax.class23;

public class HWTask2 {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    public static void main(String[] args) {
        WebDriver[]Browser={new ChromeDriver(),new FireFoxDriver()};
        for (WebDriver BrowseCommands:Browser){
            BrowseCommands.openBrowser();
            BrowseCommands.closeBrowser();
            BrowseCommands.maximizeWindow();
            BrowseCommands.findElement();
        }
    }
}

interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Double click on the Google Chrome icon to open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Please click on the red X at the top right corner of the screen to close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on the middle icon of the window in the top right corner of the screen to maximize" +
                "window");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element in Google Chrome application");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Double click on the FireFox icon to open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Please click on the red X at the top right corner of the screen to close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on the middle icon of the window in the top right corner of the screen to maximize" +
                " window");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element in FireFox application");
    }
}
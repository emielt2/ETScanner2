package ETS2;

import geb.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.By.ById;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

public class QuickJavaTry {
    public static void main(String[] args) {

        try{/*
            Class<?> classX = Class.forName("org.openqa.selenium.By");
            Method methodX = classX.getDeclaredMethod("id",String.class);
            By byz ;
            Object objx = new ById("a");

            methodX.invoke("x");


            Class<?> classY = Class.forName("classX.ById");
            org.openqa.selenium.By.ById byx = new org.openqa.selenium.By.ById("a");

            /////--------------------------------------
            Class<?> classZ = Class.forName("org.openqa.selenium.WebDriver");
            WebDriver webDriverZ = new WebDriver() {
                @Override
                public void get(String url) {

                }

                @Override
                public String getCurrentUrl() {
                    return null;
                }

                @Override
                public String getTitle() {
                    return null;
                }

                @Override
                public List<WebElement> findElements(By by) {
                    return null;
                }

                @Override
                public WebElement findElement(By by) {
                    return null;
                }

                @Override
                public String getPageSource() {
                    return null;
                }

                @Override
                public void close() {

                }

                @Override
                public void quit() {

                }

                @Override
                public Set<String> getWindowHandles() {
                    return null;
                }

                @Override
                public String getWindowHandle() {
                    return null;
                }

                @Override
                public TargetLocator switchTo() {
                    return null;
                }

                @Override
                public Navigation navigate() {
                    return null;
                }

                @Override
                public Options manage() {
                    return null;
                }
            };
            Method methodZ = classZ.getDeclaredMethod("findElement", By.class);

            By.ById byidZ = new By.ById("identifier");
            methodZ.invoke(webDriverZ,byidZ);

            //FindsById findsById = new FindsById();

//-------------------------------
            System.out.println(1);
            new MiniClass().printSome(10);
            Integer x = 10;
            Class<?> c = Class.forName("ETS2.MiniClass");
            Object obj = new MiniClass();
            Method method = c.getDeclaredMethod ("printSome",int.class);
            method.invoke (obj, 11);

//            GroovyBrowserDaoETS2 groovyBrowserDaoETS2 = new GroovyBrowserDaoETS2("x");
//            Class<?> c = Class.forName("java.lang.Integer");
            //Class<?> c2 = Class.forName("org.openqa.selenium.By");

       *//*     Class<?> c2 = Class.forName("org.openqa.selenium.WebDriver");
            Browser browser2=new Browser();
            WebDriver webDriver = browser2.getDriver();
            webDriver.findElement(By.id("x"));
            Object obj2 = browser2.getDriver();
            Method method2 = c2.getDeclaredMethod("findElement",By.ById.class);
            method2.invoke(webDriver, "a");

*//*
            *//*Browser browser2=new Browser();
            WebDriver webDriver = browser2.getDriver();
            Class<?> class3 = Class.forName("org.openqa.selenium.By");
            Method method3 = class3.getDeclaredMethod ("id",String.class);
            By.ById byid = new By.ById("identifier");
            WebElement webElement = (WebElement)method3.invoke(webDriver.findElement(byid),"identifier");
            System.out.println(webElement.getText().toString());

            browser2.getDriver().findElement(By.id("nummer")).getText().toString();
*//*


            Method method3 = class3.getDeclaredMethod ("id",String.class);
            By.ById byid = new By.ById("bannerLeft");
            //WebElement webElement = (WebElement)method3.invoke(browser2.getDriver().findElement(byid),"bannerLeftY");
            //System.out.println("CHECK02"+webElement.getText().toString());


            Class<?> c = Class.forName("org.openqa.selenium.By");
            By.ById byIdvar = new By.ById("bannerLeft")
            By.ByClassName
            Class<?> c2 = Class.forName("org.openqa.selenium.By.ById")
            System.out.println("Check03:"+c2.getClass())

            //returnvalue[2] = browser2.getDriver().findElement(By.id("nummer")).getProperties().toString();
            WebElement webElement = browser2.getDriver().findElement(byIdvar);
            println webElement.getText()
            println webElement.getProperties()
            returnvalue[2] = browser2.getDriver().findElement(byIdvar).getProperties().toString();*/

            WebElement webElement=new WebElement() {
                @Override
                public void click() {

                }

                @Override
                public void submit() {

                }

                @Override
                public void sendKeys(CharSequence... keysToSend) {

                }

                @Override
                public void clear() {

                }

                @Override
                public String getTagName() {
                    return null;
                }

                @Override
                public String getAttribute(String name) {
                    return null;
                }

                @Override
                public boolean isSelected() {
                    return false;
                }

                @Override
                public boolean isEnabled() {
                    return false;
                }

                @Override
                public String getText() {
                    return null;
                }

                @Override
                public List<WebElement> findElements(By by) {
                    return null;
                }

                @Override
                public WebElement findElement(By by) {
                    return null;
                }

                @Override
                public boolean isDisplayed() {
                    return false;
                }

                @Override
                public Point getLocation() {
                    return null;
                }

                @Override
                public Dimension getSize() {
                    return null;
                }

                @Override
                public Rectangle getRect() {
                    return null;
                }

                @Override
                public String getCssValue(String propertyName) {
                    return null;
                }

                @Override
                public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
                    return null;
                }
            };
            Class<?> webClass = Class.forName("org.openqa.selenium.WebElement");
            String input = "click";
            Method webMethod = webClass.getDeclaredMethod(input);
            webMethod.invoke(webElement);

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
class MiniClass {
    public  void printSome(int x) {
        System.out.println(x + " " + "PRINTED");
    }
}

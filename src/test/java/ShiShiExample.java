import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShiShiExample {

    @Test
    public void openPageUserMenu(){
        //Set-Cookie: ci_session=e181b767112ac48e4158661303c3fa07fe999326;
        // expires=Wed, 06-Nov-2024 20:52:09 GMT;
        // Max-Age=7200; path=/; HttpOnly
        WebDriver driver = new ChromeDriver();
        driver.get("https://shishi.co.il/auth/user");
        Cookie cookie = new Cookie("ci_session", "e181b767112ac48e4158661303c3fa07fe999326");
        driver.manage().addCookie(cookie);

        pause(10);
        driver.navigate().refresh();

        //driver.quit();
    }
    private void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

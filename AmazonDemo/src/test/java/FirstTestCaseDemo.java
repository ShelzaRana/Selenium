import org.testng.annotations.Test;

public class FirstTestCaseDemo {
    @Test(priority = 1)
    void AmazonChrome(){
        System.out.println("Test Case Passed in Chrome Browser");

    }

    @Test(priority = 2)
    void AmazonFirefox(){
        System.out.println("Test Case Passed in Firefox Browser");

    }
}

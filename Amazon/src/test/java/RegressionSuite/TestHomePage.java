
package RegressionSuite;

import org.testng.annotations.Test;
import regression.Homepage;

public class TestHomePage extends Homepage {

    @Test
    public void loginWithValidPass() {
        clickAccount();
       // writePass();
        //writeUsername("user");

    }




}

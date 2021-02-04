package applicationRunner;

import com.trycloud.utilities.ConfigurationReader;
import org.testng.annotations.BeforeSuite;

public abstract class SuitStarter {
    @BeforeSuite
    public void suitStarter() {
        ConfigurationReader.inputReader();
    }
}

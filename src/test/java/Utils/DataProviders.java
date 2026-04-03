package Utils;

import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataProviders {

    @DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {
        return ExcelUtil.getLoginData();
    }
}
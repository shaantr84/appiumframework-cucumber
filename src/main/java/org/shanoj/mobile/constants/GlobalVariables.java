package org.shanoj.mobile.constants;

import org.shanoj.mobile.enums.Platform;

public class GlobalVariables {
    private GlobalVariables(){
    }
    public static final Platform EXECUTION_PLATFORM = Platform.ANDROID;
    public static final String TEST_DATA_FILE_LOCATION = "/src/test/resources/testdata/testdata.json";
    public static final String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
}

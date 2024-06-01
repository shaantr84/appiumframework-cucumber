package org.shanoj.mobile.utills;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.shanoj.mobile.managers.ConfigurationManager;
import org.shanoj.mobile.model.capabilities.iOSCapabilities;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOSCapbilityBuilder {
    public iOSCapabilities getCapabilities() {
        InputStream getLocalJsonFile = null;
        iOSCapabilities iosCapabilities=null;
        try {
            getLocalJsonFile = Files.newInputStream(Paths.get("./caps/" + ConfigurationManager.getConfiguration().executeOnPlatform().name().toLowerCase() + ".json"));
           iosCapabilities = new ObjectMapper().readValue(getLocalJsonFile, iOSCapabilities.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return iosCapabilities;
    }

}

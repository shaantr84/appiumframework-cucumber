package org.shanoj.mobile.utills;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.shanoj.mobile.managers.ConfigurationManager;
import org.shanoj.mobile.model.capabilities.AndroidCapabilities;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AndroidCapbilityBuilder {

    public AndroidCapabilities getCapabilities() {
        InputStream getLocalJsonFile = null;
        AndroidCapabilities androidCapabilities=null;
        try {
            getLocalJsonFile = Files.newInputStream(Paths.get("./caps/" + ConfigurationManager.getConfiguration().executeOnPlatform().name().toLowerCase() + ".json"));
           androidCapabilities = new ObjectMapper().readValue(getLocalJsonFile, AndroidCapabilities.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return androidCapabilities;
    }
}

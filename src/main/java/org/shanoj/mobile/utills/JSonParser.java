package org.shanoj.mobile.utills;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.shanoj.mobile.exceptions.JsonReaderException;

import java.io.FileReader;
import java.io.IOException;

public final class JSonParser {

    private JSonParser() {
    }

    private static JSONObject obj = null;

    public static void loadJsonFile(String fileName) {
        JSONParser parser = new JSONParser();
        try {
            obj = (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir") + fileName));
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

    public static String readJsonProperty(String... args) throws JsonReaderException {
        JSONObject temp = obj;
        if (args.length == 1) {
            return (String) obj.get(args[0]);

        } else {
            for (int i = 0; i < args.length - 1; i++) {
                temp = (JSONObject) temp.get(args[i]);
            }
            try {
                return (String) temp.get(args[args.length - 1]);
            }catch(NullPointerException e){
                throw new JsonReaderException(
                        "Check the json property in the testdata file again!!!");
            }
        }
    }
}

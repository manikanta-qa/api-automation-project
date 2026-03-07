package utils;

import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {
    public static JsonPath rawToJson(String response) {
        return new JsonPath(response);

    }

    public static String fileConvertor() throws IOException {
        return new String(Files.readAllBytes(Paths.get("C:\\Practice_Projects\\addplacefile.txt")));
    }
}

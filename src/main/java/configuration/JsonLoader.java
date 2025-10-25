package configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonLoader {

    private  final ObjectMapper objectMapper = new ObjectMapper();

    public  RowValidation loadJsonAsObject( String resourceName) throws IOException {
        String json = loadJson( resourceName);
        return objectMapper.readValue(json, RowValidation.class);
    }

    private String loadJson(String jsonPath) throws IOException {

        if (jsonPath != null && !jsonPath.trim().isEmpty()) {
            File file = new File(jsonPath);
            if (file.exists()) {
                return new String(Files.readAllBytes(Paths.get(jsonPath)), StandardCharsets.UTF_8);
            }
        }

        // Otherwise, try from resources
        InputStream inputStream = JsonLoader.class.getClassLoader().getResourceAsStream(jsonPath);
        if (inputStream == null) {
            throw new FileNotFoundException("JSON file not found: " + jsonPath);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append('\n');
        }
        reader.close();
        return sb.toString();
    }


}

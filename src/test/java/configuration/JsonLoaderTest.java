package configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class JsonLoaderTest {

    @InjectMocks
    private JsonLoader jsonLoader;

    @Test
    void loadJsonTest() throws IOException {

        RowValidation user = jsonLoader.loadJsonAsObject("Test.json");
        System.out.println(user);
    }

}
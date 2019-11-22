package restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
    public static String external_id() {
        String external_id = RandomStringUtils.randomAlphabetic(30);
        return external_id;
    }
    public static String name() {
        String name = RandomStringUtils.randomAlphabetic(30);
        return name;
    }

}

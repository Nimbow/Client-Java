package com.nimbow.nimbowapiclient;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Nimbow on 08/12/2015.
 */
public class ApiConfig {

    private static Properties PROPERTIES;

    ApiConfig() throws IOException {

        if (PROPERTIES == null) {

            PROPERTIES = new Properties();

            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("com/nimbow/nimbowapiclient/example/config.properties");

            if (inputStream != null) {
                PROPERTIES.load(inputStream);
            }
            else {
                throw new FileNotFoundException("property file config.properties not found in the classpath");
            }

        }

    }

    public String getProperty(String propName) throws NoSuchFieldException {

        String value = PROPERTIES.getProperty(propName);

        if (value == null) {

            throw new NoSuchFieldException("The property does not exist in the config file");

        }

        return value;

    }

}

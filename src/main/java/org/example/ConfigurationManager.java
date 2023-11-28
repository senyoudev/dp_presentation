package org.example;


import java.util.ArrayList;
import java.util.List;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String apiKey;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }


}
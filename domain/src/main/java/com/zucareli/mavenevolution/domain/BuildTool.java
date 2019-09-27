package com.zucareli.mavenevolution.domain;

public class BuildTool {
    private String key;
    private String name;
    private Language language;

    public BuildTool(String key, String name, Language language) {
        this.key = key;
        this.name = name;
        this.language = language;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}

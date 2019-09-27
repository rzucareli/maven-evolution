package com.zucareli.mavenevolution.service;

import com.zucareli.mavenevolution.domain.BuildTool;
import com.zucareli.mavenevolution.domain.Language;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BuildToolService {

    static final BuildTool MAVEN = new BuildTool("mvn", "Maven", Language.JAVA);
    static final BuildTool ANT = new BuildTool("ant", "Ant", Language.JAVA);
    static final BuildTool GRADLE = new BuildTool("gradle", "Gradle", Language.JAVA);
    static final BuildTool NPM = new BuildTool("npm", "Node Package Manager", Language.JAVASCRIPT);

    private static final BuildTool[] build_tools = {MAVEN, ANT, GRADLE, NPM};

    public List<BuildTool> getAll() {
        return Arrays.asList(build_tools);
    }

    public BuildTool get(String key) {
        return Arrays.stream(build_tools).filter(b -> b.getKey().equals(key)).findFirst().orElse(null);
    }

}

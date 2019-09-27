package com.zucareli.mavenevolution.service;

import com.zucareli.mavenevolution.domain.BuildTool;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BuildToolServiceTest {

    private BuildToolService service = new BuildToolService();

    @Test
    public void shouldReturnAllBuildTools() {
        List<BuildTool> tools = service.getAll();
        Assert.assertThat("Service return all 4 build tools",
                tools,
                CoreMatchers.hasItems(
                        BuildToolService.ANT,
                        BuildToolService.GRADLE,
                        BuildToolService.MAVEN,
                        BuildToolService.NPM
                )
        );
    }


    @Test
    public void shouldReturnSingleBuildTools() {
        BuildTool tool = service.get("npm");
        Assert.assertThat("Service return npm build tool", tool, CoreMatchers.is(BuildToolService.NPM));
    }

}

package com.zucareli.mavenevolution.controller;

import com.zucareli.mavenevolution.domain.BuildTool;
import com.zucareli.mavenevolution.service.BuildToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuildToolController {

    private final BuildToolService buildToolService;

    @Autowired
    public BuildToolController(BuildToolService buildToolService) {
        this.buildToolService = buildToolService;
    }

    @GetMapping(value = "/tools", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BuildTool> findAll() {
        return buildToolService.getAll();
    }

    @GetMapping(value = "/tools/{key}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BuildTool find(@PathVariable String key) {
        return buildToolService.get(key);
    }

}

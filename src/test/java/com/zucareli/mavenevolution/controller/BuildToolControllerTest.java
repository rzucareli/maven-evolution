package com.zucareli.mavenevolution.controller;

import com.zucareli.mavenevolution.service.BuildToolService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BuildToolControllerTest {

    @Mock
    private BuildToolService service;

    private BuildToolController controller;

    @Before
    public void setUp() {
        controller = new BuildToolController(service);
    }

    @Test
    public void shouldReturnAll() {
        controller.findAll();
        Mockito.verify(service).getAll();
        Mockito.verifyNoMoreInteractions(service);
    }


    @Test
    public void shouldReturnOne() {
        controller.find("any");
        Mockito.verify(service).get(Mockito.eq("any"));
        Mockito.verifyNoMoreInteractions(service);
    }

}

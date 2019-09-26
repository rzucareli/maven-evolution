package com.zucareli.mavenevolution;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;

public class MavenWebApplicationInitializer implements WebApplicationInitializer  {

    @Override
    public void onStartup(ServletContext servletCxt) {

        var ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        ctx.setServletContext(servletCxt);

        var servlet = servletCxt.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}

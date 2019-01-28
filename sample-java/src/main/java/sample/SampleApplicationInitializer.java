package sample;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SampleApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return null;
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { Config.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

}

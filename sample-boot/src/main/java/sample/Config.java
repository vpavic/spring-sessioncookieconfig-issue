package sample;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.SessionCookieConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private static final Logger logger = Logger.getLogger(Config.class.getName());

    @Autowired
    public void setServletContext(ServletContext servletContext) {
        try {
            SessionCookieConfig sessionCookieConfig = servletContext.getSessionCookieConfig();
            logger.log(Level.INFO, "Obtained SessionCookieConfig: {0}", sessionCookieConfig);
        }
        catch (Exception ex) {
            logger.log(Level.WARNING, "Cannot obtain SessionCookieConfig", ex);
        }
    }

}

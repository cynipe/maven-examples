package net.cynipe.maven.example.appassembler;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        final InputStream stream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("config.xml");
        final Properties configs = new Properties();
        configs.loadFromXML(stream);
        LOG.info("message: {}", configs.getProperty("message"));
    }
}

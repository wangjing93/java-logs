package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by WangJing on 2017/6/26.
 */
public class Foo {

    static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        logger.debug("Did it again!");
    }
}

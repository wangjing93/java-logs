package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by WangJing on 2017/6/16.
 */
public class HelloWorld1 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.debug("Hello World.");
    }
}

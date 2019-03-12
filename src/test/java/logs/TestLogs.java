package logs;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TestLogs {
	
	private static final  Logger log = LoggerFactory.getLogger(TestLogs.class);
	
	@Test
	public void test1() {
		
		log.debug("debug  test1");
		log.info("info  test1");
		log.error("error  test1");
		
	}
	

}

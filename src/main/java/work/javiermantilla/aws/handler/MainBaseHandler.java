package work.javiermantilla.aws.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MainBaseHandler implements RequestHandler<Object, Object> {

	private static final Logger LOGGER = LogManager.getLogger(MainBaseHandler.class);
	
	@Override
	public Object handleRequest(Object input, Context context) {
		LOGGER.info("hola mundo");
		LOGGER.info("Se recibe el evento : {}", input);
		LOGGER.info("Se recibe el evento type : {}", input.getClass().toString());
		return input;
	}

}

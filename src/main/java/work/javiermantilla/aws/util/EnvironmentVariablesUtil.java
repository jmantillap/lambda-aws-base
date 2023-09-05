package work.javiermantilla.aws.util;

import java.util.Optional;

import work.javiermantilla.aws.exception.ErrorCode;
import work.javiermantilla.aws.exception.TechnicalException;

/**
 * Clase Para obtener los valores de variables de entorno
 * @author javier.mantilla SP 6. 
 * @since Ago/2023
 */
public class EnvironmentVariablesUtil {		
	
	private EnvironmentVariablesUtil() {		
	}	
	/**
	 * Metodo para obtener la variable de entorno
	 * @param nombre nombre de la variable
	 * @return valor de la variable
	 * @throws TechnicalException error
	 * @author javier.mantilla
	 * @since Ago/2023. Sprint 6 HU # 121258
	 */
	public static String getEnvironmentVariableValue(String name) throws TechnicalException {		
		return Optional.ofNullable(getVariableValue(name))
				.orElseThrow(() -> new TechnicalException(
						ErrorCode.TCH_NOT_DEFINED_ENV_VARIABLE.getMessage() + ": " + name));
	}	
	
	
	public static final String getVariableValue(String name){		
		return System.getenv(name);
	}
	
	
	/**
	 * Cargar los valores de las variables de entorno.
	 * 
	 * @return valores de las variables
	 */
//	public static EntryEnvironment loadParametersEnviroment() {
//		EntryEnvironment entry = new EntryEnvironment(EnvironmentVariablesUtil.getVariableValue(Constants.ENV_AWS_ENVIRONMENT_CCB));
//		if (entry.getEnviromentAWS() != null && !entry.getEnviromentAWS().isEmpty() && entry.getEnviromentAWS().equalsIgnoreCase("0")) {
//			entry.setAccessKeyDynamoDB(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_AWS_DYNAMOBD_ACCESSKEY));
//			entry.setSecretKeyDynamoDB(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_AWS_DYNAMODB_SECRETKEY));
//		}
//		entry.setUrlDynamoDB(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_AWS_DYNAMOBD_URL));
//		entry.setTableDynamoDB(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_AWS_DYNAMOBD_TABLE));
//		entry.setRegionDynamoDB(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_AWS_DYNAMODB_REGION));
//		entry.setUrlMaucSSO(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_MAUC_SSO_URL));
//		entry.setTypeDocument(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_MAUC_SSO_TYPE_DOCUMENT));
//		entry.setNumberDocument(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_MAUC_SSO_NUMBER_DOCUMENT));
//		entry.setPasswordUserSico(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_MAUC_SSO_PASSWORD));
//		entry.setNumberMaxAttempts(Integer.parseInt(EnvironmentVariablesUtil.getEnvironmentVariableValue(Constants.ENV_NUMBER_MAX_ATTEMPS)));
//
//		return entry;
//	}
	

}

package work.javiermantilla.aws.util;

/**
 * Clase Constantes SICO
 * @author javier.mantilla SP 6. 
 * @since Ago/2023
 */
public class Constants {

	private Constants() {
		throw new AssertionError();
	}
	
	/*Variables de entorno*/
	public static final String ENV_AWS_ENVIRONMENT_CCB = "ENV_AWS_ENVIRONMENT_CCB";
	public static final String ENV_AWS_DYNAMOBD_ACCESSKEY = "ENV_AWS_DYNAMOBD_ACCESSKEY";
	public static final String ENV_AWS_DYNAMODB_SECRETKEY = "ENV_AWS_DYNAMODB_SECRETKEY";
	public static final String ENV_AWS_DYNAMODB_REGION = "ENV_AWS_DYNAMODB_REGION";	
	public static final String ENV_AWS_DYNAMOBD_URL= "ENV_AWS_DYNAMOBD_URL";
	public static final String ENV_AWS_DYNAMOBD_TABLE= "ENV_AWS_DYNAMOBD_TABLE";	
	
	public static final String ENV_MAUC_SSO_URL= "ENV_MAUC_SSO_URL";
	public static final String ENV_MAUC_SSO_TYPE_DOCUMENT= "ENV_MAUC_SSO_TYPE_DOCUMENT";
	public static final String ENV_MAUC_SSO_NUMBER_DOCUMENT= "ENV_MAUC_SSO_NUMBER_DOCUMENT";
	public static final String ENV_MAUC_SSO_PASSWORD= "ENV_MAUC_SSO_PASSWORD";
	
	
	public static final String ENV_NUMBER_MAX_ATTEMPS = "ENV_NUMBER_MAX_ATTEMPS";
	
	
	
	public static final String MAUC_TIPO_AUTHENTICATION_M = "M";
	public static final String FORMAT_DATE_YYYYMMDD = "yyyy-MM-dd";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String APPLICATION_JSON = "application/json";
	
	
	
	
	
}

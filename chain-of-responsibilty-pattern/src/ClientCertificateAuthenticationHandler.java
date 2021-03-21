
public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

	public ClientCertificateAuthenticationHandler(AuthenticationHandler authType) {
		super(authType);
	}
	
	public void handleRequest(String requestType) {
		if(requestType.equals("ClientCertificateAuth")) {
			System.out.println("Inside client certificate authentication...");
		}
		else {
			super.handelRequest(requestType);
		}
	}

}

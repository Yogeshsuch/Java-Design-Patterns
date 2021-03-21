
public class DigestAuthenticationHandler extends AuthenticationHandler {

	public DigestAuthenticationHandler(AuthenticationHandler authType) {
		super(authType);
	}
	
	public void handleRequest(String requestType) {
		if(requestType.equals("DigestAuth")) {
			System.out.println("Inside digest authentication...");
		}
		else {
			super.handelRequest(requestType);
		}
	}

}

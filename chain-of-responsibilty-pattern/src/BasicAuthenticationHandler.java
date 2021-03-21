
public class BasicAuthenticationHandler extends AuthenticationHandler {

	public BasicAuthenticationHandler(AuthenticationHandler authType) {
		super(authType);
	}
	
	public void handleRequest(String requestType) {
		if(requestType.equals("BasicAuth")) {
			System.out.println("Inside basic authentication...");
		}
		else {
			super.handelRequest(requestType);
		}
	}

}

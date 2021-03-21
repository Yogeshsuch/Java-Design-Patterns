
public abstract class AuthenticationHandler {
	
	public AuthenticationHandler next;
	
	public AuthenticationHandler(AuthenticationHandler authType) {
		this.next = authType;
	}
	
	public void handelRequest(String requestType) {
		if(next != null) {
			this.next.handelRequest(requestType);
		}
	}

}

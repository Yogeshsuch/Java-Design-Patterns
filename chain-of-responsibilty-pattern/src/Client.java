
public class Client {

	public static void main(String[] args) {
		
		AuthenticationHandler chain = new BasicAuthenticationHandler(new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(null)));
		
		chain.handelRequest("BasicAuth");
		chain.handelRequest("DigestAuth");
	}

}

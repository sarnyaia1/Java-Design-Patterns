package behavioral.chainOfResponsibility;

public class Client {

  public static void main(String[] args) {
    AuthenticationHandler chain = new BasicAuthenticationHandler(new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(null)));
    chain.handleRequest("basic");
    chain.handleRequest("client certificate");
    chain.handleRequest("digest");
  }

}

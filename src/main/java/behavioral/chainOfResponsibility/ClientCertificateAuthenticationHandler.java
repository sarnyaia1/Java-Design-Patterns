package behavioral.chainOfResponsibility;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("client certificate")){
      System.out.println("Handling client cerfiticate based request");
    } else {
      super.handleRequest(requestType);
    }
  }

}

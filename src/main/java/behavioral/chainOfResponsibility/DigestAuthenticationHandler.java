package behavioral.chainOfResponsibility;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("digest")){
      System.out.println("Handle digest authentication request");
    } else {
      super.handleRequest(requestType);
    }
  }

}

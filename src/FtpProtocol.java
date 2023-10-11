public class FtpProtocol extends Protocol implements Comunication {
  public FtpProtocol(String host, int port) {
    super(host, port);
    this.createRequest();
    this.createResponse();
  }
  
  @Override
  void open() {
    System.out.println("open with FTP...");
  }
  
  @Override
  void close() {
    System.out.println("closing FTP...");
  }
  
  @Override
  void message() {
    System.out.print("Request: ");
    System.out.print(this.req);
    System.out.print("\nResponse: ");
    System.out.print(this.res + "\n");
  }
  
  @Override
  public Request createRequest() {
    this.req = new FtpRequest();
    return this.req;
  }
  
  @Override
  public Response createResponse() {
    this.res = new FtpResponse();
    return this.res;
  }
}

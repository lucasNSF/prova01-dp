public class HttpProtocol extends Protocol implements Comunication {
  public HttpProtocol(String host, int port) {
    super(host, port);
    this.createRequest();
    this.createResponse();
  }
  
  @Override
  public Request createRequest() {
    this.req = new HttpRequest();
    return this.req;
  }
  
  @Override
  public Response createResponse() {
    this.res = new HttpResponse();
    return this.res;
  }
  
  @Override
  void open() {
    System.out.println("open with HTTP...");
  }
  
  @Override
  void close() {
    System.out.println("closing HTTP...");
  }
  
  @Override
  void message() {
    System.out.print("Request: ");
    System.out.print(this.req);
    System.out.print("\nResponse: ");
    System.out.print(this.res + "\n");
  }
}

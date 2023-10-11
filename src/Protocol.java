public abstract class Protocol {
  private String host;
  private int port;
  protected Request req;
  protected Response res;
  
  public Protocol(String host, int port) {
    this.host = host;
    this.port = port;
  }
  
  abstract void open();
  abstract void close();
  abstract void message();
}

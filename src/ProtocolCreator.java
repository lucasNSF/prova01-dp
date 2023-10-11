public class ProtocolCreator {
  public static Protocol create(TypeProtocol type, String host, int port) throws RuntimeException {
    switch (type) {
      case FTP -> {
        return new FtpProtocol(host, port);
      }
      case HTTP -> {
        return new HttpProtocol(host, port);
      }
      default -> throw new RuntimeException("Protocol not exist!");
    }
  }
}

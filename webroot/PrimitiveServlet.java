import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

  public void init(ServletConfig config) throws ServletException {
    System.out.println("init");
  }

  public void service(ServletRequest request, ServletResponse response)
    throws ServletException, IOException {
    System.out.println("from service");
    PrintWriter out = response.getWriter();
    // 前两个章节中成功返回时，需要正确设置返回结果的格式，否则浏览器会提示发送的响应无效。在后续的章节中会处理sendHeader，因此不需要。
    String okMessage = "HTTP/1.1 200 ok\r\n" +
            "\r\n";
    out.print(okMessage);
    out.println("Hello. Roses are red.");
    out.print("Violets are blue.");
  }

  public void destroy() {
    System.out.println("destroy");
  }

  public String getServletInfo() {
    return null;
  }
  public ServletConfig getServletConfig() {
    return null;
  }

}

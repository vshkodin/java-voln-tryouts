import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput = req.getParameter("input");

        // XSS vulnerability
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Welcome</h1>");
        resp.getWriter().println("<p>You entered: " + userInput + "</p>"); // Potential XSS vulnerability
        resp.getWriter().println("</body></html>");
    }
}

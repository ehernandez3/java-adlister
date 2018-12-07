import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
		// OR
//@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    private int count = 0;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// 5. BONUS
		String reset = req.getParameter("reset");
		if (reset != null)
			count = 0;

		// 5. Create a page that displays a number that goes up by 1 everytime the /count page is viewed.
		count ++;
		res.getWriter().println("<h1>Page Views: " + count + "</h1>");


    }
}

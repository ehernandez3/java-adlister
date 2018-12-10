import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    	String userName = req.getParameter("username");
    	String password = req.getParameter("password");

    	if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
			res.sendRedirect("/profile");

		} else {
    		res.sendRedirect("/login");
		}

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("login.jsp").forward(req, res);
    }
}

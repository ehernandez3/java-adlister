import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    Scanner sc = new Scanner(System.in);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws
            ServletException, IOException {

        // 4. Create a page that displays "Hello World!" when a user visits /hello

//        res.getWriter().println("<h1>Hello World!!!!!!!</h1>");

        // 4. BONUS - Make the page say "Hello, <name>!" if name is passed as part of
        //      the query string (e.g. /hello?name=codeup), otherwise default to "Hello, World!".

        String name = req.getParameter("name");

        if (name == null) name = "World";
        res.getWriter().println("<h1>Hello " + name + "!</h1>");







//        PrintWriter out = res.getWriter();
//
//        String name = req.getParameter("name");
//
//        if (name == null) {
//            name = "world!";
//        }
//        out.println("Hello " + name + "!");



    }
}

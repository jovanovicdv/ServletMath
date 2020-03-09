package math;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletMath
 */
@WebServlet("/math")
public class ServletMath extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMath() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			
		

		int a = 0;
		int b = 0;
		try {
			a = Integer.parseInt(request.getParameter("a"));
			b = Integer.parseInt(request.getParameter("b"));

		} catch (NumberFormatException e) {
			String errorMessage = "ODO JA KUCIIIII";
			request.setAttribute("msg", errorMessage);
		}
		
		HttpSession session = request.getSession();
		
		String operation = request.getParameter("submit");

		int result = 0;
		if (operation.equals("add")) {
			result = a+b;
		} else if (operation.equals("minus")) {
			result = a-b;
		}
		
		
		request.setAttribute("result", result);
		request.setAttribute("a", a);
		request.setAttribute("b", b);

		RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
		
		rd.forward(request, response);
		

	}

	

}

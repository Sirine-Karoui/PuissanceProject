package web;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CalculPuissance;

@WebServlet(name="css", urlPatterns= {"/Conrole","*.do","*.php"})
public class ServletPuissance extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
CalculPuissance p;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		p = new CalculPuissance();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("x", new Puissance());
		request.getRequestDispatcher("Puissance.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double a = Double.parseDouble(request.getParameter("a"));
		Double b = Double.parseDouble(request.getParameter("b"));
		Double x = p.calcul_p(a,b);
		Puissance pui = new Puissance();
		pui.setA(a);
		pui.setB(b);
		pui.setP(x);
		request.setAttribute("x",pui);
		request.getRequestDispatcher("Puissance.jsp").forward(request,response);
	}

}

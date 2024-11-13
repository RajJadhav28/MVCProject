package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOImpl.DaoImplement;
import POJO.Registration;
import Utility.DButility;

/**
 * Servlet implementation class RegServ
 */
@WebServlet("/RegServ")
public class RegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String emailId;
	private String password;
	private String loc;
	private String contact;
	Registration r=null;
	DButility db=null;
	DaoImplement dimpl=new DaoImplement();
	boolean flag;
	String msg,errmsg;
	RequestDispatcher rd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServ() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String process=request.getParameter("process");
		if(process!=null&&process.equals("add")) {
			name=request.getParameter("name");
			emailId=request.getParameter("emailId");
			password=request.getParameter("password");
			loc=request.getParameter("loc");
			contact=request.getParameter("contact");
			 r=new Registration();
			
			 r.setName(name);
			 r.setEmailId(emailId);
			 r.setPassword(password);
			 r.setLoc(loc);
			 r.setContact(contact);
			flag=dimpl.add(r);
			if(flag) {
				msg="Successfully added";
				request.setAttribute("msg", msg);
				RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
				rd.forward(request, response);
				
			}else {
				errmsg="Not added";
				request.setAttribute("errmsg", errmsg);
				RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			}
			 
			 
			 
		}
	}

}

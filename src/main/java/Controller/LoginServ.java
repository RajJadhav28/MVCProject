package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOImpl.LoginDaoImpl;
import POJO.Login;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String emailId;
	private String password;
	private String adminemailId;
	private String adminpassword;
	LoginDaoImpl Logiimpl=new LoginDaoImpl();
	boolean flag,flag1;
	String msg, errmsg, login;
	RequestDispatcher rd;
	HttpSession session=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
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
		 emailId=request.getParameter("emailId");
		 password=request.getParameter("password");
		 session =request.getSession();
		 flag=Logiimpl.UserLogin(emailId, password);
		 flag=Logiimpl.adminLogin1(adminemailId, adminpassword);
		 String username=request.getParameter("emailId");
		 String password1=request.getParameter("password");
		 String adminusername=request.getParameter("adminemailId");
		 String adminpassword1=request.getParameter("adminpassword");
		 
		 
				 
//		 if(flag) {
//			
//			 msg="LoginSuccessfull";
//			 request.setAttribute("msg", msg);
//			 RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
//				rd.forward(request, response);
//			 
//		 }else {
//		
//		 flag=Logiimpl.adminLogin(emailId, password);
//		 if(flag) {
//			 msg="LoginSuccessfull";
//			 request.setAttribute("msg", msg);
//			 RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
//				rd.forward(request, response);
//			 
//		 }else {
//			 errmsg="Not added";
//				request.setAttribute("errmsg", errmsg);
//				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
//				rd.forward(request, response);
//		 }
//		 }
	
		 
		 if(username.equals(emailId)&&password1.equals(password)) {
			 msg="LoginSuccessfull";
			 request.setAttribute("msg", msg);
			 RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
			 rd.forward(request, response);
			 
		 }else if(adminusername.equals(adminemailId)&&adminpassword1.equals(adminpassword)){
			 msg="LoginSuccessfull";
			 request.setAttribute("msg", msg);
			 RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
			 rd.forward(request, response);
		 }else {
			 errmsg="Not added";
				request.setAttribute("errmsg", errmsg);
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
		 }
	}

}

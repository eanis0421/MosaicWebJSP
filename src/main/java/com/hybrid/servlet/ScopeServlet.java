package com.hybrid.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    static Logger log = LoggerFactory.getLogger(ScopeServlet.class);
   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      log.info("#########################");
      log.info("ScopeServlet.doGet().....");
      log.info("#########################");
      
      
 
      /*
       * request scope test
       * 
       */
      Integer rnum = (Integer) request.getAttribute("rnum");
      if (rnum == null)
         request.setAttribute("rnum", 1);
      else
         request.setAttribute("rnum", rnum + 1);
      
      log.info("rnum = " + request.getAttribute("rnum"));
      
      
      /*
       * session scope test
       * 
       */
       HttpSession session = request.getSession();
       Integer snum = (Integer) session.getAttribute("snum");
       
       if (snum == null)
          session.setAttribute("snum", 1);
       else
          session.setAttribute("snum", ++snum);
       
      log.info("snum = " + session.getAttribute("snum"));
      
      
      
      /*
       * application scope test
       * 
       */
      ServletContext application = getServletContext();
      Integer anum = (Integer) application.getAttribute("anum");
      
      if (anum == null)
         application.setAttribute("anum", 1);
      else
         application.setAttribute("anum", ++anum);
      
      log.info("anum = " + application.getAttribute("anum"));
      
      request.getRequestDispatcher("/WEB-INF/jsp/scope.jsp").forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}
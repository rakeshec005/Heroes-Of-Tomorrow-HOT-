

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoadClassifier
 */
@WebServlet("/LoadClassifier")
public class LoadClassifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadClassifier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
	    {
		response.setContentType("text/html");
	    
	   
	   
	     
	    // Vector<Vector<String>> container= new Vector<Vector<String>>();
	    
	 	//Vector<Integer> syntaxCount=new Vector<Integer>();
	 //	String[] lanName=new String[7];
	     DetectingALanguage detect = new DetectingALanguage();
	     String textFromTextarea = request.getParameter("text-code") ;
	     
	     System.out.println("Processing....");
	     
	     detect.getLanguage();
	     detect.languageSyntax();
	     detect.languageDetector(textFromTextarea);
	     String ans = detect.printer();
	     
	     request.setAttribute("languageDetected", ans);
	     request.getRequestDispatcher("/frontend.jsp").forward(request, response);
	     /*PrintWriter writer =  response.getWriter();
	     
	     writer.println("<br><font color=black> Detected Language :"+ans+"</font>");
	     System.out.println("Processed !!!");
	     writer.close();*/
	    }
	    catch(Exception exception)
	    {
	        exception.printStackTrace();    
	    }
	   }
	}




package br.com.bean;

import br.com.controle.Filmes;
import br.com.modelo.ManterFilmes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEditar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                   int codigo = Integer.parseInt(request.getParameter("codigo"));
            
            Filmes fi = new Filmes();
            
             try {
                   ManterFilmes mf = new ManterFilmes();
                   fi = mf.pesquisar(codigo);
                   RequestDispatcher rd = 
                    request.getRequestDispatcher("EditarFilmes.jsp");
                    rd.forward(request, response);}
             
             catch(Exception e){

                       }
             
             
             String msg = "";
                
		if (fi == null) {

			msg = "Não foram encontrados registros.";
			RequestDispatcher enviar = request
					.getRequestDispatcher("ListarFilmes.jsp");
			enviar.forward(request, response);

		} else {
			request.setAttribute("aCodigo", fi.getCodigo());
                        request.setAttribute("aNome", fi.getNome());
			request.setAttribute("aTipo", fi.getTipo());
                        request.setAttribute("aDuracao", fi.getDuracao());
                        request.setAttribute("aCensura", fi.getCensura());
                         request.setAttribute("aProdutora", fi.getProdutora());
			
                        RequestDispatcher listar = request
					.getRequestDispatcher("EditarFilmes.jsp");
			listar.forward(request, response);
		}
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

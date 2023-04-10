
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

public class ServletAlterar extends HttpServlet {

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
               Filmes fi = new Filmes();
               ManterFilmes mf = new ManterFilmes();
               
            int codigo = Integer.parseInt(request.getParameter("codigo"));
                String fNome=request.getParameter("nome");
                String fTipo=request.getParameter("genero"); 
                int fDuracao= Integer.parseInt(request.getParameter("duracao"));
                int fCensura= Integer.parseInt(request.getParameter("censura")); 
                String fProdutora=request.getParameter("produtora");
                
                
                 
                 
                   try {
                   fi.setCodigo(codigo);
                   fi.setNome(fNome);
                   fi.setTipo(fTipo);
                   fi.setDuracao(fDuracao);
                   fi.setCensura(fCensura);
                   fi.setProdutora(fProdutora);
                  
                   mf.editarFilmes(fi);
                   RequestDispatcher rd = 
                    request.getRequestDispatcher("ListarFilmes.jsp");
                    rd.forward(request, response);}
               catch(Exception e){
                   out.println("erro");
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

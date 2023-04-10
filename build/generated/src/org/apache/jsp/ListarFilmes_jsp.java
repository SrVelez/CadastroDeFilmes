package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.controle.Filmes;
import br.com.modelo.ManterFilmes;

public final class ListarFilmes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <!--Fontes do google-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!---->\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Cadastro De Filmes</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <header class=\"header-container\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"FormularioFilmes.jsp\">Cadastrar</a></li>\n");
      out.write("            <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </header><!--Cabeçalho de navegação-->\n");
      out.write("\n");
      out.write("    <main class=\"container-geral-listar\">\n");
      out.write("        <div class=\"corpo-table\">\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("              <tr>\n");
      out.write("                  <th scope=\"col\">Codigo</th>\n");
      out.write("                  <th scope=\"col\">Nome Do Filme</th>\n");
      out.write("                  <th scope=\"col\">Genero Do Filme</th>\n");
      out.write("                  <th scope=\"col\">Duracacao Do Filme</th>\n");
      out.write("                  <th scope=\"col\">Censura Do Filme</th>\n");
      out.write("                  <th scope=\"col\">Nome Da Produtora</th>\n");
      out.write("                  <th scope=\"col\"></th>\n");
      out.write("                  <th scope=\"col\"></th>\n");
      out.write("    </tr>\n");
      out.write("            </thead>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("        ");

          String fcodigo="";
          String fnome="";
          String fgenero="";
          String fduracao="";
          String fcensura="";
          String fprodutora="";
          
         
          String vcontador="";
          
         
           ManterFilmes mf = new ManterFilmes();
           Filmes fi = new Filmes();
             ArrayList<Filmes> nt = mf.pesquisarTudo();  
             
            for (int i = 0; i < nt.size(); i++) {                
                fi = nt.get(i);
              fcodigo= String.valueOf(fi.getCodigo());
              fnome = String.valueOf(fi.getNome());
              fgenero = String.valueOf(fi.getTipo());
              fduracao = String.valueOf(fi.getDuracao());
              fcensura = String.valueOf(fi.getCensura());
              fprodutora = String.valueOf(fi.getDuracao());
              
             
               
      out.write("\n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"row\">");
      out.print(fcodigo);
      out.write("</th>\n");
      out.write("              <td>");
      out.print(fnome);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(fgenero);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(fduracao);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(fcensura);
      out.write("</td>\n");
      out.write("              <td>");
      out.print(fprodutora);
      out.write("</td>\n");
      out.write("              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("              <td><a href=\"ServletEditar?codigo=");
      out.print(fcodigo);
      out.write("\" >Alterar</a>\n");
      out.write("              \n");
      out.write("              </td>\n");
      out.write("              <td>\n");
      out.write("                  <a href=\"ServletDeletar?codigo=");
      out.print(fcodigo);
      out.write("\" onclick=\"return confirm('Confirma exclusão do registro ");
      out.print(fnome);
      out.write("?')\">excluir </a>   \n");
      out.write("                 \n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("            ");
} 
        
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

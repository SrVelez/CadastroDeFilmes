
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.controle.Filmes"%>
<%@page import="br.com.modelo.ManterFilmes"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!--Fontes do google-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
    
    <!---->

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro De Filmes</title>
    <link rel="stylesheet" href="Style.css">

</head>
<body>
    
    <header class="header-container">
        <ul>
            <li><a href="FormularioFilmes.jsp">Cadastrar</a></li>
        </ul>
    </header><!--Cabeçalho de navegação-->

    <main class="container-geral-listar">
        <div class="corpo-table">
        <table>
            <thead>
              <tr>
                  <th scope="col">Codigo</th>
                  <th scope="col">Nome Do Filme</th>
                  <th scope="col">Genero Do Filme</th>
                  <th scope="col">Duracacao Do Filme</th>
                  <th scope="col">Censura Do Filme</th>
                  <th scope="col">Nome Da Produtora</th>
                  <th scope="col"></th>
                  <th scope="col"></th>
    </tr>
            </thead>
  
  
        <%
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
              fprodutora = String.valueOf(fi.getProdutora());
              
             
               %>
              
            <tr>
              <th scope="row"><%=fcodigo%></th>
              <td><%=fnome%></td>
              <td><%=fgenero%></td>
              <td><%=fduracao%></td>
              <td><%=fcensura%></td>
              <td><%=fprodutora%></td>
              
           
            
              <td>
                  <td><a href="ServletEditar?codigo=<%=fcodigo%>" >Alterar</a>
              
              </td>
              <td>
                  <a href="ServletDeletar?codigo=<%=fcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=fnome%>?')">excluir </a>   
                 
              </td>
            </tr>
          
            <%} 
        %>
         
        </table>
</html>

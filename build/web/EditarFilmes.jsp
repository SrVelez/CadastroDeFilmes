
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%  
         String fCodigo="";
          String fNome="";
          String fTipo="";
          String fDuracao="";
          String fCensura="";
          String fProdutora="";
          
       
         fCodigo = (String) request.getAttribute("aCodigo").toString();
         fNome    = (String) request.getAttribute("aNome").toString();
         fTipo   = (String) request.getAttribute("aTipo").toString();
         fDuracao = (String) request.getAttribute("aDuracao").toString();
         fCensura   = (String) request.getAttribute("aCensura").toString();
         fProdutora   = (String) request.getAttribute("aProdutora").toString();
        
    %>
    <body>
       <%@include file="menu.jsp" %>
        
        <header>
            <h3 class="h3 text-center" >Alterar este Filme?</h3><br/>
        </header>
        
        <div class="col-md-offset-4 col-md-4">
            <div class="well well-lg"> 
        
                <form name="form" action="ServletAlterar" method="post">
                     Código do Filme: <span class="badge"> <%=fCodigo%></span>
                    <input type="hidden" name="codigo" value="<%=fCodigo%>">
                    <br/>
                    
                    <div class="form-group">
                        <label class="control-label" for="nome">Nome Do Filme:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-user"></span> 
                            </div>   
                            <input type="text" name="nome" value="<%=fNome%>" class="form-control" id="nome">  
                        </div>
                    </div>
                  
                                          
                    <div class="form-group">
                        <label class="control-label" for="genero">Genero Do Filme:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span> 
                            </div>  
                            <input type="text" name="genero" value="<%=fTipo%>" class="form-control" id="tipo">
                        </div>
                    </div>
                        
                    <div class="form-group">
                        <label class="control-label" for="teor">Duracao Do Filme:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span> 
                            </div>  
                            <input type="number" name="duracao" value="<%=fDuracao%>" class="form-control" id="teor">
                        </div>
                    </div>
                        
                    <div class="form-group">
                        <label class="control-label" for="tipo">Censura Do Filme:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span> 
                            </div>  
                            <input type="number" name="censura" value="<%=fCensura%>" class="form-control" id="ano">
                        </div>
                    </div>
                        
                        
                         <div class="form-group">
                        <label class="control-label" for="tipo">Nome Da Produtora:</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-lock"></span> 
                            </div>  
                            <input type="text" name="produtora" value="<%=fProdutora%>" class="form-control" id="marca">
                        </div>
                    </div>
                        
                        
                   <input type="submit" value="Alterar" class="btn btn-info">
                </form>
            </div>
        </div>
        
    </body>
</html>
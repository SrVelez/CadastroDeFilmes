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
    <title>Cadastro de Filmes</title>
    <link rel="stylesheet" href="Style.css">

</head>
<body>
    
    <header class="header-container">
        <ul>
            <li><a href="FormularioFilmes.jsp">Cadastro</a></li>
            <li><a href="ListarFilmes.jsp">Listar Filmes</a></li>
        </ul>
    </header><!--Cabeçalho de navegação-->

    <main class="container-geral">
        <main class="container-geral">
            <div class="form-container">
                
                <div class="form">
                    <form method="post" action="Filmes.do">
                        <h1 class="display-3">Cadastro De Filmes</h1>
                        <p> Nome Do Filme: <input type="text" name="nome"> </p> 
                        <p> Genero Do Filme: <input type="text" name="genero"> </p>
                        <p> Duracao Do Filme: <input type="text" name="duracao"> </p> 
                        <p> Censura Do Filme: <input type="text" name="censura"> </p>
                        <p> Nome Da Produtora: <input type="text" name="produtora"> </p> 
                        <input type="submit" value="Cadastrar">
                    </form>
                </div>
            </div>
        </main>
    </main>
    
    <footer>
        <p>Feito por  Diego Santana</p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>
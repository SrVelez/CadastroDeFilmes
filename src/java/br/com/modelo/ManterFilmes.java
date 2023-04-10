
package br.com.modelo;

import br.com.controle.Filmes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ManterFilmes extends DAO{
     public void inserir(Filmes fi) throws Exception {
    try {
    abrirBanco();
    String query = "INSERT INTO filmes (codigo,nomedofilme,tipo,duracao,idadecensura,nomeprodutora) "
            + "values(null,?,?,?,?,?)";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, fi.getNome());
    ps.setString(2, fi.getTipo());
    ps.setInt(3, fi.getDuracao());
    ps.setInt(4, fi.getCensura());
    ps.setString(5, fi.getProdutora());
    
    ps.execute();
    fecharBanco();
    } catch (Exception e) {
        System.out.println("Erro " + e.getMessage());
    }
   } 

     
     public ArrayList pesquisarTudo(){
   ArrayList<Filmes> listacer = new ArrayList<Filmes>();
         try{
         abrirBanco();  
         String query = "select  * FROM filmes";
         ps = con.prepareStatement(query);
         ResultSet rs = ps.executeQuery();
         Filmes fl ;
         while (rs.next()){ 
           fl = new Filmes();
           fl.setCodigo(rs.getInt("codigo"));
           fl.setNome(rs.getString("nomedofilme"));
           fl.setTipo(rs.getString("tipo"));
           fl.setDuracao(rs.getInt("duracao"));
           fl.setCensura(rs.getInt("idadecensura"));
           fl.setProdutora(rs.getString("nomeprodutora"));
           listacer.add(fl); 
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return listacer;
     }
     
     public void deletar(Filmes fi) throws Exception{
         abrirBanco();
         String query = "delete FROM filmes where codigo=?";
         ps=(PreparedStatement) con.prepareStatement(query);
         ps.setInt(1, fi.getCodigo());
         ps.execute();
        fecharBanco();  
   }
     
      public void editarFilmes(Filmes fi) throws Exception {
        abrirBanco();
        String query = "UPDATE filmes set nomedofilme = ?, tipo = ?, duracao = ?, idadecensura = ?, nomeprodutora = ? where codigo = ?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, fi.getNome());
        ps.setString(2, fi.getTipo());
        ps.setInt(3, fi.getDuracao());
        ps.setInt(4, fi.getCensura());
        ps.setString(5, fi.getProdutora());
        ps.setInt(6, fi.getCodigo());
        ps.executeUpdate();
        fecharBanco();
    }   
      
      
      public Filmes pesquisar(int codigo) throws Exception {
         try {
            Filmes fi = new Filmes();
            System.out.println(" Chegou no pesquisar registo" + codigo);
            abrirBanco();
            String query = "select * FROM filmes where codigo=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              fi.setCodigo(rs.getInt("codigo"));
              fi.setNome(rs.getString("nomedofilme"));
              fi.setTipo(rs.getString("tipo"));
              fi.setDuracao(rs.getInt("duracao"));
              fi.setCensura(rs.getInt("idadecensura"));
              fi.setProdutora(rs.getString("nomeprodutora"));
              
             
                return fi;
            }
            fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
    return null;
	}

     
}
     


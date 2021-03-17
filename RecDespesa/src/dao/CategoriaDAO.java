/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Categoria;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Back
 */
public class CategoriaDAO implements IDAOT<Categoria> {

    @Override
    public boolean salvar(Categoria c) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = ""
                    + "INSERT INTO categoria VALUES ( "
                    + "default, "
                    + "'" + c.getDescricao() + "'"
                    + ")";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar usuário: " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Categoria o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

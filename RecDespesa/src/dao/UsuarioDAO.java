/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Eduardo Back
 */
public class UsuarioDAO {
    ResultSet resultadoQ = null;
    public boolean autenticar(String usuario, String senha) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuario "
                    + "WHERE "
                    + "username = '" + usuario + "' AND "
                    + "senha = '" + senha + "'";

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            return resultadoQ.next();

        } catch (Exception e) {
            System.out.println("Erro ao autenticar: " + e);
            return false;
        }
    }
    
}

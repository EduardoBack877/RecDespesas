/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author pretto
 */
public class CombosDAO {

    ResultSet resultado = null;

    // construtor 1
    public void popularCombo(String tabela, JComboBox combo) {
        
        combo.removeAllItems();

        ComboDescricao descricao = new ComboDescricao();
        descricao.setId(0);
        descricao.setDescricao("Selecione");
        combo.addItem(descricao);

        try {
            resultado = new ConexaoBD().getConnection().createStatement().executeQuery("select * from " + "categoria");

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    descricao = new ComboDescricao();
                    descricao.setId(resultado.getInt(1));
                    descricao.setDescricao(resultado.getString(2));

                    combo.addItem(descricao);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    // construtor 2
    public void popularCombo(String tabela, String campo1, String campo2, JComboBox combo, String complementoSQL) {

        combo.removeAllItems();
        
        ComboDescricao descricao = new ComboDescricao();
        descricao.setCodigo(0);
        descricao.setDescricao("Selecione");
        combo.addItem(descricao);

        try {
            resultado = new ConexaoBD().getConnection().createStatement().executeQuery("select * from " + tabela + " " + complementoSQL);

            if (resultado.isBeforeFirst()) {
                while (resultado.next()) {
                    descricao = new ComboDescricao();
                    descricao.setCodigo(resultado.getInt(campo1));
                    descricao.setDescricao(resultado.getString(campo2));

                    combo.addItem(descricao);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao popular Combo = " + e.toString());
        }
    }

    public void definirItemCombo(JComboBox combo, ComboDescricao descricao) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (((ComboDescricao) combo.getItemAt(i)).getCodigo() == (descricao.getCodigo())) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.control;

import engsoft.data.Peca_DAO;

/**
 *
 * @author lucassilva
 */
public class Tp_eng_soft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peca peca = new Peca();
        Peca_DAO pe = new Peca_DAO();
        peca.setNome("lala");
        pe.adPeca(peca);
        // TODO code application logic here
    }
}

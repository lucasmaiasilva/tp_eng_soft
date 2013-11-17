/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import tp_eng_soft.Peca;

/**
 *
 * @author Lucas
 */
public class InsereNaMao {
    
    
    public static void main(String[] args){
        Peca peca = new Peca();
        Peca_DAO pe = new Peca_DAO();
        peca.setNome("motor");
        pe.adPeca(peca);
    }
    
}

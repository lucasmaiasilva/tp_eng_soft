package testes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import database.Peca_DAO;
import org.junit.Test;
import org.junit.Assert.*;
import tp_eng_soft.Peca;
/**
 *'
 * @author gsnasc
 */
public class Teste {
    
    @Test
    public void teste1(){
        Peca peca = new Peca();
        Peca_DAO pe = new Peca_DAO();
        peca.setNome("carcaca");
        pe.adPeca(peca);
        
    }
    
    
}

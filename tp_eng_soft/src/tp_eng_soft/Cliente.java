/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

/**
 *
 * @author gsnasc
 */
public class Cliente extends Pessoa {
    
        private int id_func;
        private int data_registro;
        private String CPF;
        private String endereço;
        private String cidade;

    public String getCPF() {
        return CPF;
    }

    public String getCidade() {
        return cidade;
    }

    public int getData_registro() {
        return data_registro;
    }

    public String getEndereço() {
        return endereço;
    }
            
        
}

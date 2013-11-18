/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.control;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author gsnasc
 */
@Entity
public class Cliente extends Pessoa { //Classe responsável pelo cadastro do cliente no sistema
    
    
        @Id
         @GeneratedValue
        private int id_cliente;
        private String data_registro;
        private String cpf;
        private String endereco;
        private String cidade;

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

                
    public String getCPF() {
        return cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getData_registro() {
        return data_registro;
    }

    public String getEndereco() {
        return endereco;
    }
            
        
}

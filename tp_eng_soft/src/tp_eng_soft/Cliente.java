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
    
        private int id_cliente;
        private int data_registro;
        private String cpf;
        private String endereco;
        private String cidade;

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setData_registro(int data_registro) {
        this.data_registro = data_registro;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

                
    public String getCPF() {
        return cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public int getData_registro() {
        return data_registro;
    }

    public String getEndereço() {
        return endereco;
    }
            
        
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

/**
 *
 * @author lucassilva
 */
public class Fabricante {
    
    private int fab_id;
    private String nome;
    private String endereco;
    private int telefone;

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    
    public String getEndereço() {
        return endereco;
    }

    public int getFab_id() {
        return fab_id;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }
    
}

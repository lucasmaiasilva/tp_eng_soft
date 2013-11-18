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
 * @author lucassilva
 */
@Entity
public class Fabricante { //Classe responsável pelo cadastro do fabricante
    
    @Id
    @GeneratedValue
    private int fab_id;
    private String nome;
    private String endereco;
    private String telefone;

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
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

    public String getTelefone() {
        return telefone;
    }
    
}

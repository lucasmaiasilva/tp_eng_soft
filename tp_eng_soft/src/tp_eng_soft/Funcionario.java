/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author gsnasc
 */

@Entity
public class Funcionario extends Pessoa {
    
    
    private String login;
    private String senha;
    @Id
    @GeneratedValue
    private int id_func;
    private String cart_trabalho;
    private String data_ingresso;
    private String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCart_trabalho(String cart_trabalho) {
        this.cart_trabalho = cart_trabalho;
    }

    public void setData_ingresso(String data_ingresso) {
        this.data_ingresso = data_ingresso;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public int getId_func() {
        return id_func;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    
    public String getCargo() {
        return cargo;
    }

    public String getCart_trabalho() {
        return cart_trabalho;
    }

    public String getData_ingresso() {
        return data_ingresso;
    }
    
    
    
}

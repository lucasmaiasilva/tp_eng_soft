/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

/**
 *
 * @author gsnasc
 */
public class Funcionário extends Pessoa {
    
    private String login;
    private String senha;
    private int id_func;
    private String cart_trabalho;
    private String data_ingresso;
    private String cargo;

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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.control;

/**
 *
 * @author lucassilva
 */
public class Pessoa { //Entidade que mãe que compõe cliente e funcionário
    
    
    private String nome;
    private char genero;
    private String tel;
    private String rg;
    private String data_nasc;

    public void setRG(String RG) {
        this.rg = RG;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.genero = sexo;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    
    public String getRG() {
        return rg;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return genero;
    }

    public String getTel() {
        return tel;
    }
    
    
    
    
    
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

/**
 *
 * @author gsnasc
 */
public class Peca {
    
    private int peca_id;
    private String nome;
    private String fabricante;
    private String lote;
    private int qtde_estoque;

    public void setQtde_estoque(int qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }
    
    

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde_estoque() {
        return qtde_estoque;
    }
    
    

    public String getFabricante() {
        return fabricante;
    }

    public String getLote() {
        return lote;
    }

    public String getNome() {
        return nome;
    }

    public int getPeca_id() {
        return peca_id;
    }
    
    
}

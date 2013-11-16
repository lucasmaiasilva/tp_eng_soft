    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_eng_soft;

/**
 *
 * @author gsnasc
 */
public class Eletrodomestico {
    
    private int id_eletro;
    private String modelo;
    private Fabricante fabricante; //  acho melhor so fazer referencia ao id_Fabricante do que instanciar um novo objeto
    private String data_fab;
    private String status;
    //String defeito;
    //int qtidade;

    public String getStatus() {
        return status;
    }

    
    
    public String getData_fab() {
        return data_fab;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setData_fab(String data_fab) {
        this.data_fab = data_fab;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}

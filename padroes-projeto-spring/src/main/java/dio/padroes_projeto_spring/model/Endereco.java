package dio.padroes_projeto_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    
    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    /* Getters */
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getDdd() {
        return ddd;
    }
    public String getGia() {
        return gia;
    }
    public String getIbge() {
        return ibge;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getSiafi() {
        return siafi;
    }
    public String getUf() {
        return uf;
    }

    /* Setters */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public void setGia(String gia) {
        this.gia = gia;
    }
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
}

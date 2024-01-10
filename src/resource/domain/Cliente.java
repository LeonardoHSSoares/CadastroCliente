package resource.domain;

public class Cliente {

    private String nome;

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Cliente cliente = (Cliente) object;

        if (!java.util.Objects.equals(nome, cliente.nome)) return false;
        if (!java.util.Objects.equals(cpf, cliente.cpf)) return false;
        if (!java.util.Objects.equals(tel, cliente.tel)) return false;
        if (!java.util.Objects.equals(endereco, cliente.endereco)) return false;
        if (!java.util.Objects.equals(numCasa, cliente.numCasa)) return false;
        if (!java.util.Objects.equals(cidade, cliente.cidade)) return false;
        return java.util.Objects.equals(estado, cliente.estado);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (numCasa != null ? numCasa.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    private Long cpf;
    private Long tel;
    private String endereco;
    private Integer numCasa;
    private String cidade;
    private String estado;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Long getTel() {
        return tel;
    }
    public void setTel(Long tel) {
        this.tel = tel;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Integer getNumCasa() {
        return numCasa;
    }
    public void setNumCasa(Integer numCasa) {
        this.numCasa = numCasa;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


}

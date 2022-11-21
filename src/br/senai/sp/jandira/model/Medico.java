package br.senai.sp.jandira.model;

public class Medico {

    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;

    private static int contador = 99;
    private Integer codigo;

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    //Construtores
    public Medico() { //DEFAULT
        gerarCodigo();
    }

    public Medico(
            String nome,           
            String telefone,
            String email,
            String crm,
            Especialidade[] especialidades) {

        
        this.nome = nome;
        this.especialidades = especialidades;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        
        gerarCodigo();

    }

    public Medico(
            String nome,           
            String telefone,
            String email,
            String crm,
            Integer codigo,
            Especialidade[] especialidades) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.codigo = codigo;
        this.especialidades = especialidades;

        gerarCodigo();
    }
    
    public Medico( //tabela
            Integer codigo,
            String crm,
            String nome,
            String telefone){
        
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        
        gerarCodigo();
        
    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public String getMedicoSeparadoPorPontoEVirgula(){
        return this.codigo + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.crm + ";" + this.especialidades;
    }
}

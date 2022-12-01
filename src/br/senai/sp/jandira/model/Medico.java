package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {
    
    
    private String crm;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private Especialidade[] especialidades;
   

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
            String crm,
            String nome,           
            String telefone,
            String email,
            LocalDate dataNascimento,
            Especialidade[] especialidades) {

        
        this.nome = nome;
        this.especialidades = especialidades;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        
        gerarCodigo();

    }

    public Medico(
            Integer codigo,
            String crm,
            String nome,           
            String telefone,
            String email,
            LocalDate dataNascimento
            
            ) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.codigo = codigo;
        
        this.dataNascimento = dataNascimento;

        gerarCodigo();
    }
    
    public Medico( //tabela
            Integer codigo,
            String crm,
            String nome,
            String telefone
             ){
        
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    

    public String getMedicoSeparadoPorPontoEVirgula(){
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.dataNascimento;
    }
}

package br.senai.sp.jandira.model;

import br.senai.sp.jandira.ui.PlanosDeSaudeDialog;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class PlanoDeSaude {

    // atributos
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;

    private static int contador = 99;
    private Integer codigo;

    //
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    //metodos construtores

    public PlanoDeSaude() { //DEFAULT
        gerarCodigo();
    }

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        gerarCodigo();

    }

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        gerarCodigo();
    }
    
    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade, Integer codigo) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        this.codigo = codigo;
        this.contador = codigo;
    }

    // metodos
    public void setOperadora(String operadora) {

        this.operadora = operadora;

    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {

        this.numero = numero;

    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public static int getQuantidade() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigoP(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PlanoDeSaude.contador = contador;
    }

    public String getPlanoDeSaudeSeparadoPorPontoEVirgula(){
        return this.codigo + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.validade;
    }
    
}

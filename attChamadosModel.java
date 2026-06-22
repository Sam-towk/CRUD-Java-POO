/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabchamdospoo;

/**
 *
 * @author Samuel
 */
public class attChamadosModel {

    private String ticket;
    private String usuario;
    private String setor;
    private String problema;
    private double custo;
    private boolean resolvido;

    public attChamadosModel() {
    }

    public attChamadosModel(String usuario, String ticket, String setor, String problema, double custo, boolean resolvido) {
        this.ticket = ticket;
        this.setor = setor;
        this.problema = problema;
        this.custo = custo;
        this.resolvido = resolvido;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
}

package com.example.demo.DTO;

import jakarta.persistence.Column;

import java.io.Serializable;

public class CuentasDTO implements Serializable {

    private String numero;
    private String alias;
    private String estado;
    private String tipo_cuenta;
    private double balance;
    private double interes;

    public CuentasDTO(String numero, String alias, String estado, String tipo_cuenta, double balance, double interes) {

        this.numero = numero;
        this.alias = alias;
        this.estado = estado;
        this.tipo_cuenta = tipo_cuenta;
        this.balance = balance;
        this.interes = interes;
    }

    public CuentasDTO() {

    }



    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

}

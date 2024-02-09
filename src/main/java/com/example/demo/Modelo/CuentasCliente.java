package com.example.demo.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name ="cuentas_cliente")
public class CuentasCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "numero_cuenta", nullable = false)
    private String numerocuenta;
    @Column(name = "id_cliente", nullable = false)
    private Long idcliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }
}

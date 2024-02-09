package com.example.demo.Mapping;

import com.example.demo.DTO.CuentasDTO;
import com.example.demo.Modelo.Cuentas;

import java.util.Date;

public class CuentasMap {

    public static CuentasDTO mapCuenta(Cuentas cuentas){
        CuentasDTO cuentasDTO = new CuentasDTO();
        cuentasDTO.setNumero(cuentas.getNumero());
        cuentasDTO.setAlias(cuentas.getAlias());
        cuentasDTO.setEstado(cuentas.getEstado());
        cuentasDTO.setTipo_cuenta(cuentas.getTipo_cuenta());
        cuentasDTO.setBalance(cuentas.getBalance());
        cuentasDTO.setInteres(cuentas.getInteres());


        return cuentasDTO;


    }

    public  static  Cuentas mapCuentasDTO(CuentasDTO cuentasDTO){
        Cuentas cuentas = new Cuentas();
        cuentas.setNumero(cuentasDTO.getNumero());
        cuentas.setAlias(cuentasDTO.getAlias());
        cuentas.setEstado(cuentasDTO.getEstado());
        cuentas.setTipo_cuenta(cuentasDTO.getTipo_cuenta());
        cuentas.setBalance(cuentasDTO.getBalance());
        cuentas.setInteres(cuentasDTO.getInteres());
        cuentas.setFecha_creacion(new Date());

        return cuentas;

    }
}

package com.example.demo.Interface;

import com.example.demo.DTO.CuentasDTO;

import java.util.List;

public interface CuentaInterface {

    public List<CuentasDTO> Obtener();


    public String Eliminar(String numero);
    public  String Guardar(CuentasDTO cuentasDTO);
    public String Actualizar(CuentasDTO cuentasDTO);
}

package com.example.demo.Services;

import com.example.demo.DTO.CuentasDTO;
import com.example.demo.Interface.CuentaInterface;
import com.example.demo.Mapping.CuentasMap;
import com.example.demo.Modelo.Cuentas;
import com.example.demo.Repository.CuentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.Mapping.CuentasMap.mapCuentasDTO;
@Service
public class CuentaService implements CuentaInterface {

    @Autowired
    private CuentasRepository cuentasRepository;


    @Override
    public List<CuentasDTO> Obtener() {
        List<CuentasDTO> cuentasDTOS = new ArrayList<>();
        cuentasRepository.findAll().forEach(x->cuentasDTOS.add(CuentasMap.mapCuenta(x)));
        return cuentasDTOS;
    }


    @Override
    public String Eliminar(String numero) {
        Cuentas cuentasDTO;
        cuentasDTO=cuentasRepository.findById(numero).get();
        cuentasRepository.delete(cuentasDTO);
        return "";
    }

    @Override
    public String Guardar(CuentasDTO cuentasDTO) {
        Cuentas cuentas = mapCuentasDTO(cuentasDTO);
        cuentasRepository.save(cuentas);
        return "Cuenta guardada con éxito.";
    }

    @Override
    public String Actualizar(CuentasDTO cuentasDTO) {
        return null;
    }


}

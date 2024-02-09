package com.example.demo.Interface;

import com.example.demo.Modelo.Cliente;

import java.util.List;

public interface ClienteInterface {
    public List<Cliente> Obtener();
    public String Eliminar(Long id_cliente);
    public  String Guardar(Cliente cliente);
    public String Actualizar(Cliente cliente);





}

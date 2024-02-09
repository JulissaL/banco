package com.example.demo.Services;


import com.example.demo.Interface.ClienteInterface;
import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.Cuentas;
import com.example.demo.Repository.ClienteRepository;

import java.util.List;

public class ClienteService implements ClienteInterface {
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> Obtener() {
        return clienteRepository.findAll();

    }

    @Override
    public String Eliminar(Long id_cliente) {
        Cliente cliente;
        cliente=clienteRepository.findById(id_cliente).get();
        clienteRepository.delete(cliente);
        return "";
    }

    @Override
    public String Guardar(Cliente cliente) {
        return null;
    }

    @Override
    public String Actualizar(Cliente cliente) {
        return null;
    }

}

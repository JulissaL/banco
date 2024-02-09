package com.example.demo.Controles;

import com.example.demo.DTO.CuentasDTO;
import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.Cuentas;
import com.example.demo.Services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CuentaController {
    @GetMapping(value = "/hola")//METODO QUE CONSULTA EL LISTADO DE CUENTAS
    public String hola() {

        return "hola";
    }

    @Autowired
    CuentaService cuentaService;

    @PostMapping("/Guardar")
    public String Guardar(@RequestBody CuentasDTO cuentasDTO){
        String x = cuentaService.Guardar(cuentasDTO);

        return x;
    }

/*
    @GetMapping("/cuentas")
    public ResponseEntity<List<CuentasDTO>> findCuentas() {
        List<CuentasDTO> cuentas = cuentaService.Obtener();
        return ResponseEntity.ok(cuentas);
    }*/
/*
    @PostMapping("accounts")
    //crea un nuevo usuario en la base de datos
    public ResponseEntity<Cuentas> guardarCuentas(@RequestBody Cuentas cuentas){
        Cuentas nuevo_cuenta= cuentaService.(cuentas);
        return new ResponseEntity<>(nuevo_cliente, HttpStatus.CREATED);
    }

    @GetMapping("accounts/{id}")
    //seleciona solo un usuario en la base de datos
    public ResponseEntity<Cliente> obtenerClienteId(@PathVariable long id){
        Cliente clientePorId = clienteservicio.obtenerPorId(id);
        return ResponseEntity.ok(clientePorId);
    }

    @PutMapping("accounts/{id}")
    //modifica un usuario que este en la base de datos
    public ResponseEntity<Cliente> modificarId(@PathVariable long id, @RequestBody Cliente cliente) {
        Cliente clienteModificado = clienteservicio.modificarId(id, cliente);

        if (clienteModificado != null) {
            return ResponseEntity.ok(clienteModificado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("accounts/{id}")
    //se elimina el cliente que se desea eliminar
    public ResponseEntity<HashMap<String,Boolean>> eliminarCliente(@PathVariable long id){
        this.clienteservicio.eliminar(id);

        HashMap<String, Boolean> estadoClienteEliminado = new HashMap<>();
        estadoClienteEliminado.put("eliminado", true);
        return ResponseEntity.ok(estadoClienteEliminado);
    }*/



}

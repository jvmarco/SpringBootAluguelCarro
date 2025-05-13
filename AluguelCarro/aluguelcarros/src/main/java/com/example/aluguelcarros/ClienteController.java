package com.example.aluguelcarros;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @PostMapping
    public String cadastrarCliente(@RequestBody Cliente cliente) {
        return "Cliente cadastrado: " + cliente.getNome();
    }
}
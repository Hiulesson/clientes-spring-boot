package io.hiulesson.clientes.rest;

import io.hiulesson.clientes.exception.UsuarioCadastroException;
import io.hiulesson.clientes.model.entity.Usuario;
import io.hiulesson.clientes.model.repository.UsuarioRepository;
import io.hiulesson.clientes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario) {
        try{
            service.salvar(usuario);
        }catch (UsuarioCadastroException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }


    }

}

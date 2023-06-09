package com.example.demo.controller;

import com.example.demo.medico.DadosCadastroMedico;
import com.example.demo.medico.Medico;
import com.example.demo.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar (@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));

    }
}

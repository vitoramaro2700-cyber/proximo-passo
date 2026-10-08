package com.ava.proximo_passo.controller;

import com.ava.proximo_passo.model.ProximoPassoModel;
import com.ava.proximo_passo.repository.ProximoPassoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/proximo_passo")
public class ProximoPassoController {

    @Autowired
    private ProximoPassoRepository repository;

    @GetMapping("/cadastrar")
    public String exibirFormulario(Model model) {
        model.addAttribute("proximoPasso", new ProximoPassoModel());
        return "proximo_passo_forms";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("proximoPasso") ProximoPassoModel objeto) {
        repository.save(objeto);
        return "redirect:/proximo_passo/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<ProximoPassoModel> lista = repository.findAll();
        model.addAttribute("lista", lista);
        return "proximo_passo_listar";
    }

    @GetMapping("/lista/{id}")
    public String visualizarPorId(@PathVariable Long id, Model model) {
        ProximoPassoModel item = repository.findById(id).orElse(null);
        model.addAttribute("item", item);
        return "proximo_passo_detalhes"; 
    }
}

package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.validation.BindingResult;

import java.io.IOException;
import java.util.List;


@Controller
public class CarrinhoController {

    @GetMapping(value = {"/carrinho"})
    public String carrinho(Model model) {
        model.addAttribute("title", "Carrinho");
        model.addAttribute("voucherCodigo", 3842);
        model.addAttribute("valorDesconto", 111);
        return "carrinho/index.html";
    }

    @PostMapping(value = {"/iniciar-pedido"})
    public String carrinho(String carrinho, Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("title", "Iniciar Pedido");
            return "carrinho/index";
        }

        return "carrinho/resumo-da-compra";
    }

    @PostMapping(value = {"/carrinho/adicionar-item"})
    public ResponseEntity<String> adicionarItem(String carrinhoItem, Model model, BindingResult bindingResult, HttpServletResponse response) throws IOException {
        return null;
    }

    @PostMapping(value = {"/carrinho/atualizar-item"})
    public ResponseEntity<String> atualizarItem(String id, Integer quantidade, Model model) {
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity e = new ResponseEntity<String>(headers,HttpStatus.OK);
        return e.ok("index");
    }

}
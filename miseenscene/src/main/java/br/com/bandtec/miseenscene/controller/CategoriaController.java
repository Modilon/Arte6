package br.com.bandtec.miseenscene.controller;

import br.com.bandtec.miseenscene.model.Categoria;
import br.com.bandtec.miseenscene.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getCategoria(){
        return categoriaService.listar();
    }

    @PostMapping("/add/{nome}")
    public String salvarCategoria(@PathVariable("nome") String nome){
        Categoria categoria = new Categoria(nome);
        try {
            if(categoriaService.existeByCategoria(nome)){
                return "Categoria já existe!";
            }else{
                categoriaService.salvar(categoria);
                return "Cadastrado com sucesso!";
            }
        }catch (Exception e){
            return e.toString();
        }
    }

}

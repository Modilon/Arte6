package br.com.bandtec.miseenscene.controller;

import br.com.bandtec.miseenscene.model.Habilidade;
import br.com.bandtec.miseenscene.service.HabilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidade")
public class HabilidadeController {

    @Autowired
    private HabilidadeService habilidadeService;

    @GetMapping
    public List<Habilidade> getHabilidadeService() {
        return habilidadeService.listar();
    }

    @PostMapping("/add/{habilidade}")
    public String salvarHabilidade(@PathVariable("habilidade") String nome){
        Habilidade habilidade = new Habilidade(nome);
        try {
            habilidadeService.salvar(habilidade);
            return "Habilidade cadastrada com sucesso!";
        }catch (Exception e){
            return "Falha ao salvar habilidade";
        }
    }

    @PutMapping("/editar/{idHabilidade}/{habilidade}")
    public String salvarHabilidade(@PathVariable("idHabilidade") Long id,
                                   @PathVariable("habilidade") String nome){
        Habilidade habilidade = new Habilidade(id, nome);
        try {
            habilidadeService.salvar(habilidade);
            return "Habilidade editada com sucesso!";
        }catch (Exception e){
            return "Falha ao editar habilidade";
        }
    }

    @DeleteMapping("/excluir/{idHabilidade}")
    public Boolean excluirHabilidade(@PathVariable("idHabilidade") Long idHabilidade){
        Habilidade habilidade = habilidadeService.buscarPorId(idHabilidade);
        try {
            habilidadeService.remover(habilidade);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

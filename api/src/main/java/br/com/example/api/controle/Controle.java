package br.com.example.api.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.modelo.Pessoa;
import br.com.example.api.repositorio.Repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }
    @GetMapping("api")
    public List<Pessoa> selecionar(){
        return acao.findall();
    }
   
    
    public String mensagem(){
        return "ola mundo";
    }

    @GetMapping("boasvindas")
    public String boasvindas(){
        return "seja bem vindo";
    }

    @GetMapping("boasvindas{nome}")
    public String boasvindas(@PathVariable String nome){
        return "seja bem vindo" + nome;
    }
     @PostMapping("pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p) {
        return p;
    }

   
    
    
}

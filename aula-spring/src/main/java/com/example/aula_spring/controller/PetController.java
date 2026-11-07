package com.example.aula_spring.controller;

import com.example.aula_spring.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public String saudacao(){
        return "Bem-vinda ao Pet Shop Elas Tech!";
    }

    @GetMapping("/horario")
    public String horario(){
        return "Abrimos de segunda a sábado, das 8h às 18h.";
    }

    @GetMapping("/destaque")
    public Pet pet(){
        return new Pet("Thor","Cachorro", 3);
    }

    @GetMapping("/adotar/{nome}")
    public String adotar(@PathVariable String nome){
        return "Parabéns! Você adotou " + nome + "!";

    }

    @GetMapping("/banho")
    public String banho(@RequestParam(defaultValue = "Seu pet") String pet){
        return pet + " está tomando banho!";
    }

    @GetMapping("/novo/{nome}")
    public Pet novoPet(@PathVariable String nome){
        return new Pet(nome, "Gato", 1);
    }
    @GetMapping("/idade-humana")
    public String idade(@RequestParam int anos){
        return anos + " anos de pet equivalem a " + (anos * 7) + " anos humanos!";

    }

    @GetMapping("/consulta")
    public String consulta(@RequestParam String pet, @RequestParam String vet){
        return pet + " tem consulta com a Dra. " + vet + "!";
    }


}

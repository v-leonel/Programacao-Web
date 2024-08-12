package com.example.aula2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//  Metaprogramação != Cosmetico, interfere no código
// @Override - Cosmético (JAVA)
@RestController // cria uma controladora REST
public class FraseController {
    /*
    Controladora é responsável por um recurso, lida diretamente com Requisição e Resposta.

    Nem tudo numa controller é endpoint.

    Recurso = Objeto sistemico.

    endpoint (ROTA = js) - canal de comunicação com a web para um determinado recurso.
     */

    /*
    Essa notação possibilita que esse método se torne um endpoint do tipo GET.
     */

    @GetMapping("/frases/01") //URI //URL
    public String helloSprint(){
        return "Hello Spring";
    }

    @GetMapping("/frases/02")
    public String HelloSpring2(){
        return "Olá mundo";
    }
}

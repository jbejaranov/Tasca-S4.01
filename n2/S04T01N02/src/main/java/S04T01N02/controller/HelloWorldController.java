package S04T01N02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {

        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    String saluda2(@PathVariable(required = false) String nom) {

        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }

}
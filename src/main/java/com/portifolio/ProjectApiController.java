package com.portifolio;

import com.portifolio.model.Project;
import com.portifolio.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController é uma combinação de @Controller e @ResponseBody, indicando que os métodos retornam dados diretamente
// Tudo que esse controller fizer, ele vai retornar um JSON (ou outro formato de dados) em vez de uma página HTML
@RestController
@RequestMapping("/api") // Define a rota base para os endpoints deste controller

public class ProjectApiController {
    private final ProjectService projectService;

    public ProjectApiController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projetos")// Define o endpoint para acessar a lista de projetos
    public List<Project> getProjects() {
        return projectService.getAllProjects(); // Retorna a lista de projetos obtida do serviço
    }
}

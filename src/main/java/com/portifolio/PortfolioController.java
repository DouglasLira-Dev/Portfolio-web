package com.portifolio;

import com.portifolio.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PortfolioController {

    private final ProjectService projectService;

    //spring injeta o Service automaticamente - isso se chama Injeção de Dependência
    public PortfolioController(ProjectService projectService) {
        this.projectService = projectService;
    }
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "index";
    }
}
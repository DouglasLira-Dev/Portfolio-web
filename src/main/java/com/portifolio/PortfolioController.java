package com.portifolio;

import com.portifolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        // Criar uma lista de projetos para exibir na página
        List<Project> projects = List.of(
            new Project(
                "CRUD de Usuários com SQLite",
                "Sistema completo de gerenciamento de usuários com operações CRUD usando java puro e SQLite como banco de dados local.",
                "https://github.com/DouglasLira-Dev/java-sqlite-crud-usuarios",
                "🗄️",
                new String[]{"java", "SQLite", "JDBC"}
            ),
            new Project(
                "Comparador de Planilhas",
                "Ferramenta Java para comparar dados de planilhas, identificando diferenças e inconsistências automaticamente.",
                "https://github.com/DouglasLira-Dev/comparador-planilha-estagio",
                "📊",
                new String[]{"java", "Apache POI"}
            ),
            new Project(
                "Controle Financeiro",
                "Sistema de Controle financeiro pessoal com cadastro de receitas e despesas, categorização e visualização de saldo.",
                "https://github.com/DouglasLira-Dev/controle-financeiro",
                "💰",
                new String[]{"Java", "OOP", "Collections"}
             )
        );

        model.addAttribute("projects", projects);
        return "index";
    }
}
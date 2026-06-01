package com.portifolio.service;

import com.portifolio.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    
    public List<Project> getAllProjects() {
        // Lógica para obter a lista de projetos (pode ser de um banco de dados, por exemplo)
        return List.of(
            new Project(
                "CRUD de Usuários com SQLite",
                "Sistema completo de gerenciamento de usuários com operações CRUD usando java puro e SQLite como banco de dados local.",
                "https://github.com/DouglasLira-Dev/java-sqlite-crud-usuarios",
                "🗄️",
                new String[] {"java", "SQLite", "JDBC"}
            ),
            new Project(
                "Comparador de Planilhas",
                "Ferramenta Java para comparar dados de planilhas, identificando diferenças e inconsistências automaticamente.",
                "https://github.com/DouglasLira-Dev/comparador-planilhas-estagio",
                "📊",
                new String[] {"Java", "Apache POI"}
            ),
            new Project(
                "Controle Financeiro",
                "Sistema de controle financeiro pessoal com cadastro de receitas e despesas, categorização e visualização de saldo.",
                "https://github.com/DouglasLira-Dev/controle-financeiro",
                "💰",
                new String[] {"Java", "OPP", "Collections"}
            )
        );
    }
}

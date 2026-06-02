# 🌐 Portfólio Web — Douglas Lira

> Portfólio pessoal fullstack desenvolvido com Java e Spring Boot, apresentando projetos, habilidades e formas de contato.

[![Deploy](https://img.shields.io/badge/Deploy-Live-6ee7b7?style=for-the-badge&logo=render&logoColor=black)](https://portfolio-douglas-r7u0.onrender.com)
[![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)

---

## 📋 Sobre o Projeto

Este portfólio é uma aplicação web fullstack que serve como apresentação profissional. O back-end em **Spring Boot** gerencia os dados dos projetos e os expõe tanto via **Thymeleaf** (renderização server-side) quanto via **API REST** (JSON).

### ✨ Funcionalidades

- 🎨 Interface moderna com design escuro e animações CSS
- 📦 Projetos renderizados dinamicamente pelo back-end Java
- 🔌 API REST `/api/projetos` retornando dados em JSON
- 📱 Layout responsivo para mobile e desktop
- 🚀 Deploy automatizado via Docker no Render.com

---

## 🛠️ Tecnologias Utilizadas

| Camada | Tecnologia |
|--------|-----------|
| Back-end | Java 17, Spring Boot 3.x |
| Template Engine | Thymeleaf |
| Front-end | HTML5, CSS3, JavaScript |
| Build | Maven |
| Container | Docker |
| Deploy | Render.com |

---

## 🏗️ Arquitetura do Projeto

```
src/
└── main/
    ├── java/com/portifolio/
    │   ├── PortfolioApplication.java      # Ponto de entrada Spring Boot
    │   ├── PortfolioController.java       # Controller MVC (renderiza HTML)
    │   ├── ProjectApiController.java      # Controller REST (retorna JSON)
    │   ├── model/
    │   │   └── Project.java              # Model de projeto
    │   └── service/
    │       └── ProjectService.java       # Lógica de negócio
    └── resources/
        └── templates/
            └── index.html               # Template Thymeleaf
```

---

## 🔌 API REST

### `GET /api/projetos`

Retorna a lista de projetos em formato JSON.

**Exemplo de resposta:**
```json
[
  {
    "name": "CRUD de Usuários com SQLite",
    "description": "Sistema completo de gerenciamento de usuários...",
    "githubUrl": "https://github.com/DouglasLira-Dev/java-sqlite-crud-usuarios",
    "icon": "🗄️",
    "tags": ["Java", "SQLite", "JDBC"]
  }
]
```

---

## 🚀 Como Executar Localmente

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/DouglasLira-Dev/Portfolio-web.git

# 2. Entre na pasta
cd Portfolio-web

# 3. Execute o projeto
./mvnw spring-boot:run

# 4. Acesse no navegador
http://localhost:8080
```

### Com Docker

```bash
# Build da imagem
docker build -t portfolio-douglas .

# Rodar o container
docker run -p 8080:8080 portfolio-douglas
```

---

## 📦 Build para Produção

```bash
./mvnw clean package -DskipTests
java -jar target/folio-0.0.1-SNAPSHOT.jar
```

---

## 🌍 Deploy

O projeto está hospedado no **Render.com** usando Docker.

🔗 **URL:** [https://portfolio-douglas-r7u0.onrender.com](https://portfolio-douglas-r7u0.onrender.com)

> ⚠️ O plano gratuito do Render pode ter delay de 30-60s no primeiro acesso após inatividade.

---

## 📝 Commits

Este projeto segue o padrão **Conventional Commits**:

- `feat:` nova funcionalidade
- `fix:` correção de bug
- `refactor:` melhoria de código
- `chore:` configuração e build
- `docs:` documentação

---

## 👨‍💻 Autor

**Douglas Lira**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/dev-douglas-lira/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=flat&logo=github&logoColor=white)](https://github.com/DouglasLira-Dev)
[![Portfolio](https://img.shields.io/badge/Portfólio-6ee7b7?style=flat&logo=vercel&logoColor=black)](https://portfolio-douglas-r7u0.onrender.com)
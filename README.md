🛒 DSCommerce API

API REST de e-commerce desenvolvida com Java + Spring Boot, seguindo boas práticas de arquitetura, segurança e testes automatizados.

🌐 Acesso à Aplicação

🔗 Produção:

https://seu-projeto.up.railway.app

Substitua pela URL real do seu deploy

📌 Sobre o Projeto

O DSCommerce é uma API backend que simula um sistema completo de e-commerce, incluindo:

Gestão de usuários e permissões
Catálogo de produtos e categorias
Processamento de pedidos
Sistema de pagamentos
Autenticação com JWT
🚀 Tecnologias
Java 17+
Spring Boot
Spring Data JPA / Hibernate
PostgreSQL (produção)
H2 (testes)
Spring Security + OAuth2 + JWT
Maven
Docker / Docker Compose
🧱 Arquitetura

Arquitetura em camadas:

Controller → Service → Repository → Database

Princípios aplicados:

Injeção de Dependência (DI)
Inversão de Controle (IoC)
Uso de DTOs
Tratamento de exceções
📂 Modelo de Domínio

Principais entidades:

User / Role
Product / Category
Order / OrderItem
Payment

Relacionamentos:

Um-para-muitos
Muitos-para-muitos
Um-para-um
🔗 API REST
📦 Produtos
Método	Endpoint
GET	/products
GET	/products/{id}
POST	/products
PUT	/products/{id}
DELETE	/products/{id}
📄 Paginação
GET /products?page=0&size=10
🔐 Segurança
Autenticação com JWT
OAuth2
Senhas criptografadas com BCrypt
Controle de acesso por roles
Login
POST /oauth/token

Uso do token:

Authorization: Bearer {token}
🧪 Testes Automatizados

O projeto possui cobertura de testes para garantir qualidade e confiabilidade.

✅ Tipos de Testes
Testes unitários
Camada Service
Uso de Mockito
Testes de integração
Controllers com MockMvc
Validação de endpoints REST
🛠️ Tecnologias de Teste
JUnit 5
Mockito
Spring Boot Test
MockMvc
JaCoCo
🔬 Exemplo com MockMvc
@Test
public void findAllProductsShouldReturnPage() throws Exception {
    mockMvc.perform(get("/products")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.content").exists());
}
📊 Cobertura de Código (JaCoCo)

Gerar relatório:

mvn clean test

Abrir:

target/site/jacoco/index.html
🎯 Objetivo
Alta cobertura na camada Service
Controllers testados com MockMvc
Regressão segura para deploy contínuo
⚙️ Perfis do Projeto
Perfil	Ambiente
test	H2
dev	PostgreSQL local
prod	Produção
🐳 Docker

Subir ambiente local:

docker-compose up -d
☁️ Deploy
Plataforma: Railway / Heroku
Banco: PostgreSQL
CI/CD: Deploy automatizado
🧠 Conceitos Aplicados
API REST
ORM com JPA/Hibernate
DTO
JWT Authentication
Arquitetura em camadas
Testes automatizados
Boas práticas de backend
📌 Status

🟢 Online em produção
🧪 Testes automatizados implementados
📊 Cobertura de código com JaCoCo

## 🚀 CONFIGURAÇÃO DO PROJETO SPRING BOOT COM INTELLIJ IDEA 

#### 🛠️ Passo 1: Instalar o IntelliJ IDEA  
Certifique-se de ter o IntelliJ IDEA instalado em sua máquina. O IntelliJ possui duas versões:  
- **Community (Gratuita):** Com funcionalidades básicas suficientes para muitos projetos.  
- **Ultimate (Paga):** Inclui recursos avançados, especialmente úteis para projetos empresariais.  

💡 **Dica para Estudantes:**  
Se você estiver cursando faculdade, pode solicitar gratuitamente uma licença educacional para a versão Ultimate por meio do [JetBrains Student Program](https://www.jetbrains.com/community/education/#students). Com essa licença, você terá acesso a todas as ferramentas da JetBrains sem custo enquanto for estudante. Basta criar uma conta com o e-mail institucional ou enviar um comprovante de matrícula.  

---

#### 🧑‍💻 Passo 2: Configurar o Projeto no Spring Initializr  
1. Acesse o [Spring Initializr](https://start.spring.io/).  
2. Configure as seguintes opções:  
   - **Project:** Maven  
   - **Language:** Java  
   - **Spring Boot Version:** Mantenha a versão padrão (geralmente a mais recente).  

3. No campo **Project Metadata**, personalize conforme necessário:  
   - **Group:** (ex: com.seuprojeto)  
   - **Artifact:** (ex: meu-aplicativo)  
   - **Name:** (ex: MeuAplicativo)  
   - **Description:** Uma breve descrição do projeto  
   - **Package Name:** Deixe no padrão com base no Group e Artifact escolhidos  

4. **Packaging:** Selecione **JAR**  
5. **Java Version:** Deixe configurada com a versão mais recente compatível com seu ambiente.  

---

#### 📦 Passo 3: Adicionar Dependências  
Inclua as seguintes dependências no projeto:  
- **Spring Web:** Para criação de APIs RESTful  
- **Spring Data JPA:** Para persistência de dados  
- **PostgreSQL Driver:** Para conexão com banco de dados PostgreSQL  
- **Flyway Migration:** Para controle de versionamento do banco de dados  

---

#### 📂 Passo 4: Baixar o Projeto  
1. Clique em **Generate** para baixar o projeto.  
2. Extraia o arquivo baixado e abra a pasta resultante no IntelliJ IDEA.  


## 📚 _References_

> Fontes recomendadas para ampliar seu conhecimento..

1. [Vídeo Tutorial: CRIANDO UM CRUD COM SPRING BOOT | API REST com PostgreSQL e Flyway](https://www.youtube.com/watch?v=ePGAm7mMFFg)

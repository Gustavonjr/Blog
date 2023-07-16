# README - Projeto Blog

Este é o README detalhado para o projeto Blog. O projeto consiste em um aplicativo de blog desenvolvido com o framework Spring Boot. O aplicativo permite que os usuários visualizem e criem posts, com informações como título, autor, data e texto. Além disso, o projeto utiliza o banco de dados MySQL para persistência dos dados e possui recursos de segurança para autenticação.

## Requisitos

- JDK 1.8 ou superior
- Maven 3.x
- MySQL 8.x

## Configuração do Banco de Dados

Antes de executar o projeto, é necessário configurar o banco de dados MySQL. Siga as instruções abaixo:

1. Crie um banco de dados no MySQL para ser usado pelo projeto.

2. Abra o arquivo `src/main/resources/application.properties` e atualize as propriedades relacionadas ao banco de dados com as informações do seu ambiente:

spring.datasource.url=jdbc:mysql://localhost:3306/{nome_do_banco_de_dados}
spring.datasource.username={usuario}
spring.datasource.password={senha}


Certifique-se de substituir `{nome_do_banco_de_dados}`, `{usuario}` e `{senha}` pelas configurações corretas do seu ambiente.

## Compilando e Executando o Projeto

Para compilar e executar o projeto, siga as etapas abaixo:

1. Abra o terminal ou prompt de comando e navegue até o diretório raiz do projeto.

2. Execute o comando `mvn spring-boot:run` para compilar e executar o aplicativo.

3. O aplicativo será executado e estará disponível em `http://localhost:8080`.

## Uso do Aplicativo

### Página Inicial

A página inicial do aplicativo exibe uma lista de todos os posts existentes. Os posts são ordenados por data, do mais recente para o mais antigo. Cada post exibe o título, o autor e a data de criação.

### Visualizar Detalhes do Post

Ao clicar em um post na página inicial, você será redirecionado para a página de detalhes do post. Nessa página, são exibidas todas as informações do post, incluindo o texto completo.

### Criar um Novo Post

Para criar um novo post, clique em "Novo Post" no menu de navegação. Você será redirecionado para o formulário de criação de post. Preencha todos os campos obrigatórios (título, autor e texto) e clique em "Salvar" para criar o post. O post será salvo no banco de dados e você será redirecionado de volta para a página inicial.

## Segurança

O aplicativo utiliza recursos de segurança para autenticação. Por padrão, existe um usuário administrador pré-configurado com as seguintes credenciais:

- Usuário: admin
- Senha: admin

Ao acessar as páginas que requerem autenticação, você será redirecionado para a página de login. Use as credenciais acima para fazer login como administrador.

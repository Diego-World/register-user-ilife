# **Serviço de Usuário/Registro**

Esse serviço nasceu a principio como um serviço de registro somente, mas após o uso da massa cinzenta tomei a decisão de que ele vai se tornar o serviço de usuário, até porque acredito que o fluxo de usuário não será massivo, dessa forma, não se faz necessário tanta distribuição entre os sistemas!

# Responsabilidades:

## 1º Registrar um usuário

### Através do formulário de login o serviço recebe nome, email, data de nascimento e senha. No próprio front-end é válidado se o usuário tem pelo menos 16 anos, se a senha segue os requisitos que eu defini e
se o email é válido. No Back-end eu válido se a senha e sua confirmação conferem (Esqueci de fazer no front) e se o usuário já existe no banco pelo email. Caso tudo esteja de acordo o usuário é salvo.

![asdas](https://github.com/user-attachments/assets/7ca8fc58-eb58-4d65-b539-765945aa1933)



 Melhoria a ser feita: Encriptar a senha, verificar se os dados são nulos, validar a correspondecia de senhas no front-end.



 ## STACK:

>Java 17, Spring 3.2.3, Maven 4.0.0, jUnit 5.9.1, jUnit Engine 5.9.3, Postgres 42.6.0.

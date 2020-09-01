# DEV-REST
Centralização da lógica de negócio e disponibilização de serviços REST para manipulação de dados.

### Dependências
1. [Java 14][1]: Instruções para instalação [aqui][3]
2. [Maven][2]: Este é um gerenciador de dependências que automatiza o processo de importação de dependências dentro do projeto (_Praticamente toda linguagem de programação possui um gerenciador de dependências_). Todas as dependências estão descritas no aquivo **pom.xml** na raiz do DEV-REST. Caso não queira intalar o Maven podem ser utilizados os aquivos **./mvnw** para Linux ou **.\mvnw.cmd** para Windows, que está na raiz do DEV-REST. Instruções para instalação [aqui][4].
3. IDE de sua preferência

### Como executar
Depois de instalar as dependências o projeto pode ser executado em sua IDE de preferencia (utilizo o IntelliJ) e cada IDE possui seu modo de importar um projeto, dê um google.<br/>
Caso for executar o projeto via terminal: Certifique-se de estar na pasta raiz do dev-rest: **_./mvnw spring-boot:run_**, se tiver o maven intalado e configurado: **_.\mvn spring-boot:run_**


[1]: https://jdk.java.net/archive/
[2]: https://maven.apache.org/
[3]: https://medium.com/@mauriciogeneroso/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f#:~:text=Ao%20preparar%20o%20ambiente%20de,fazer%20essa%20configura%C3%A7%C3%A3o%20no%20windows.
[4]: http://charlesmms.azurewebsites.net/2017/09/04/instalando-maven-no-windows-10/

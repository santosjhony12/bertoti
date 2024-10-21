# Jhony Santos de Souza

## Introdução

Me chamo Jhony. Tenho 19 anos. Sou um desenvolvedor de software com uma paixão por criar soluções inovadoras e eficientes de software. Estou cursando tecnólogo em Banco de Dados na Fatec São José dos Campos, com formação técnica em Desenvolvimento de Sistemas pela Etec. Atualmente, sou estagiário de Gestão de Dados em uma multinacional líder na indústria do vidro, onde também atuei como aprendiz e estagiário na área de TI. Tenho familiaridade com metodologias ágeis como Scrum, que aplico em projetos para trabalhar em equipe e alcançar bons resultados.

## Contatos
* [GIT](https://www.github.com/santosjhony12)
* [LinkedIn](www.linkedin.com/in/jhonysouzadev)

## Meus Principais Conhecimentos
Tenho conhecimento sólido em desenvolvimento web, utilizando frameworks como Django e Spring Boot para criação de aplicações robustas. No front-end, uso Vue.js com TypeScript, priorizando uma abordagem eficiente e reativa. Minha experiência com bancos de dados inclui MySQL para dados relacionais e MongoDB para dados NoSQL, aplicados de forma integrada em projetos como no uso do Oracle Cloud.

No ambiente de desenvolvimento, utilizo Docker e WSL para garantir uma infraestrutura ágil e flexível. Também sou proficiente em automação e manipulação de dados com Power Query, Excel e VBA, onde integro fontes de dados de sistemas como SAP para gerar relatórios e KPIs para controle de produção.

Adoto metodologias ágeis, especialmente Scrum, para gerenciamento de projetos, e já desenvolvi soluções de visualização de dados usando Power BI. Tenho experiência na visualização de mapas utilizando MapTiler, aplicados em projetos Vue.js, o que me permite lidar com projetos que envolvem tanto o back-end quanto o front-end de forma eficaz.

## Meus Projetos

### Em 2024-1

#### Empresa Parceira 🫱🏻‍🫲🏻
O projeto foi realizado em parceria com a Dom Rock, uma empresa que possui uma arquitetura de processamento de dados em pipeline, utilizada para orquestrar dados e algoritmos de inteligência artificial, ou modelos matemáticos, de acordo com as necessidades de negócio de seus clientes. Essa plataforma é amplamente aplicada em diferentes indústrias para tratar grandes volumes de dados, gerando insights automatizados e facilitando a tomada de decisão.

#### Problema ‼️
O principal desafio enfrentado era o processo manual de configuração das fontes de dados. Esse processo, fundamental para a operação da plataforma, exigia muito tempo e envolvimento de técnicos especializados. A configuração manual não apenas limitava a agilidade na implantação da solução para os clientes, como também tornava a operação dependente de profissionais altamente qualificados para garantir que os dados estivessem corretamente preparados para os estágios subsequentes do pipeline.

#### Solução Entregue ✅
Para resolver esse problema, a equipe desenvolveu uma interface amigável e intuitiva que permitia a configuração das fontes de dados de forma automatizada. A solução envolveu o desenvolvimento de várias interfaces, incluindo uma para o cadastro de clientes, soluções e usuários, e outra para upload de arquivos CSV ou Excel com a visualização da estrutura de dados. Também foi criado um dashboard para administradores com visões quantitativas sobre os dados configurados. Além disso, a solução incluiu funcionalidades de mapeamento de campos-chave e aplicação de regras de negócios, além de um sistema de autenticação e auditoria para rastreabilidade. Isso trouxe benefícios como maior agilidade nas implantações e redução da dependência de técnicos especialistas

Repositório: <a href="https://github.com/TechHorizonBR/API_3SEM.git">Clique aqui</a>

#### Tecnologias Utilizadas
Nesse projeto, utilizei as ferramentas: Spring Boot para desenvolver o Back-end Web Server, MySQL para banco de dados relacional, BR-Modelos para modelagem de dados, Figma para prototipação de Wareframes, HTML, CSS e JS para Front-end, Jira e Excel para gerenciamento de projetos, Git para versionamento de projetos e Github para armazenamento e publicação de arquivos.

#### Contribuições Pessoais
- Durante o projeto desenvolvi como back-end, front-end  e Scrum master. Fui responsável por criação de endpoints de rastreabilidade de usuário dentro do sistema, processamento e leitura de arquivos CSV, padronização de estilos no front-end, estruturação dos modelos conceituais e lógicos de banco de dados e acompanhamento de desenvolvimento da equipe de programação. 

    - Rastreabilidade de usuário
          <details>
              Identificar o usuário logado no sistema e registrar todas as ações executadas. A principio, enfrentei dificuldades para capturar o usuário através do Spring Security, o que exigiu esforços para o desenvolvimento do histórico. Depois de testes e refatorações, cheguei a uma solução vigente de registrar a ação toda vez que fosse chamado um endpoint, exigindo obrigatoriamente que o usuário esteja logado para realizar qualquer tipo de requisição HTTP (exceto requisições de login).
          ![image](https://github.com/user-attachments/assets/487c705d-a150-4a03-a39f-003f74672166)
          </details>
    - Processamento e leitura de arquivos CSV
          <details>
              Desenvolvi um algoritmo capaz de capturar um arquivo CSV através de uma requisição HTTP(POST) convertido em código binário, logo transformar novamente em arquivo e ler através de um Buffered, em seguida, fiz o processamento do CSV utilizando bibliotecas importadas do Java e realizei o input dos dados para o banco de dados relacional. Importante ressaltar, foi utilizado o método duas vezes em dentro do sistema, sendo a primeira para configuração de uma base de dados, e a segunda para upload de dados com a configuração do esquema pronto.
      ![image](https://github.com/user-attachments/assets/239ff7f4-0254-4f62-b084-a4bf35ef017a)
          </details>
    - Padronização de estilos no Front-end
          <details>
              Ao final do projeto, auxiliei os desenvolvedores fron-ends na padronização dos estilos das interfaces do sistema. Enfretei algumas dificuldades, já que não utilizamos nenhum framework de estilização, precisei replicar muito trecho de código em diversas telas, gerando um retrabalho do que já estava feito. Todavia, com refatorações e ajustes, consegui centralizar em arquivos CSS padrões para consumir em mais de uma tela, diminuindo o excesso de código duplicado no sistema.
      ![WhatsApp Image 2024-08-19 at 20 02 03](https://github.com/user-attachments/assets/2efd4a6d-8962-459b-a8f6-02c68a5731f2)
          </details>
          
    - Modelos de Banco de Dados Conceituais e Lógicos
        <details>
              Contribui para o desenvolvimento dos modelos Conceituais e Lógicos de banco de dados. No primeiro momento, tive dificuldades para o modelo inicial, já que não possuia um entendimento completo e concreto do projeto. Todavia, com o progresso das Sprints foi possível ter uma visão mais ampla da aplicação facilitando o desenvolvimento do DER e entendimento dos relacionamentos entre as entidades de banco de dados. 
      

      ![LOGICO_API_DOM_ROCK_V3_PNG](https://github.com/user-attachments/assets/5d28e1ce-ae8c-4c02-9a9c-2b96dc94c55f)
        </details>
 
        
  - Acompanhamento do desenvolvimento da equipe Scrum
          <details>
              Nesse projeto, tive a oportunidade de trabalhar com a equipe como Scrum Master, ficando com atividades de gerenciamento de tasks e da equipe Scrum. Durante o processo, observei dificuldades nos desenvolvedores em quesitos técnicos, dessa forma, obtive a estratégia de rever as tasks e redistribui-las, contudo, auxiliando e reforçando o estudo das tecnologias.
      ![image](https://github.com/user-attachments/assets/3259426c-c849-4a10-8e64-0e115e1e1ca9)
          </details>


#### Hard Skills
- Java (Spring Boot) - Desenvolvi aplicações backend, configurando endpoints e integrações de forma autônoma.
- MySQL - Utilizei para modelagem e gerenciamento de dados relacionais, com capacidade plena de criação de queries e ajustes no banco de dados.
- IntelliJ IDEA - Ferramenta utilizada no desenvolvimento do projeto, com alto nível de proficiência na customização do ambiente e uso de plugins.
- Git/GitHub - Versionamento de código e trabalho em equipe, com eficiência no uso de branches, pull requests e resolução de conflitos.
- Postman - Testei e validei APIs durante o desenvolvimento, com conhecimento para criação de coleções de testes.
- Figma - Para prototipagem de interfaces e colaboração no design da solução, utilizando a ferramenta com eficiência.
- BR Modelo - Utilizado para modelagem de dados, com proficiência no uso de diagramas ER.
- Jira - Organizei tarefas e acompanhei o desenvolvimento do projeto de acordo com a metodologia Scrum.
- HTML5, CSS3, JavaScript - Usei no desenvolvimento frontend, criando interfaces responsivas e dinâmicas, com autonomia.

#### Soft Skills
- Comunicação - Foi essencial para alinhar as expectativas da equipe durante as reuniões de planejamento e revisões de sprint. A troca clara de informações agilizou a tomada de decisões.
- Trabalho em equipe - A colaboração com designers e desenvolvedores frontend e backend foi fundamental para entregar uma solução integrada e funcional.
- Organização - Utilizei ferramentas como Jira para gerenciar tarefas e prazos, mantendo a entrega do projeto dentro dos cronogramas estabelecidos.
- Adaptabilidade - Houve a necessidade de ajustar a implementação das funcionalidades conforme feedbacks dos clientes e mudanças nos requisitos durante o processo de desenvolvimento.
- Resolução de problemas - Enfrentei desafios técnicos na integração de dados e precisei aplicar soluções criativas e eficientes para garantir a continuidade do projeto sem impactar os prazos.





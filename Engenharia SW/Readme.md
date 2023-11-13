# SOFTWARE ENGINEERING 
Aula 01 - 11/08/2023

> We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. - <i> Book: Engenharia de Software no Google</i>

<h4>Comentários:</h4>

- A engenharia de software é responsável pelo gerenciamento de projetos e qualidade do produto, tendo responsabilidades importantes como a tomada de decisões complexas baseadas em estimatimativas incertas;
- Tempo;
- Escabilidade: Tem a ver com a escabilidade de oferta de serviço, ou seja, escalar um sistema que permite que o sistema seja acessado por milhares de pessoas ao mesmo tempo;
- Trade-offs: Um jogo de perda e ganha - ganho uma coisa e perco outra (linguagem/banco/etc) - define a engenharia de software;
- Requisitos funcionais: Ações do sistemas - Verbo;
- Requisitos não funcionais: Qualidade do sistema - Adjetivo;

> Pq a amazon vende em um minuto o que a americanas vende em um ano?

<h4>Aula 14/08/2023</h4>

<h2>Text 2</h2>
<p>
"Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming." - <i>Software Enginnering at Google</i>
</p>

<h3>Comentários: </h3>

> A engenharia de software não é programação, ou melhor dizendo, não é somente programação. Quando conseguimos distinguir isso, entendemos as diferentes tarefas das duas áreas. Enquanto programação foca apenas no desenvolvimento, a SE foca em desenvolver, modificar e realizar as devidas manutenções.

<h3>Três exemplos de Trade-offs:</h3>

> Comer rápido vs comer saúdavel <br> Sistema Operacional Linux (muito bom) vs acessibilidade (difícil uso) <br> Avanço da tecnologia vs ataques cybercriminosos

<h3>Requisitos Funcionais :</h3>

> São as funcionalidades específicas e ações que um sistema, software ou produto deve executar para atender às necessidades do usuário, descrevendo o que ele deve fazer.

<h3>Requisitos não funcionais: </h3>

> São critérios que definem a qualidade, desempenho e características gerais do sistema, além das suas funcionalidades, abordando questões como velocidade, segurança, escalabilidade e usabilidade.


<h4>Aula 18/08/2023</h4>

[Texto analisado - Clique aqui](https://www.nngroup.com/articles/ten-usability-heuristics/)

<h3>Requisito não funcional tratado em aula: Usabilidade</h3>

> Experiência do usuário (UX)<br>Para obter este requisito é necessário aplicar as 10 heurísticas.

<h4>Heurística 1 - Visibility of system status</h4>

> Erro: Carregamento de página sem informar o usuário do que está acontecendo
![image](https://github.com/santosjhony12/bertoti/assets/123211025/af7e6ec7-1e2e-438b-a527-d76792772ad0)

> Acerto: Whatsapp - Mostra o status quando o usuário digita, quando visualiza a mensagem, quando está gravando um áudio
![image](https://github.com/santosjhony12/bertoti/assets/123211025/a9456879-4f86-4dce-b711-a79bdf0156d8)


<h4>Heurística 2 - Match between system and the real world</h4>

> Erro: Erro 404 - Not page found
![image](https://github.com/santosjhony12/bertoti/assets/123211025/2ffff567-96f4-4c95-a49b-3815cb761229)

> Acerto: Lojas de e-commerce - o carrinho de compras faz com que a experiência do usuário deixe ele mais próxima do mundo real.
![image](https://github.com/santosjhony12/bertoti/assets/123211025/97a4e107-e600-482a-a6cd-914c49d28bc6)


<h4>Heurística 3 - User control and freedom</h4>

> Erro: E-commerce que permitem a compra apenas com uma quantidade determinada de um produto, não podendo ser variavel(escolhida pelo usuário).<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/4de05df2-0393-4074-ace5-da1e4b5b25ca)


> Acerto: Opções de voltar e confirmação da ação.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/43e3e746-abaf-4adf-9e4d-b6d46fea6d9f)


<h4>Heurística 4 - Consistency and standards</h4> 

> Erro: Inversão de cores (vermelho/verde) <br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/b66fe73d-544b-406f-86f1-6a2ec3d42c7c)


> Acerto: uso de ícones padrões (filtro, lupa, notificação)

![image](https://github.com/santosjhony12/bertoti/assets/123211025/d4f19b1b-2df9-48f2-a05f-b96b90d28211)


<h4>Heurística 5 - Error prevention</h4>

> Erro: Sites que não possuem uma pré validade de CPF é um exemplo, fazendo com que o usuário fique confuso do que está colocando<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/eb947d35-8287-4570-abf2-6ca3603bd898)


> Acerto: Ao tentar enviar um formulário com campos obrigatórios vazios, o sistema exibe mensagens de erro claras e específicas, destacando os campos que precisam ser preenchidos para evitar erros antes de submeter os dados.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/b1be246b-53a4-46b1-baa7-cdf18ea18ebc)

<h4>Heurística 6 - Recognition rather than recall</h4>

> Erro: Um aplicativo de lista de tarefas não exibe os ícones de ação ao lado de cada tarefa na visualização da lista, exigindo que os usuários memorizem ou adivinhem quais ações estão disponíveis para cada tarefa. /  Quando você esquece a senha de algum documento/ sistema e não há como você lembrar da senha<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/c6b6ec1b-4f1b-43e1-8be3-1aab6503eb61)

> Acerto: Um aplicativo de calendário exibe ícones visíveis e intuitivos ao lado de cada evento na visualização do mês, permitindo que os usuários identifiquem rapidamente as ações disponíveis para cada evento sem a necessidade de lembrar ou adivinhar. // Google tradutor exibe todos os idiomas possiveis, não necessitando você memorizar.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/e39546a7-f47b-4330-a7e8-eed6685ee186)


<h4>Heurística 7 - Flexibility and efficiency of use</h4>

> Erro: Um software de edição de imagens não oferece atalhos de teclado para funções frequentemente usadas, forçando os usuários a navegar através de vários menus e submenus para realizar tarefas simples.<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/1bc614fa-e2cb-46cb-9ab2-3eb12006e04d)

> Acerto: Atalhos como ctrl+z

![image](https://github.com/santosjhony12/bertoti/assets/123211025/b11b139b-30c8-4348-8e53-3765e32aacf0)


<h4>Heurística 8 - Aesthetic and minimalist design</h4>

> Erro: Um site de comércio eletrônico apresenta uma página inicial desordenada, com cores vibrantes, fontes diferentes e muitos elementos em destaque, tornando difícil para os usuários focarem nos produtos e navegarem pelo site.<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/230a3f28-b759-452f-8db6-93631af69e6a)


> Acerto: Um aplicativo de leitura possui um design limpo e minimalista, com uma paleta de cores suaves, tipografia legível e uma disposição organizada que destaca o conteúdo principal, proporcionando uma experiência agradável para os usuários.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/551ad0d2-8ec0-4f47-b646-9e79cbe5730e)


<h4>Heurística 9 - Help users recognize, diagnose, and recover from errors</h4>

> Erro: Um aplicativo de processamento de texto não fornece mensagens de erro claras quando o usuário tenta salvar um documento em uma pasta sem permissão de gravação, deixando o usuário sem saber o motivo da falha.<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/74911769-1602-48b6-ad3c-3a1da3e30d5d)


> Acerto: Um aplicativo de edição de imagem exibe uma mensagem de erro descritiva quando um usuário tenta exportar um arquivo em um formato não suportado, indicando o formato correto e fornecendo instruções sobre como converter o arquivo.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/2e4f655c-e08c-497e-9c45-1ff7d70c19a8)

<h4>Heurística 10 - Help and documentation</h4>

> Erro: Um aplicativo de gerenciamento financeiro não inclui nenhuma documentação ou ajuda interna, tornando difícil para os usuários entenderem como usar recursos avançados, como reconciliação de contas.<br>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/778c2993-ae89-450b-9bfe-1d74e2959b15)


> Acerto: Um software de edição de vídeo inclui tutoriais interativos integrados que guiam os usuários por etapas complexas, como adicionar efeitos de transição, oferecendo suporte contextual e facilitando o aprendizado de novos recursos.

![image](https://github.com/santosjhony12/bertoti/assets/123211025/a1e00dea-8450-497e-9573-547334bc10ff)


# DIAGRAMAS UML - Unified Modeling Language
<h5>21/08/2023</h5>
<h3>CASO DE USO</h3>

Atividade 4
- Fazer diagrama de caso de uso com os requisitos funcionais do seu sistema
- UML Unified Modeling Language

  
> Atores (bonequinhos) - usuários do sistema <br>Os balões representam os RF e são descritos com verbos.<br>Quadrado - cenário/Sistema<br>Seta pontilhada - depêndencia (depende de outro caso de uso)

<h3>DRY- Don't repeat yourself</h3>

>  É um termo utilizado para indicar que não é interessante repetir termos na programação, pois é mais fácil esncapsular para poder reutilizar o código.

<h2>Caso de Uso - Sistema de Chamados de TI</h2>

<h3>Versão 1</h3>

![Diagrama sem nome drawio (1)](https://github.com/santosjhony12/bertoti/assets/123211025/8019e0cd-ce05-46d7-a002-175769d37743)

<h3>Versão 2</h3>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/969acd86-4b05-43b0-87a4-fc3ed9aee855)



## AULA - DIAGRAMA DE CLASSES

List = new LinkedList<>

.add() - adiciona 

for(Carro carro:carros){}

(-) private

(+) public

Nome da classe, sempre com a primeira maiuscula<br>
1º Quadrado = atributos<br>
2º Quadrado = métodos<br>

<h3>V.01</h3>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/3739dfcd-66c9-4a0f-ac27-2cad980c4e7e)


<h3>V.02</h3>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/eab30f15-1ec5-4277-8299-1d6c42aa866c)

<h3>V.03</h3>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/bc9b06fd-018e-4ccd-82da-e34259d072eb)

<h3>V.04</h3>

![image](https://github.com/santosjhony12/bertoti/assets/123211025/eee66132-1866-4799-a475-3ef95f82cbc8)

## TESTES

```
    @Test
    public void testLogarComSucesso() {
        Pessoa pessoa = new Pessoa(1, "usuario1", "usuario1@example.com", "senha123", false);
        sistemaTI.addPessoa(pessoa);

        Pessoa resultado = sistemaTI.logar(pessoa);

        assertNotNull(resultado);
    }
```

Objeto Pessoa | Esperado | Resultado (objeto) | RESULTADO FINAL
----|----|----|----
1, "usuario1", "usuario1@example.com", "senha123", false | 1, "usuario1", "usuario1@example.com", "senha123", false | 1, "usuario1", "usuario1@example.com", "senha123", false | 1, "usuario1", "usuario1@example.com", "senha123", false
1, "usuario1", "usuario1@example.com", "senha123", true | 1, "usuario1", "usuario1@example.com", "senha123", true | 1, "usuario1", "usuario1@example.com", "senha123", false | Null


```
    @Test
    public void testCriarChamadoComSucesso() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Alta", "Aberto", "Descrição", 1, 2);

        sistemaTI.criarChamado(chamado);

        List<Chamado> chamados = sistemaTI.visualizarTodosChamados();
        assertTrue(chamados.contains(chamado));
    }
```

Objeto Chamado | chamados| RESULTADO FINAL
----|----|----|
1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1 | [chamado] | true
1, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR não liga", 1, 1 | [] | false


```
    @Test
    public void testVisualizarChamadosPorStatus() {
        Chamado chamado1 = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        Chamado chamado2 = new Chamado(2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 4);
        Chamado chamado3 = new Chamado(3, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 4);

        sistemaTI.criarChamado(chamado1);
        sistemaTI.criarChamado(chamado2);
        sistemaTI.criarChamado(chamado3);

        List<Chamado> chamadosEncontrados = sistemaTI.visualizarChamadosPorStatus("In Progress", 1);

        assertEquals(2, chamadosEncontrados.size());
        assertTrue(chamadosEncontrados.contains(chamado2));
    }
```

Objeto Chamado | chamadosEncontrados | RESULTADO FINAL
----|----|----|
1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1 | 1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1 | true
2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 4 |2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 2 | false


```
    @Test
    public void testAlterarPrioridadeChamado() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        sistemaTI.criarChamado(chamado);

        sistemaTI.alterarPrioridadeChamado("Alta", 1);

        Chamado chamadoAlterado = sistemaTI.visualizarChamadoPorCodigo(1);
        assertEquals("Alta", chamadoAlterado.getPrioridade());
    }
```

Objeto Chamado | novoChamadoAlterado | RESULTADO FINAL
----|----|----|
1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1 | 1, "Título", LocalDate.now(), "Alta", "New", "Computador BR não liga", 1, 1| true
2, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1 | 1, "Título", LocalDate.now(), "Alta", "New", "Computador BR não liga", 1, 1 | false

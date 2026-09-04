# GC25Online

Repositorio de estudos e exercicios realizados nos cursos da Alura e na formacao Caldeira. O workspace reune praticas de Java, orientacao a objetos, manipulacao de datas, JavaScript, HTML/CSS e comandos do Git.

## Conteudo do repositorio

| Pasta | O que contem | O que deve ser versionado |
| --- | --- | --- |
| `DatasJava` | Exercicios com a API `java.time`: datas, horarios, fusos, vencimentos, prazos e controle de expediente. | `src/` e os fontes Java. O arquivo `.iml` e `out/` sao especificos da IDE/compilacao e nao sao necessarios. |
| `DesafioJava` | Desafios introdutorios de Java com `Scanner`, classes e metodo `main`. | `src/`. O `.iml` e `.idea/` sao configuracoes locais. |
| `POOeListas` | Aplicacao de compras com cartao, compras, listas e entrada pelo console. | `src/`. O `.iml` e `out/` nao precisam subir. |
| `ProvaJavaGC2025` | Exercicios avaliativos de Java: sobrecarga, construtores, fluxo, metodos, datas, listas, filtros, notificacoes e agendamento. | Todos os arquivos `.java`. |
| `SiteFilmes` | Primeiros exercicios Java usando o tema de filmes, leitura de dados, condicionais, loops e classes. | `src/`. O `.iml`, `.idea/` e eventuais compilados nao precisam subir. |
| `JSpratic` | Exercicios praticos de front-end: AluGames, Amigo Secreto, Carrinho de Compras, e-Ticket e Sorteador de Numeros. | `html`, `js`, `css` e imagens/SVG referenciados pelas paginas. |
| `PraticandoCDesafios` | Segunda copia da mesma colecao de desafios web para pratica. | `html`, `js`, `css` e assets referenciados. Pode ser consolidada com `JSpratic` no futuro, pois os arquivos atuais sao duplicados. |
| `Numero-da-Sorte` | Jogo do Numero Secreto, com HTML/CSS/JavaScript e leitura da resposta por voz. | `index.html`, `app.js`, `style.css` e `img/ia.png`. A copia `JS Game.html` e a pasta `JS Game_files/` sao exportacoes do navegador e estao ignoradas. |
| `RepoAula` | Laboratorio de Git e GitHub: commits, squash, rebase e arquivos usados nos exercicios de repositorio remoto. | `README.md`, `.txt` e demais arquivos de estudo. O arquivo `cls` e um registro de saida do Git, mas pode ser mantido como material didatico. |

## Como executar

### Projetos Java

Requerem JDK instalado. Cada classe com `public static void main` pode ser executada individualmente. Por exemplo:

```powershell
javac -d out ProvaJavaGC2025\CadastroSobrecarga.java
java -cp out CadastroSobrecarga
```

Nos projetos com `src`, compile a partir da pasta correspondente:

```powershell
javac -d out (Get-ChildItem -Recurse src\*.java)
```

### Projetos web

Abra o `index.html` de cada projeto no navegador. Nao ha dependencias npm: os exercicios usam HTML, CSS e JavaScript no cliente. Algumas paginas carregam fontes ou o ResponsiveVoice por CDN e precisam de internet para esses recursos externos.

## O que nao deve ser enviado

O `.gitignore` da raiz cobre configuracoes de IDE, arquivos compilados (`.class` e `out/`), pastas de dependencias, logs, caches e a copia exportada do jogo em `Numero-da-Sorte`. Os arquivos-fonte e os assets usados pelas paginas continuam versionaveis.

## Observacao sobre duplicatas

`JSpratic` e `PraticandoCDesafios` possuem a mesma estrutura e os mesmos arquivos. Eles foram mantidos para preservar a organizacao atual dos estudos; antes de publicar, vale escolher uma das duas pastas caso a intencao seja manter um repositorio mais enxuto.
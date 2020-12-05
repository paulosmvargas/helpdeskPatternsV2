# helpdeskPatternsV2
## Desenvolvimento de sistema(teórico) de atendimento a chamados de usuário, com melhorias, utilizando padrões de projetos implementados com linguagem de programação ```Java```, abordando features como controle de Licenças.

---

* Composite
- Utilizado para montar licenças simples como a licença Free e Silver, e a licença Gold, que é composta de alguns recursos a mais e todo o conteúdo das duas primeiras, de forma fácil e rápida.
---

* Observer
- Utilizado para observar e monitorar quando um usuário possui uma licença do tipo Silver ou Gold, retornando rapidamente qual está sendo utilizada no momento.
---

* Chain of Responsibility
- Utilizado no controle de buscas a atendimentos feitos a usuários Silver ou Gold, a partir da licença base que está sendo utilizada no momento (todos os usuários se beneficiam da licença Free por padrão), onde a licença Silver possui mais recursos que a Free, e a Gold por sua vez, mais recursos que a licença Silver.
---
Primeira parte do sistema desenvolvido: [HelpDesk Patterns](https://github.com/paulosmvargas/helpdeskPatterns)
---
## Este é um projeto desenvolvido com fins acadêmicos.
---
<!-- Woody Woodpecker reference ;)-->

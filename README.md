# 📱 Simulação de iPhone com Programação Orientada a Objetos

Projeto desenvolvido com o objetivo de simular funcionalidades básicas de um **iPhone**, utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco em **interfaces, abstração e implementação de classes**.

---

## 🚀 Funcionalidades

O sistema simula três principais funcionalidades de um smartphone:

* 🎵 **Reprodutor Musical**
* 📞 **Aparelho Telefônico**
* 🌐 **Navegador de Internet**

Cada funcionalidade foi implementada através de **interfaces**, garantindo flexibilidade e organização do código.

---

## 🧠 Conceitos aplicados

* Interface
* Implementação de classes
* Abstração
* Organização em pacotes
* Separação de responsabilidades

---

## 🏗️ Estrutura do Projeto

```
desafios/
│
├── Iphone.java
├── ReproduzirMusica.java
├── AparelhoTelefonico.java
├── NavegadorInternet.java
│
├── IReproduzirMusica.java
├── IAparelhoTelefonico.java
├── INavegadorInternet.java
```

---

## 🔧 Como funciona

A classe principal `Iphone` instancia as funcionalidades e executa algumas ações:

```java
ReproduzirMusica rm = new ReproduzirMusica();
AparelhoTelefonico at = new AparelhoTelefonico();
NavegadorInternet ni = new NavegadorInternet();

rm.tocar();
at.atender();
ni.adicionarNovaAba();
```

---

## 📊 Diagrama UML

Abaixo está o diagrama UML representando a estrutura do projeto:

![Diagrama UML](./iPhone%20Multimedia-2026-06-11-233413.png)

---

## 💻 Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)

---

## 📌 Objetivo

Este projeto foi desenvolvido como prática para reforçar conceitos fundamentais de POO, especialmente o uso de interfaces e a organização de código em sistemas reais.

---

## 🔗 Contato

* [LinkedIn](https://www.linkedin.com/in/mateus-sanjo/)
* [GitHub](https://github.com/araujosantos20)
* [Email](mailto:mateus.sanjo20@gmail.com?subject=Contato%20via%20Portif%C3%B3lio)

---

## 📄 Licença

Este projeto está sob a licença MIT.

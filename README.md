# Ordo Realitas: Catálogo do Outro Lado

![Versão](https://img.shields.io/badge/version-v0.2.0--beta-blue)
![Java](https://img.shields.io/badge/Java-21-orange?logo=java)
![Status](https://img.shields.io/badge/status-Backend_Concluído-success)
![Disciplina](https://img.shields.io/badge/UFAPE-POO-green)

Este é um sistema de gerenciamento de entidades paranormais (Agentes e Criaturas) desenvolvido em **Java 21**, utilizando os pilares da Programação Orientada a Objetos (POO) para a 2ª VA da disciplina do curso de Bacharelado em Ciência da Computação da **UFAPE** (Universidade Federal do Agreste de Pernambuco).

## ⚠️ Aviso Legal e Propriedade Intelectual
**Este é um projeto estritamente acadêmico, de código aberto e sem fins lucrativos.** O universo, a *lore*, os termos e os conceitos aqui referenciados são de propriedade intelectual de **Rafael Lange (Cellbit)** e da **Jambô Editora**.
Este projeto é feito de fã para fã com propósitos puramente educacionais e não possui nenhum vínculo, afiliação ou endosso oficial dos criadores originais.

## 🛠️ Arquitetura e Tecnologias
O projeto foi estruturado seguindo rigorosas práticas de Engenharia de Software corporativa:
* **Padrão em Camadas:** Divisão estrita entre `modelo` (Entidades), `dados` (Persistência), e `negocio` (Regras).
* **Padrão Facade (Fachada):** Baixo acoplamento entre a lógica de negócios e a Interface.
* **Exceções Customizadas:** Tratamento de erros de negócio através de *Checked Exceptions* para garantir a integridade do fluxo.
* **Persistência de Dados:** Uso de Serialização de Arquivos Binários (`.dat`) para gravação persistente em disco.
* **Design Patterns & Boas Práticas:** Herança, Interfaces, Polimorfismo, Encapsulamento estrito e uso de *Enhanced For*.

## 🚀 Como Executar
1. Certifique-se de ter o JDK 21+ instalado na sua máquina.
2. Clone este repositório.
3. Execute a classe `Main.java` localizada no pacote `br.edu.ufape.poo.ordemparanormal`.
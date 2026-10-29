# Painel Representante

Projeto desenvolvido no âmbito do curso de Bacharelado em Ciência da Computação (BCC) - Sistemas Distribuídos na Universidade Federal do Oeste do Pará (UFOPA).

## 📌 Sobre o Projeto

O **Painel Representante** foca na etapa inicial do atendimento comercial de uma pasta específica de representação comercial. O sistema contempla:

- **Recebimento de Solicitações:** Captura de solicitações de orçamentos e pedidos encaminhados por clientes via canais externos (WhatsApp e e-mail via Outlook/Hotmail).
- **Interpretação e Extração Inteligente:** Normalização das mensagens e extração estruturada dos dados pertinentes (códigos, descrições, quantidades, dimensões) utilizando modelo de Inteligência Artificial (retornando formato JSON).
- **Consulta Automatizada de Preços:** Consulta dos itens no sistema do representante e persistência do histórico e estado das solicitações.
- **Painel de Apoio à Decisão:** Interface web interativa para que o representante confira a mensagem original, valide a lista gerada, identifique itens duvidosos ou não encontrados e revise valores antes da finalização.

---

## 🛠️ Tecnologias Utilizadas

- **Backend:** Java, Spring Boot
- **Integração & Workflows:** [Fluxo no n8n](https://demo-system.app.n8n.cloud/workflow/4ZTDE0WOT4ge63Ps), Microsoft Graph API, WhatsApp API
- **Inteligência Artificial:** API IA (LLM para extração de entidades)
- **Banco de Dados:** PostgreSQL
- **Frontend:** React

---

## 🔗 Links Úteis

- **Workflow no n8n:** [Acessar Fluxo](https://demo-system.app.n8n.cloud/workflow/4ZTDE0WOT4ge63Ps)

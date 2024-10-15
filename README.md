<h1 align="center" style="font-weight: bold; border-bottom: 1px solid #333; padding-bottom: 16px">Finance Flow 💰</h1>
<p align="center"> 
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Badge" /> 
	<img src="https://img.shields.io/badge/Spring%20Boot-6DB33F.svg?style=for-the-badge&logo=Spring-Boot&logoColor=white" alt="Spring Boot Badge" /> 
	<img src="https://img.shields.io/badge/PostgreSQL-4169E1.svg?style=for-the-badge&logo=PostgreSQL&logoColor=white" alt="PostgreSQL Badge" /> 
	<img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" alt="Hibernate Badge" /> 
	<img src="https://img.shields.io/badge/JUnit5-25A162.svg?style=for-the-badge&logo=JUnit5&logoColor=white" alt="JUnit Badge" /> 
	<img src="https://img.shields.io/badge/GitHub%20Actions-2088FF.svg?style=for-the-badge&logo=GitHub-Actions&logoColor=white" alt="GitHub Actions Badge" /> 
	<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=for-the-badge&logo=Docker&logoColor=white" alt="Docker Badge" /> 
	<img src="https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white" alt="Git Badge" /> 
	<img src="https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Badge" /> 
	<img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA Badge" /> 
	<img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman Badge" /> 
</p>
<div align="center" style="margin: 16px 0;">
	<a href="#getting-started">Getting Started</a> • 
	<a href="#api-endpoints">API Endpoints</a> • 
	<a href="#collaborators">Collaborators</a>
</div>
<h2 id="getting-started">🚀 Getting started</h2>
Financial management system for controlling and analyzing personal expenses
<h3>💻 Technologies used</h3>
<ul>
	<li>Java</li>
	<li>Spring Boot</li>
	<li>PostgreSQL</li>
	<li>H2 Database</li>
	<li>Hibernate</li>
	<li>JUnit</li>
	<li>GitHub Actions</li>
	<li>Docker</li>
	<li>Git</li>
	<li>GitHub</li>
	<li>IntelliJ IDEA</li>
	<li>Postman</li>
</ul>
<h3>🖨️ Cloning a project</h3>
To clone the project, use the following command

```bash
git clone https://github.com/GMarques30/FinanceFlow
```

<h3> ⚙ Environment variables</h3>
Use the `application.properties.example` as reference to create your configuration file `application.properties` with your environment variables

```yaml
spring.application.name=FinanceFlow
cors.allowed.origins=
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.sql.init.mode=
```

<h3>🏁 Starting</h3>
To start the project, use the following command

```bash
cd FinanceFlow
docker-compose up --build -d
```

<h2 id="api-endpoints">📌 API Endpoints</h2>
All API `endpoints`, `requests` and `responses` are listed here

| Route                   | Description          |
| ----------------------- | -------------------- |
| `GET /bills`            | Retrieves bill info. |
| `POST /bills`           | Create a bill.       |
| `PUT /bills`            | Update a bill.       |
| `DELETE /bills/:billId` | Delete a bill.       |
<h3 id="get-auth-detail">GET /bills</h3>

**Response**

```json
{
  "billId": "71f0c188-9f71-4643-82e0-9c12823479ba",
  "amount": 100.00,
  "description": "Internet",
  "category": "INTERNET",
  "createdAt": "12-10-2024",
  "occurredAt": "10-2024"
}
```

<h3 id="post-auth-detail">POST /bills</h3>

**Request**

```json
{
  "amount": 100.00,
  "description": "Internet",
  "category": "INTERNET",
  "occurredAt": "10-2024"
}
```

<h3 id="post-auth-detail">PUT /bills</h3>

**Request**

```json
{
  "billId": "71f0c188-9f71-4643-82e0-9c12823479ba",
  "amount": 100.00,
  "description": "Internet",
  "category": "INTERNET",
  "occurredAt": "10-2024"
}
```

<h3 id="post-auth-detail">DELETE /bills/:billId</h3>

**Request**

```http
http://localhost:8080/bills/71f0c188-9f71-4643-82e0-9c12823479ba
```

<h2 id="collaborators">🤝 Collaborators</h2>
Here are all the people who contributed to the project.

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/GMarques30">
        <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/101661947?v=4" width="100px;" alt="Giovanni Marques Profile Picture"/><br>
        <sub>
          <b>Giovanni Marques</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

---
<h4 align="center">Made by Giovanni Marques 👋 <a href="https://www.linkedin.com/in/gmarques30/">See my LinkedIn</a></h4>

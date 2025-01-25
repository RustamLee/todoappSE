# To-Do List Application (Second edition)

This project is a more advanced version of the first To-Do List application, built using 
**Spring Boot** and **Thymeleaf** for rendering client-side views. Compared to the previous version, 
this application integrates a MySQL database for persistent storage, includes additional features like task completion toggling.

## Technologies

- **Java** 23
- **Spring Boot** 3.3.8
- **Spring Data JPA** for database interaction (using Hibernate as the JPA provider)
- **Thymeleaf** for HTML templating
- **Bootstrap** for frontend styling
- **MySQL** for persistent database storage (compared to the original HSQLDB)
- Lombok for reducing boilerplate code

## Features

The application provides the following functionality:

- **Add Tasks**: Users can add new tasks by entering a title and clicking "Add".
- **Delete Task**: Tasks can be deleted individually.
- **Toggle** Task Completion: Users can mark tasks as completed or pending.
- **View** All Tasks: Displays a list of all tasks with their current status.
- **Persistent Storage**: Tasks are saved in a MySQL database and persist across app restarts.

## Project Structure

1. Task (Model): The task entity containing fields for id, title, and completed.
2. TaskRepository (Repository): Interface for interacting with the MySQL database using Spring Data JPA.
3. TaskController (Controller): Handles user requests for adding, deleting, and toggling tasks.
4. TodoApplication (Main Application Class): The entry point to run the Spring Boot application

## Running the Project

### 1. Clone the Repository

```
git clone https://github.com/your-username/todoapp.git
cd todoapp
```
### 2. Build and Run the Application
This project uses Maven for dependency management. To build and run the project, execute the following command:
```
mvn spring-boot:run
The application will be available at:
http://localhost:8080
```
### 3. Database Setup
This application uses MySQL as a database to store tasks. Make sure you have MySQL installed locally and running. You can configure your database connection in the application.properties file
```
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/todoappSE
spring.datasource.username=root
spring.datasource.password=MyPassword2025
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```
! Make sure to replace MyPassword2025 with your actual MySQL root password.
### 4. Database Structure
The application uses a MySQL database to store tasks. The schema will be created automatically by Spring Data JPA using the spring.jpa.hibernate.ddl-auto=update setting.
## File Descriptions
### 1. ToDoController.java
The controller manages the following routes:

GET /: Displays the list of all tasks.
POST /: Adds a new task.
GET /{id}/delete: Deletes a task by ID.
GET /{id}/toggle: Toggles the task completion status.
### 2. Task.java
The model for a task, with the following fields:
id: A unique identifier for each task (auto-generated).
title: The title of the task.
completed: A boolean indicating whether the task is completed or not.
```
@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private boolean completed;
}
```
### 3. application.properties
Configuration file for setting application properties.
```
spring.application.name=todoappse
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/todoappSE
spring.datasource.username=root
spring.datasource.password=MyPassword2025
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```
### 4. pom.xml
Main configuration file for Maven, which includes dependencies for Spring Boot, Thymeleaf, JPA, and other required libraries.

### 5. HTML Template (Thymeleaf)
The application uses Thymeleaf to render HTML pages. The template displays a form for adding tasks, a list of tasks, and buttons for toggling completion and deleting tasks.
## Possible Improvements
User Authentication: Add user registration and login functionality.
Task Due Dates: Allow users to set due dates for tasks.
External Database Support: Use an external database like PostgreSQL for persistent storage.
API Support: Implement a REST API to allow task management via HTTP requests.

Contact
If you have any questions or suggestions, feel free to contact me:

Email: rustiksagad@gmail.com
GitHub: https://github.com/RustamLee

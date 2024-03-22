# ToDo Chart
## By: Jalen Wu

This is a todo list application that I built for the sole purpose of familiarizing myself with the Spring Boot framework to build a standalone web application.
The application starts with the Task object -- which represents a task that the user sets for themself and wants to complete in the future.
A Task has a title, description, creation date, due date, and completion status. Put simply, the application is a List of Tasks that supports
create, read, update, and delete functionality through endpoints that are created by Spring Boot.
A PostgreSQL database is connected to the project, which stores the aforementioned tasks.

The model and logic of this application was built with Java. Spring Boot was leveraged to locally host the application on a web browser, and to abstract
boilerplate with built-in annotations. PostgreSQL was used in the data layer for the app to write to, and Postman was used to test CRUD functionality on application endpoints. 

# Pictures of the Application

## Postman:
GET request of the "tasks" table:
<img width="846" alt="Screenshot 2024-03-22 at 2 36 12 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/f550af94-7c9f-4fbe-b45f-2c2f8bdb08dc">

POST request of a new Task ("Charge Headphones"):
<img width="845" alt="Screenshot 2024-03-22 at 2 39 08 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/938cf37a-456e-4a5e-b2bb-673052f5b352">

Result of above POST request:
<img width="846" alt="Screenshot 2024-03-22 at 2 40 20 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/b10b0a67-ae4b-4098-8a36-d52a24d30482">

PUT request to update an existing Task (setting Task to "completed" and changing description):
<img width="844" alt="Screenshot 2024-03-22 at 2 43 46 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/6f4b5d17-c16e-407b-ab93-ba1177c673e5">

Result of above PUT request:
<img width="846" alt="Screenshot 2024-03-22 at 2 44 13 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/397c7bf0-2f9a-4b12-80f3-76f76d032d8c">

DELETE request on Task:
<img width="845" alt="Screenshot 2024-03-22 at 2 45 03 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/f7dd90ff-86ff-4436-850c-8fa71a418cf3">

Result of above DELETE request:
<img width="849" alt="Screenshot 2024-03-22 at 2 45 29 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/2f8ed308-9153-4398-8a2c-e3ce521769bc">










## PostgreSQL bash view:
<img width="677" alt="Screenshot 2024-03-22 at 2 33 03 AM" src="https://github.com/Jalen1/todo-chart/assets/60447463/c40d942a-fd63-4bb7-a0cc-1d0dbee779c4">


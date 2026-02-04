# Student Management System (Java + JDBC + MySQL)

A console-based Student Management System developed using Java, JDBC, and MySQL.
The application performs basic CRUD (Create, Read, Update, Delete) operations on student records.

---

## Features
- Add new student
- View all students
- Update student details
- Delete student record
- Database connectivity using JDBC
- Clean package structure using DAO pattern

---

## Technologies Used
- Java
- JDBC
- MySQL

---

## Project Structure
src/
├── db/
├── dao/
├── model/
└── main/


## Sample Output


1.Add 2.View 3.Update 4.Delete 5.Exit

Add Student:
Name: Rahul
Email: rahul@gmail.com

Course: CSE

View Students:
1 | Rahul | rahul@gmail.com
 | CSE

Update Student:
ID: 1 → Course updated to AI

Delete Student:
ID: 1 → Student deleted


## Database Setup


CREATE DATABASE studentdb;
CREATE TABLE students (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100),
course VARCHAR(50)
);


## How to Run
1. Import project into IntelliJ / Eclipse
2. Add MySQL Connector/J
3. Update DB credentials
4. Run MainApp.java

## Author
Aditya Singh


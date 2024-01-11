# Hotel Management System

## Overview

The Hotel Management System is a Java-based web application designed to facilitate various hotel-related operations, including user authentication, room bookings, role management, and more. This README provides an overview of the project's structure, key components, and instructions for usage.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Security](#security)

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Hibernate
- JSON Web Token (JWT)
- MySQL

## Project Structure

The project adheres to a modular structure, with distinct packages for controllers, services, models, and more. The primary components include:

- **Controller Packages:**
  - `AuthController`: Manages user authentication and registration.
  - `BookingController`: Handles room bookings and related operations.
  - `RoleController`: Deals with role management for users.
  - `RoomController`: Manages room-related operations.
  - `UserController`: Handles user-related operations.

- **Service Packages:**
  - `AuthService`: Provides user authentication and registration services.
  - `BookingService`: Manages room bookings and cancellations.
  - `RoleService`: Handles role creation, assignment, and removal.
  - `RoomService`: Manages room-related services.
  - `UserService`: Provides user-related services.

- **Model Packages:**
  - `BookedRoom`: Represents a booked room with booking details.
  - `Role`: Represents user roles.
  - `Room`: Represents a hotel room.
  - `User`: Represents system users.

- **Security Packages:**
  - `JwtUtils`: Manages JWT generation, validation, and user extraction.
  - `AuthTokenFilter`: Implements a filter for JWT authentication.
  - `JwtAuthEntryPoint`: Customizes the entry point for unauthorized access.

## Usage

1. **Setup Database:**
   - Create a MySQL database and update the `application.properties` file with the relevant database details.

2. **Build and Run:**
   - Build the project using your preferred Java IDE or Maven.
   - Run the application.

## Endpoints

Explore key endpoints provided by the system:

- `/auth/register-user`: Register a new user.
- `/auth/login`: Authenticate a user and generate a JWT token.
- `/bookings/all-bookings`: Retrieve all bookings (requires admin role).
- `/rooms/all-rooms`: Retrieve all rooms.
- `/roles/all-roles`: Retrieve all roles (requires admin role).
- ...

## Security

The application employs Spring Security and JWT for robust authentication and authorization. Role-based access control ensures the protection of specific endpoints.

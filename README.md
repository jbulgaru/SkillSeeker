# SkillSeeker
SkillSeeker is a web application that connects homeowners and businesses with skilled construction specialists such as plumbers, electricians, carpenters, and more.

# Database Schema Overview
This project uses a relational database schema to manage various aspects of a service-based application. The schema is defined using DBML (Database Markup Language) for clear and concise representation. Below is an overview of the tables and their relationships:
Tables

users: Stores user information, including credentials and personal details.
specialists: Contains details about specialists, including their user ID, profile, qualifications, and experience.
specializations: Defines different areas of specialization available in the system.
specialist_specializations: A junction table linking specialists to their specializations.
services: Lists the services offered by specialists, along with descriptions and pricing.
bookings: Manages service bookings, linking users, specialists, and services, along with appointment details.
reviews: Stores user reviews for services, including ratings and review text.
availability: Tracks the availability of specialists for appointments.
payments: Manages payment details for bookings, including amounts and payment methods.
messages: Logs messages between users and specialists, optionally linked to bookings.
notifications: Tracks notifications sent to users and specialists, including read status.
verifications: Stores verification documents for specialists, including their verification status.
audit_logs: Records user actions for auditing purposes.

Relationships
The following diagram illustrates the tables and their relationships:
# [dbdiagram.io](https://dbdiagram.io/d/66a6c89e8b4bb5230e924c5f)
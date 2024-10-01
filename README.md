# Vulnerable Java Application

This is a simple Java application with the following vulnerabilities:

1. **SQL Injection** - User input is directly concatenated into SQL queries.
2. **Hardcoded Password** - Database password is stored in the code.
3. **Cross-Site Scripting (XSS)** - User input is reflected back into the HTML page without sanitization.

## Instructions

- Compile the Java files using `javac`.
- Run the application as a standalone program or within a servlet container for `WebApp.java`.

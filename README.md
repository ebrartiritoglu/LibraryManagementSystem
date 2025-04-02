# Library Management System

## Overview
This project is a simple **Library Management System** implemented in Java. It allows users to manage books in a library by tracking their availability and borrowing status.

## Features
- Add books to the library
- Check the availability of books
- Search for books by title
- Borrow and return books
- Display all book details

## Project Structure
```
LibraryManagementSystem/
│── src/
│   ├── models/
│   │   ├── Book.java                    # Represents a book in the system
│   ├── services/
│   │   ├── Library.java                 # Manages library operations
│   ├── app/
│   │   ├── LibraryManagementSystem.java # Main application logic
│   ├── Main.java                        # Entry point of the application
```

## Installation & Setup
### Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher recommended)
- An IDE such as IntelliJ IDEA or Eclipse (optional but recommended)

### Steps to Run
1. Clone this repository or download the project files.
2. Open the project in your preferred IDE.
3. Compile the Java files:
   ```sh
   javac models/Book.java services/Library.java app/LibraryManagementSystem.java Main.java
   ```
4. Run the main class:
   ```sh
   java Main
   ```

## Example Usage
Below is an example of how to use the `LibraryManagementSystem`:
```sh
--- Library Management System ---
1. Add Book
2. Display All Books
3. Search Book by Title
4. Borrow Book
5. Return Book
6. Exit
Choose an option: 1
Enter book title: The Great Gatsby
Enter author name: F. Scott Fitzgerald
Book added successfully!
```

## Contributing
If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.



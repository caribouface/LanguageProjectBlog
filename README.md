# Language Project Blog

This is a full-stack web application for a blog focused on language learning and cultural exploration. It is built using Spring Boot, Thymeleaf, and MySQL.

## Features

* **Blog Posts:**
    * Create, read, update, and delete blog posts.
    * View all posts or individual posts.
    * Simple formatting options for posts (bold, italics, etc.).
* **User Authentication:**
    * User registration and login with hashed passwords using bcrypt for security.
    * (Future implementation) User profiles and personalized content.
* **Interactive Elements:**
    * Contact form with email validation.
    * (Future implementation) Forum for discussions and community interaction.
* **Responsive Design:**
    * Basic responsive layout that adapts to different screen sizes.

## Technologies Used

* **Backend:**
    * Java 17
    * Spring Boot 3.4.0
    * Spring Data JPA
    * Hibernate
    * MySQL
    * Lombok
* **Frontend:**
    * HTML
    * CSS
    * Thymeleaf
    * JavaScript

## Project Structure

The project follows a standard Maven structure:

* **src/main/java/org/jonathonstephens/languageprojectblog:** Contains the Java source code.
    * **controller:** Controllers for handling web requests.
    * **model:** Entity classes representing data models.
    * **repository:** JPA repositories for data access.
    * **service:** Service classes for business logic.
* **src/main/resources:** Contains configuration files and templates.
    * **templates:** Thymeleaf HTML templates.
    * **static:** Static resources (CSS, JavaScript).
    * **application.properties:** Spring Boot configuration.
* **src/test/java/org/jonathonstephens/languageprojectblog:** Contains unit tests.

## Getting Started

1. **Clone the repository:** `git clone https://github.com/caribouface/LanguageProjectBlog.git`
2. **Set up the database:**
    * Create a MySQL database named `language_project_blog`.
    * Update the `spring.datasource.username` and `spring.datasource.password` properties in `application.properties` with your MySQL credentials.
3. **Build and run the application:** `mvn spring-boot:run`
4. **Access the application:** Open your web browser and go to `http://localhost:8080`

## Future Enhancements

* **User Profiles:** Implement user profile management with personalized content and settings.
* **Forum:** Create a forum section for discussions and community interaction.
* **Advanced Formatting:** Integrate a rich text editor for more advanced formatting options in blog posts.
* **Search Functionality:** Add search functionality to filter blog posts by title, content, or category.
* **Commenting System:** Allow users to comment on blog posts.
* **Social Media Integration:** Integrate social media sharing buttons for blog posts.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

**Find the project on GitHub: [https://github.com/caribouface/LanguageProjectBlog](https://github.com/caribouface/LanguageProjectBlog)**
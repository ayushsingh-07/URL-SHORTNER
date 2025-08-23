# URL Shortener

A modern, full-stack URL Shortener application built with Spring Boot, JPA, Thymeleaf, and PostgreSQL.

## Features

- **Shorten URLs:** Generate short links for long URLs.
- **User Management:** Support for users and roles.
- **Database Migration:** Managed with Flyway.
- **Responsive UI:** Styled with Bootstrap.
- **Docker Compose Support:** For easy local development.

## Project Structure

```
src/
  main/
    java/
      com.ayush.URL_SHORTNER/
        UrlShortnerApplication.java
        domain/
          entities/
            ShortUrl.java
            User.java
          models/
            Role.java
          repositories/
            ShortUrlRepository.java
          services/
            ShortUrlService.java
        web/
          controllers/
            HomeController.java
    resources/
      application.properties
      db/
        migration/
          V1__create_tables.sql
          V2__insert_sample_data.sql
      static/
        css/
          style.css
      templates/
        index.html
        layout.html
  test/
    java/
      com.ayush.URL_SHORTNER/
        UrlShortnerApplicationTests.java
```

## Getting Started

### Prerequisites

- Java 17+
- Maven
- PostgreSQL (or use Docker Compose)

### Setup

1. **Clone the repository**
   ```sh
   git clone https://github.com/yourusername/url-shortener.git
   cd url-shortener
   ```

2. **Configure the database**

   Edit `src/main/resources/application.properties` with your PostgreSQL credentials.

3. **Run database migrations**
   Flyway will automatically run migrations on startup.

4. **Build and run the application**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

5. **Access the app**
   - Open [http://localhost:8080](http://localhost:8080) in your browser.

### Using Docker Compose

If you want to run everything with Docker Compose:

```sh
docker compose up
```

## Technologies Used

- **Spring Boot** (Web, Data JPA, Thymeleaf)
- **PostgreSQL**
- **Flyway** (Database migrations)
- **Bootstrap** (UI)
- **Docker Compose**

## Folder Highlights

- `domain/entities`: JPA entities for URLs and Users.
- `domain/repositories`: Spring Data repositories.
- `domain/services`: Business logic for URL shortening.
- `web/controllers`: MVC controllers.
- `templates`: Thymeleaf HTML templates.
- `db/migration`: Flyway migration scripts.

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE)

---

**Made with ❤️ by Ayush
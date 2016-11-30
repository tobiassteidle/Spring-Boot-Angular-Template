# Spring-Boot-Angular-Template
Gradle Multi-Project Template for Spring Boot Applications (AngularJS Frontend)

## Instructions
#### Requirements
Please install "npm" Package Manager first (https://www.npmjs.com/)

#### Inital Gradle Task
To prepare the Project execute ```./gradlew installGulp``` in the root directory.

###### Now the Project is ready to launch.

To launch the application by command line execute ```./gradlew bootRun```
or an IDE of your as Spring-Boot Application or Java Application.

Sample Page is available by default on: http://localhost:8080

### Gradle Tasks
Run ```./gradlew build``` to build the Project and execute all Tests (incl. Javascript tests)

Run ```./gradlew gulp_jasmine``` for javascript test execution (incl. jasmine-livereload-task).
See: https://www.npmjs.com/package/gulp-jasmine-livereload-task for further details.


## Subprojects

### webApp
Frontend Project including "Application" Class for Spring-Boot startup.
See: "src/main/resources/static" for html/js code.

### service
Backend Project including a sample Service. Short Example for unit testing with JUnit and Spock implemented.

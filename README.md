# sturdy-fiesta
Application development

## Building backend
- Building and packaging backend is intentionally not automated now
- After any backend changes, Please build/package the backend manually before trying to start the app using maven or from IDE so that jar file gets created
- Note that if manual packaging is not done and jar file is not available, docker-compose build will throw an error
- Make a note to enable "Delegate IDE build/run actions to Maven" so that jar gets created everytime

## How to Run the application?
- Use the command ``` docker-compose up -d ``` inside project folder to start the application
- Use the command ``` docker-compose up -d --build ``` to build and start the app
- Login to http://localhost:8080/ from browser to launch UI
- Backend calls are made by using /api/ like http://localhost:8080/api/test
- Use the command ``` docker-compose down ``` inside project folder to stop the application and remove all the containers
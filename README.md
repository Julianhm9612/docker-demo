# docker-demo 🐳

You can create or run each application individually, you just need to enter each application and follow the readme file. Or
execute the following steps to build the images and run them with docker compose.

## Steps:

1. Install [Docker Desktop](https://docs.docker.com/get-docker/)

2. Run the Docker build commands like below:

```console
> docker build -t app-1:1.0.0 ./app-1
```

```console
> docker build -t app-2:1.0.0 ./app-2
```

3. Execute the Docker compose up command to start the entire application:

```console
> docker-compose up
```

4. Execute the Docker compose stop command to stop the entire application:

```console
> docker-compose down
```


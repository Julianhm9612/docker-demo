# Building a Node.js API with Express.js in a Docker Container 🐳

## Steps:

1. Install [Docker Desktop](https://docs.docker.com/get-docker/)
2. Create a folder for your app and initialize your node.js app by running this command:

```console
> npm init
```

3. Install express.js and build your api using a public port like 8080 e.g. like the index.js file in the src folder in this repo.
4. Test your api by running the **node** command making sure you get the desired response:

```console
> node ./src/index.js
```

5. Create your docker file with the following set of instructions. Instructions are like steps/layers which make it possible for Docker to cache some of the steps if nothing has changed. Thats why the step to install the node_modules comes early on so that Docker doesn't have to reinstall them everytime something changes in your app's source code ⏱️

```docker
FROM node:22-alpine

WORKDIR /usr/src/app

COPY package.json ./

RUN npm install

COPY . .

ENV PORT=3002

EXPOSE 3002

CMD ["npm", "start"]
```

6. Make sure you have a script in your package.json that handles the last step **npm start**. See the package.json file "scripts" section in the repo.
7. Run the Docker build command like below:

```console
> docker build -t app-2:1.0.0 .
```

8. If successful you should see a line that looks like this with the id you need for the last step

```console
Successfully built 9d1h36e6a333
```

9. Execute the Docker run command using the app-2:1.0.0 and making sure you map your enviroment port from your express.js api (e.g. 3002) to another port like 4002.

```console
docker run -p 4002:3002 app-2:1.0.0
```

10. If all goes well you should be able to visit localhost:4002 and see the response from your api now running in a Docker container 🐳

## Documentation

- [Node npm](https://docs.npmjs.com/cli/v6/commands/npm-init)
- [Express.js](https://expressjs.com/en/guide/routing.html)
- [Docker File](https://docs.docker.com/engine/reference/builder/)

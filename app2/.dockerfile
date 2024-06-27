FROM node:22-alpine
WORKDIR /usr/src/app
COPY package.json ./
RUN npm install
COPY . .
ENV PORT=3002
EXPOSE 3002
CMD ["npm", "start"]

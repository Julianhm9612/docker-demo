const express = require('express')
const app = express()
const port = 3001

app.get('/', (req, res) => {
  (async () => {
    try {
      const resFetch = await fetch('http://localhost:3002');
      const body = await resFetch.json();
      res.send(`Hello World! ${body.date}`)
    } catch (err) {
      res.send(err.message)
    }
  })();
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

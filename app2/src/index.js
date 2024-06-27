const express = require('express')
const app = express()
const port = process.env.PORT || 3002;

app.get('/', (req, res) => {
  res.send({
    date: new Date().toISOString()
  })
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

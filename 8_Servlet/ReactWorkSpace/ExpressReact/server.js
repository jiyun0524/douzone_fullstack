const express = require('express');
const { join } = require('path');
const path = require('path');
const app = express();

const http=require('http').createServer(app);

app.use(express.static(path.join(__dirname, "public")))
// app.use(express.static(path.join(__dirname, "../ReactProject/shop/build")))

app.get('/', function(req, resp){
    resp.sendFile(path.join(__dirname, 'shop/public/main.html'))
})

http.listen(8080, function() {
    console.log('listening on 8080');
});
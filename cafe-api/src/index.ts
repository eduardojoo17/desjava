import express from "express";

const api =express();

api.use(express.json())

api.listen(3000, function(){
    console.log("Servidor iniciado em http://localhost:3000")
})
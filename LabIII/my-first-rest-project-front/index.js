import axios from 'https://cdn.skypack.dev/axios';

const url = 'http://localhost:8080/tasks';
let tasks = [];

function getTasks(url){
    axios.get(url)
    .then(function (response) {
        console.log(response.data)
    })
    .catch(function (error) {
        console.log(error)
    });  
}
getTasks(url)

let taskPost = {
    "titulo": 'Tarefa 1',
    "descricao": 'Tarefa 1',
    "prioridade": 'Alta'
}
function postTask(url, taskPost){
    axios.post(url, taskPost)
        .then(function(response){
            console.log(response.data)
        })
    .catch(function (error){
        console.log(error)
    })
}

postTask(taskPost)
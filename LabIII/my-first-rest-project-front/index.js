const url = 'http://localhost:8080/tasks';
let tasks;
function getTasks(url){
    fetch(url, {
        method: 'GET',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.json())
    .then(data => {
            tasks = data;
        })
}


setTimeout(() => {
    console.log(tasks);
}, 1000);


function postTasks(url, data){
    fetch(url, {
        method: 'POST',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => {
        if(!response.ok){
            throw new Error('Erro de network')
        }
        return response.json()
    })
    .then(createdTask =>{
        console.log('Task criada: ', createdTask)
    }).catch(error => {
        console.log('Error', error)
    })
}

function deleteTask(url, id){
    let newUrl = url+"/"+id;
    fetch(newUrl, {
        method: 'DELETE',
        mode: 'cors',
        headers: {
            'Content-Type': 'application/json'
        }
    }).then(response => {
        if(!response.ok){
            throw new Error('Erro ao excluir tarefa')
        }
        console.log('Tarefa excluida com sucesso')
    })
    .catch(error => {
        console.log('Error: ', error)
    })
}

function cadastrarTask(){
    let titulo = document.getElementById('titulo');
    let descricao = document.getElementById('descricao')
    let prioridade = document.getElementById('prioridade')

    const dados = {
        titulo: titulo
    }
    
}
document.getElementById('buttonCadastrar').addEventListener('click', cadastrarTask)
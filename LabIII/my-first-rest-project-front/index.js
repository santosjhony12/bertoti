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
            var divContainer = document.getElementById('container-tasks');
            divContainer.innerHTML = '';

            for (let i = 0; i < data.length ; i++){
                
                var novaDiv = document.createElement('div');
                divContainer.appendChild(novaDiv);
    
                var titulo = document.createElement('h3');
                var textoTitulo = document.createTextNode('Titulo: '+ data[i].titulo);
                titulo.appendChild(textoTitulo);

                var prioridade = document.createElement('h3');
                var textoPrioridade = document.createTextNode('Prioridade: '+ data[i].prioridade);  
                prioridade.appendChild(textoPrioridade);

                var descricao = document.createElement('p');
                var textoDescricao = document.createTextNode('Descrição: '+data[i].descricao)
                descricao.appendChild(textoDescricao);
    
                novaDiv.appendChild(titulo)
                novaDiv.appendChild(prioridade)
                novaDiv.appendChild(descricao)
            } 
            
        })
}

getTasks(url)

function postTask(url, data){
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
        getTasks(url)
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

function cadastrarTask(event){
    event.preventDefault();
    let tituloTask = document.getElementById('titulo').value;
    let descricaoTask = document.getElementById('descricao').value;
    let prioridadeTask = document.getElementById('prioridade').value;

    const dados = {
        titulo: tituloTask,
        descricao: descricaoTask,
        prioridade: prioridadeTask
    }

    postTask(url, dados);
    document.getElementById('titulo').value = "";
    document.getElementById('descricao').value = "";
}




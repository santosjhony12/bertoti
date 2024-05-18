const url = 'http://localhost:8080/tasks';
let id;
async function getTasks(){
    let response = await axios.get(url);
    console.log(response.data)

    let div = document.getElementById('table-dados')
    div.innerHTML = ''

    for(let i of response.data){
        var bloco = `
            <tr>
                <th scope="row">${i.id}</th>
                <td id="titulo-${i.id}">${i.titulo}</td>
                <td id="prioridade-${i.id}">${i.prioridade}</td>
                <td id="descricao-${i.id}">${i.descricao}</td>
                <td>
                    <button type="button" class="btn btn-secondary" id="button-${i.id}" onclick="abrirModal(${i.id})">Editar</button>
                    <button type="button" class="btn btn-danger" onclick="deleteTask(${i.id})">Excluir</button>
                </td>
            </tr>
        `
        div.insertAdjacentHTML("beforeend", bloco);

    }
}

async function deleteTask(id){
    let response = await axios.delete(`${url}/${id}`);
    getTasks()
}
async function cadastrar(){
    let tituloInput = document.getElementById('title')
    let descricaoInput = document.getElementById('description')
    let prioridadeInput = document.getElementById('priority')
    data = {
        titulo: tituloInput.value, 
        descricao: descricaoInput.value,
        prioridade: prioridadeInput.value
    }

    let response = await axios.post(url, data)

    tituloInput.value = ''
    descricaoInput.value = ''
    prioridadeInput.value = ''
    getTasks()
}

function abrirModal(id) {
    let titulo = document.getElementById(`titulo-${id}`).textContent;
    let descricao = document.getElementById(`descricao-${id}`).textContent;
    let prioridade = document.getElementById(`prioridade-${id}`).textContent;

    document.getElementById("updateTitulo").value = titulo;
    document.getElementById("updateDescricao").value = descricao;
    document.getElementById("updatePriority").value = prioridade;
    this.id = id;
    $('#myModal').modal('show');
}

async function update(){
    let priorityInput = document.getElementById('updatePriority')
    let descricaoInput = document.getElementById('updateDescricao')
    let titleInput = document.getElementById('updateTitulo')

    let dados = {
        id: this.id,
        titulo: titleInput.value,
        descricao: descricaoInput.value,
        prioridade: priorityInput.value
    }
    let response = await axios.post(url, dados)
    $('#myModal').modal('hide');
    getTasks()
}
window.onload = () => {
    getTasks();
};

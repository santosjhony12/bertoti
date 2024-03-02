

/*FAZER O POP UP*/
var modal = document.getElementById('pop-up');
var btn = document.getElementById('myBtn');
var span = document.getElementsByClassName('close')[0];

btn.onclick = function(){
    modal.style.display = "block";
}

span.onclick = function(){
    modal.style.display = "none";
}
window.onclick = function(event){
    if(event.target == modal){
        modal.style.display= "none";
    }
}


/*FINALIZADO O POP UP



function Adicionar() {
    axios.post('http://localhost:8080/tasks', { 
    titulo: 'Meu Novo Título',
    descricao: 'Descrição da tarefa',
    prioridade: 'alta' }) .then(response => {
        console.log("Task adicionada", response.data)
    })
}
btnSaveTask.addEventListener('click',Adicionar)*/
var btnSaveTask = document.getElementById('saveTask');

btnSaveTask.onclick = function getAllTask(){
    axios.get('http://localhost:8080/tasks')
    .then(response => {
        console.log(response)
    })
    .catch(error => 
        console.log(error))
}
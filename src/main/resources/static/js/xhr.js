function getAllClients(){
    let table = document.getElementById("table");
    let url = "/clients";
    let xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.onreadystatechange = ()=>{
        if(xhr.readyState == XMLHttpRequest.DONE){
            if(xhr.status == 200){
                console.log(xhr.responseText)
                let users = JSON.parse(xhr.responseText);
                console.log(users[0].cin);
                table.innerHTML += fillTableC(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableC(users){
	let result="";
    result =`<tr>
            <th>CIN</th>
            <th>name</th>
            <th>prenom</th>
            <th>adress</th>
            <th>Sexe</th>
            <th>tl</th>
            <th>age</th>
        </tr>`;

    for(let i = 0; i < users.length; i++){
        result +=`<tr>
                        <td>${users[i].cin}</td>
                        <td>${users[i].name}</td>
                        <td>${users[i].prenom}</td>
                        <td>${users[i].adress}</td>
                        <td>${users[i].sexe}</td>
                        <td>${users[i].tl}</td>
                        <td>${users[i].age}</td>
                        
                </tr>`
    }
    return result;
}

function getAllCars(){
    let table = document.getElementById("table");
    let url = "/cars";
    let xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.onreadystatechange = ()=>{
        if(xhr.readyState == XMLHttpRequest.DONE){
            if(xhr.status == 200){
                console.log(xhr.responseText)
                let users = JSON.parse(xhr.responseText);
               
                table.innerHTML += fillTableR(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableR(users){
	let result="";
    result +=`<tr>
            <th>matricule</th>
            <th>namecar</th>
            <th>model</th>
            <th>color</th>
            <th>image</th>
            <th>nbplace</th>
            <th>price</th>
            
              </tr>`  ;

    for(let i = 0; i < users.length; i++){
        result +=`<tr>
                        <td>${users[i].matricule}</td>
                        <td>${users[i].namecar}</td>
                        <td>${users[i].model}</td>
                        <td>${users[i].color}</td>
                        <td>${users[i].image}</td>
                        <td>${users[i].nbplace}</td>
                        <td>${users[i].price}</td>
                  </tr>`
    }
    return result;
}




function getAllRentCar(){
    let table = document.getElementById("table");
    let url = "/rentCars";
    let xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.onreadystatechange = ()=>{
        if(xhr.readyState == XMLHttpRequest.DONE){
            if(xhr.status == 200){
                console.log(xhr.responseText)
                let users = JSON.parse(xhr.responseText);
               
                table.innerHTML += fillTableRS(users);
                
            }
        }
    }
    xhr.send();
}

function fillTableRS(users){
	let result="";
    result =`<tr>
            <th>id_rentcar</th>
            <th>Car</th>
            <th>client</th>
            <th>dateReservationCar</th>
            <th>dateReturnCar</th>
            <th>prixtotal</th>
          
           
        </tr>`;

    for(let i = 0; i < users.length; i++){
        result +=`<tr>
                        <td>${users[i].id_rentcar}</td>
                        <td>${users[i].car}</td>
                        <td>${users[i].client}</td>
                        <td>${users[i].dateReservationCar}</td>
                        <td>${users[i].dateReturnCar}</td>
                        <td>${users[i].prixtotal}</td>
                </tr>`
    }
    return result;
}


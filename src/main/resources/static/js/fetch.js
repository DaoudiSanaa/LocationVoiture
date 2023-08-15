function addClient(){
	let url = '/clients';
	let result = document.getElementById('result');
	let data ={
		cin : document.getElementById('cin').value,
		prenom : document.getElementById('prenom').value,
		name : document.getElementById('name').value,
		adress : document.getElementById('adress').value,
		sexe : document.getElementById('sexe').value,	
		tl : document.getElementById('tl').value,
		mail : document.getElementById('mail').value,	
		age : document.getElementById('age').value
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}

function addCar(){
	let url = '/cars';
	let result = document.getElementById('result');
	let data ={
		matricule : document.getElementById('matricule').value,
		namecar : document.getElementById('namecar').value,
		model : document.getElementById('model').value,
		color : document.getElementById('color').value,
		image : document.getElementById('image').value,
		nbplace : document.getElementById('nbplace').value,
		price : document.getElementById('price').value
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}

function addRentCar(){
	let url = '/rentCars';
	let result = document.getElementById('result');
	let data ={
		
		car : document.getElementById('car').value,
		client : document.getElementById('client').value,
		dateReservationCar : document.getElementById('dateReservationCar').value,
		dateReturnCar : document.getElementById('dateReturnCar').value,
		prixtotal : document.getElementById('prixtotal').value
		
	}
	let options ={
		method : 'POST',
		body : JSON.stringify(data),
		headers : {
			'Content-Type' : 'application/json'
		}
	}
	
	fetch(url, options)
	.then(response => response.json())
	.then(data => result.innerHTML = data.status + ' : ' + data.model.name + ' Bien enregistré !! ' )
	.catch(err => console.log('Erreur : ' + err))
}




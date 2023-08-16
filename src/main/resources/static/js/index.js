
function login() {
    let gmail = document.getElementById("gmail");
    let password = document.getElementById("password");

    let xhr = new XMLHttpRequest();
    let params = "gmail=" + gmail.value + "&pwd=" + password.value;
    let url = "/login?" + params
    xhr.open("GET", url, true);
    xhr.onreadystatechange = () => {
        if(xhr.readyState == 4 && xhr.status == 200) {
            let user = JSON.parse(xhr.responseText);
            if(user == null) {
                alert("Informations de connexion incorrecte")
            }
            else {
                goToMyAccount(user);
            }
        }
    }
    xhr.send();
}

function goToMyAccount(user) {
    let loginCtr = document.getElementById("login-ctr");
    loginCtr.style.display = "none";

    let account = document.getElementById("account");
    account.style.display = "flex";

    let userGreetings = document.getElementById("user-greetings");
    userGreetings.innerHTML = "Bienvenue " + user.id + " " + user.name + " !"
}
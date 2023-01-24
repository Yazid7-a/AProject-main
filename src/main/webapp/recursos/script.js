const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

function redirect() {
    window.location.href = "file:///C:/Users/yazid/Desktop/CLASE/random/Formulario-doble-2-main/animeprojectweb/index.html";
}

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});
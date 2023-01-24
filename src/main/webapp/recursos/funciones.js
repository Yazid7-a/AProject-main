/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForm(formu) {

    

    var usuario = formu.usuario;
    /*if (usuario.value === "" || usuario.value === "Escribir tu email") {
        alert("Debes de introducir un email");
        usuario.focus();
        usuario.select();
        return false;
    }*/
    validarEmail(usuario);
    
        function validarEmail(usuario) {
      if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3,4})+$/.test(usuario)){
       alert("La dirección de email " + usuario + " es correcta.");
      } else {
       alert("La dirección de email es incorrecta.");
       
      }
      usuario.focus();
      usuario.select();
      return false;
    }

    var password = formu.password;
    if (password.value === "" || password.value.length < 6) {
        alert("Debes de escribir una contraseña mayor de 6 caracteres");
        password.focus();
        password.select();
        return false;
    }

    var tecnologias = formu.tecnologia;
    var checkSeleccionado = false;

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debes seleccionar al menos una tecnología");
        return false;
    }
    
    var generos = formu.genero;
    var checkedSeleccionado2 = false;
    
    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            checkedSeleccionado2 = true;
        }
    }
    if (!checkedSeleccionado2) {
        alert("Debes seleccionar al menos un género");
        return false;
    }
    
    var profesion = formu.profesion;
    
    if (profesion.value === ""){
        alert("Debes de seleccionar al menos una profesión");
        return false;
    }


    alert("La información se ha enviado correctamente al servidor");
    return true;

}


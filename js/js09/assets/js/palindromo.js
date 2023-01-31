/*
const palindromo = (palabra) => {
    
    
    let mayus = palabra.toUpperCase(); //Hacer mayúsculas
    mayus = mayus.trim(); //quitar espacios
    let volteado = mayus.reverse();  //voltear la palabra

    if(volteado === mayus){
        return true;
    } else {
        return false;
    }
}*/
const palindromo = (palabra) =>{
    const palabraReversa = palabra
        .toLowerCase()//Convierte a minúsculas
        .replaceAll(" ","") //Quita todos los espacios 
        .split("")//Conviere un string en un array, al escribir "", separa cada letra
        .reverse()//rotamos la palabra
        .join(""); //convierte un array en un string

    return palabra === palabra.toLowerCase().replaceAll(" ","");
  }
  


module.exports = {palindromo};
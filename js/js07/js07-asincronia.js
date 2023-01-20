console.log("JS07");

const introduccion = () =>{
    console.log("01.-Bienvenidos y bienvenidas a CH22");
}

const desarrollo = () => {
    console.log("02.-Pásele a lo barrido");
}

const desarrolloAsincrono = (delay) =>{    
    //Función asíncrona.
    setTimeout( ()=> console.log(`Asíncrono - Pásele en ${delay}ms`), delay );
}

let idSetInterval;
const setIntervalAsincrono = ( delay=2000 ) => {
    let contador = 0;
    idSetInterval = setInterval( ()=> console.log(`Rockstar ${++contador} `) , delay );
} 

const stopIntervalAsincrono = () =>{
    setTimeout ( ()=> {
        console.log("Se detiene el intervalo");
        clearInterval(idSetInterval);
    } , 10_010 );
    
}

const despedida = () => {
    console.log("03.-Ay nos vidrios, nos vicenteamos luego");
}

//Progrmación síncrona
introduccion();
desarrollo();
despedida();

//Programación asíncrona
introduccion();
desarrolloAsincrono(2000);
desarrolloAsincrono(6000);
setIntervalAsincrono(2000);
stopIntervalAsincrono();
despedida(); //esta instrucción no espera a que finalice la función asíncrona

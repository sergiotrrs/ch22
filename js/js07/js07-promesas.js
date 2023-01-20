console.log("JS07 promesas");

const myPromise = new Promise( (resolve , reject)=>{
    const isOnline = false;

    if (isOnline)
        resolve("Promesa resuelta, está en línea");
    else
        reject("Promesa Rechazada, está fuera de línea");
} );

console.log("Antes de la promesa");
//console.log(  myPromise() ); Las promesas no se pueden consumir de esta forma
//consumiendo la promesa con .then y .catch
//myPromise.then( (response)=>{}  ).catch( (error)=> {}  );
myPromise
    .then( (response)=>{
        //console.log(response);
    })
    .catch( (error)=> {
       // console.error(error);
    });

console.log("Después de la promesa");

//Promesa de enviar un arreglo y multiplica sus elementos por 2;
// [2 , 5 , 7] => [4 , 10, 14] => [ 10, 14]
//Devolver solo los número que sean mayor a 5
/*
const datos = [2, 5, 7];
const datosDuplicados = datos.map( (element) => element * 2  ); //[ 4, 10, 14]
const datosFiltrador = datosDuplicados.filter( number => number>5  ); //[10, 14]
console.log(datosDuplicados);
console.log(datosFiltrador);
const procesoReducido = datos
    .map( element => element * 2)
    .filter(number => number>5);
console.log(procesoReducido);
*/

const filtrarArreglo = ( datos ) =>{
    return new Promise( (resolve, reject)=>{
        const procesoReducido = datos
            .map( element => element * 2)
            .filter(number => number>5);
        if ( procesoReducido.length )
            resolve(procesoReducido);
        else
            reject("Tu arreglo no contiene números mayores a 5");
    });
    //return solucion;
}

//Consumiendo las promesas con .then y .catch

function filtrarConPromesa(){
    console.log("Función con then y catch");
    filtrarArreglo([2,4,7])
        .then( response=> console.log(response))
        .catch( error=> console.warn(error) );
    
    filtrarArreglo([2,1,0])
        .then( response=> console.log(response))
        .catch( error=> console.warn(error) );
    console.log("Termina Función con then y catch");
}
//filtrarConPromesa();

//Consumiendo las promesas con Async y Await
async function filtrarPromesaConAwait(){
 console.log("Función con async y await");
 console.log( await filtrarArreglo([2,4,7,10]) ); 
 console.log("Termina la función con async y await");
}
//filtrarPromesaConAwait();

async function filtrarPromesaConAwaitTryCatch(){
    const refBtnAsyncAwait = document.querySelector("#btnAsyncAwait");
    refBtnAsyncAwait.disabled = true;
    try{
        //En este bloque se tratará de resolver la promesa
        console.log("Función con async y await, con try y catch");
        console.log( await filtrarArreglo([1,0,1,2]) );
    }
    catch(error){
        //En este bloque se tratará el reject que genere la promesa
        console.log("nooo, se va a acabar el mundo")
        console.warn(error);
    }
    finally{
        refBtnAsyncAwait.disabled = false;
        console.log("Termina la función con async y await");
    }
}
//filtrarPromesaConAwaitTryCatch();


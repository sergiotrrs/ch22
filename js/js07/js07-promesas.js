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
        console.log(response);
    })
    .catch( (error)=> {
        console.error(error);
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
    const solucion = new Promise( (resolve, reject)=>{
        const procesoReducido = datos
            .map( element => element * 2)
            .filter(number => number>5);
        if ( procesoReducido.length )
            resolve(procesoReducido);
        else
            reject("Tu arreglo no contiene números mayores a 5");
    });
    return solucion;
}

filtrarArreglo([2,4,7])
    .then( response=> console.log(response))
    .catch( error=> console.warn(error) );

filtrarArreglo([2,1,0])
    .then( response=> console.log(response))
    .catch( error=> console.warn(error) );
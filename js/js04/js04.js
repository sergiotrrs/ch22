console.log("Sesión js04");

const nombresCh22 = ["Manuel", "Leonardo", "Melani"];
//Usando el constructor de la clase Array
const nombresCh14 = new Array("Abue", "Cori", "Maga", "Sebas");

console.log(nombresCh22);
console.log(nombresCh14);

const promedioEdadesCh22 = [25];
// Esta línea va a generar un array de 24 elementos.
const promedioEdadesCh14 = new Array(24); //[,,,,, ... ,,,,,,]
console.log(promedioEdadesCh22);
console.log(promedioEdadesCh14);
//Conocer la longitud de un arreglo: .length
console.log( `Núm de elementos ${promedioEdadesCh22.length}` );
console.log( `Núm de elementos ${promedioEdadesCh14.length}` );
//Se recomienda declarar los arrays(objetos) con const
// para  prevenir que se cambie el tipo de dato
const armasCh22 = ["manoplas", "picahielo"]; //typeof(armasCh22) object
//armasCh22 = "filero";////typeof(armasCh22) string
console.log("Lista de armas:" + armasCh22);

//Leer un elemento del arreglo
console.log(`Jessica tiene un ${armasCh22[1]}`);
console.log(`Leonardo tiene unas ${armasCh22[0]}`);
//Cambiar un dato del arreglo
//["filero", "picahielo"];
// Los objetos son datos mutables
armasCh22[0] = "filero";
console.log(`Leonardo tiene un ${armasCh22[0]}`);

let nombreClica = "Los Wichales";
console.log(`La variable ${nombreClica} comienza con la letra ${nombreClica[0] }`)
nombreClica[0] = "T"; //No cambia,por que un string es un dato primitivo, que es inmutable
console.log(`La variable ${nombreClica} comienza con la letra ${nombreClica[0] }`)
nombreClica = "The Wichales";

// Agregamos un nuevo dato al arreglo, al final.
// Lo Sig. marca error, por que se le está reasignando el tipo de dato
//armasCh22 = ["manoplas", "picahielo", "machete"]; 
//armasCh22[5] = "machete"; //["manoplas", "picahielo", , , , "machete"]
armasCh22[2] = "machete"; //["manoplas", "picahielo", "machete"]
armasCh22[ armasCh22.length  ] = "macana";
armasCh22.push("cadena",  "bat");
console.log("Actualización de armas: " + armasCh22);
//Agregar un elemento al inicio
armasCh22.unshift("navaja", "desarmador");
console.log("Actualización de armas: " + armasCh22);

//Ciclo For
/*
 sintaxis
        for( instrucción inicio; comparación; expresión final ) instrucción
        
        for( instrucción inicio; comparación; expresión final ){
          instrucciones;
        }

        for( let i = 0; i<=10  ; i++ ){
           instrucciones;
        }
        
*/

//Iteramos los arreglos
for ( let i = 0; i < armasCh22.length; ++i )
        console.log( `Indice ${i} tiene ${armasCh22[i]} `);

//armasCh22.forEach( callbackFuncion )
function iterarArreglo( elemento, indice, arreglo){
    console.log( `CB - Indice ${indice} tiene ${elemento} `);
}

//armasCh22.forEach( iterarArreglo );
armasCh22.forEach( (elemento, indice, arreglo) => 
    console.log( `AF ${indice} tiene ${elemento}`));
// Va a iterar los índices del arreglo
for (let arma in armasCh22)
    console.log( `ForIn ${arma} tiene ${ armasCh22[arma] }`);
// va a iterar los elementos del arreglo
for (let arma of armasCh22)
    console.log( `ForOff arma: ${ arma }`);

//iterar de forma descendente las armas.
for( let i = armasCh22.length -1; i>=0 ; i--) 
    console.log("Arma: " + armasCh22[i]);
    
// Para el ciclo for no es necesario indicar en inicio, 
// la comparación, la expresión final
let iteracion = 0;
for ( ; ; ){
 console.log("valor de i " + iteracion);
 if (iteracion === 10) break;
 iteracion++;
}

// La instrucción break rompe con la iteración.
// La instrucción continue continua con la sig. iteración
for (let i=0; i<=10; i++){
    if (i === 5 ) break;
    console.log("For con break: " + i); //0, 1 ,2 ,3 ,4
}

for (let i=0; i<=10; i++){
    //instrucciones;
    if (i === 5 ) continue;
    console.log("For con continue: " + i); // 0, 1 , 2, 3, 4,     6, 7, 8, 9, 10
}
     //[ [] , [] , [] ]
const participantes = [ 
    [ "José"   , "María"   ,  "Pedro" ] , // Ch1   Fila 0
    [ "Tan"    , "Javi"    , "Andrea",  "Santi" ] , //Ch2  Fila1
    [ "Melanie", "Pavel"  ] // Ch3  Fila2
];
                                                    //Feliz Cumpleaños
                                                          //   F   C
console.log("Persona Ch3(f2) 2a persona(c1) " +  participantes[2][1] );
console.log("Persona Ch2(f1) 1a persona(c0) " +  participantes[1][0] );
console.log("Persona Ch1(f0) 3a persona(c2) " +  participantes[0][2] );

for (fila = 0 ; fila< participantes.length; fila++){
    console.log(participantes[fila]); //Iterando las filas
    for (columna = 0 ; columna< participantes[fila].length ; columna++ ){
        console.log( participantes[fila][columna] );
    }
}

// Usando break en ciclos aninados
// Dejar de mostrar los nombre, cuando se encuentre a Tan

//Usando una variable como bandera
let continuarIteraciones = true;
for (fila = 0 ; fila< participantes.length; fila++){   
        for (columna = 0 ; columna< participantes[fila].length ; columna++ ){
            console.log(`[${fila}][${columna}]`);
            if ( continuarIteraciones)
                console.log("Uso de break " + participantes[fila][columna] );
            if ( participantes[fila][columna] === "Tan") continuarIteraciones= false;
        }   
}

//Usando Break
clicloFila:
for (let fila = 0 ; fila< participantes.length; fila++){
    cicloColumna:
    for (let columna = 0 ; columna< participantes[fila].length ; columna++ ){
        console.log(`[${fila}][${columna}]`);
        console.log("Uso de break " + participantes[fila][columna] );
        if ( participantes[fila][columna] === "Tan") break clicloFila;
    } 
}

//Usando continue
clicloFila:
for (let fila = 0 ; fila< participantes.length; fila++){
    cicloColumna:
    for (let columna = 0 ; columna< participantes[fila].length ; columna++ ){
        if ( participantes[fila][columna] === "Javi") continue clicloFila;
        console.log(`[${fila}][${columna}]`);
        console.log("Uso de continue " + participantes[fila][columna] );
    } 
}

//Ciclo while
/*
 sintaxis:
    while ( condicion_verdadera) instrucción;

    while ( condicion_verdadera){
        instrucciones;
    } 

*/
let numIteracion = 0;
/* while ( confirm("Quieres seguir iterando? ")  ){
    console.log("Iteración n. " + numIteracion++);
}
 */
// Preguntar del 1 al 10 y saber si es el número que pensó el usuario
let number = 1;
/* while( !confirm(`${number} es tu numero?`) ) {
    number++;    
}
 */
number = 0;
/* while( !confirm(`${++number} es tu numero?`) );
console.log("Tu número es el " + number);
*/

// ciclo do-while
/*
 Sintaxis:
     do {
        instrucciones;
     } while( condicion_verdadera);
*/
let valor = 10;
while( valor < 5 ){
    console.log("while " + valor); // nada
    valor++;
} 

valor = 10;
do {
    console.log("do while " + valor); // 10
    valor++;    
} while( valor < 5 );

/**
 * FIFO: first input first output
 * LIFO: last input first output
 * 
 */
const alimentosPerecederos = [];
//Agregando una caja.
// Usando FIFO
alimentosPerecederos.push("manzanas lunes");
alimentosPerecederos.push("manzanas miércoles");
//Sacando manzanas del lunes
console.log("Sacando a la venta " + alimentosPerecederos.shift()); //lunes
console.log("Sacando a la venta " + alimentosPerecederos.shift()); //miércoles

//Usando LIFO
//Tenemos una ferretería
const productos = ["desarmadores","cemento"];
// agrego luces navideñas en diciembre
productos.push("luces navideñas");
console.log("Sacando a la venta " + productos.pop() );
console.log("Sacando a la venta " + productos.pop() );
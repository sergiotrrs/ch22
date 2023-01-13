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
    



console.log("Sesión Js05");

// Operador de asignación
let estadoDiminutoDeMexico = "Talxcala";
{
    let espaniol = ingles = rumano = turco = vasco = chino = true;
    let japones = true; let cholo = false; //Variable global no declarada.

}
console.log("Francisco habla ingles = " + ingles);
console.log("Francisco habla rumano = " + rumano);
console.log("Francisco habla turco = " + turco);
console.log("Francisco habla vasco = " + vasco);
console.log("Francisco habla chino = " + chino);

//console.log("Francisco habla español = " + espaniol); MArca error, está fuera del scope

// Operadores aritméticos
// multiplicación
let metrosCuadrados = 10 * 30; //300;
// tenemos 2 terrenos
// metrosCuadrados = metrosCuadrados * 2;
// Operadores simplificados
metrosCuadrados *= 2; //600 

// división /
// dividmos el terrenito entre 3 hijos
metrosCuadrados /= 3; //200
console.log("m2 de 3 terrenos " + metrosCuadrados);

// residuo %
//Quiero saber si los metrosCuadrados son múltiplo de 2
let esMultiplo2 =  metrosCuadrados % 2 === 0  ? "Sí":"No"; //0 ->Sí
console.log("La cantidad es múltiplo de 2? " + esMultiplo2  );

// Resta -
let precioTerreno = 90000
let precioM2 = precioTerreno/300;
console.log(`Precio del metro cuadrado ${precioM2} pesitos`);
let cantidadPagada = 30000;
let cantidadRestante = precioTerreno - cantidadPagada;
console.log(`Cantidad restante $${cantidadRestante} pesos`);
// se abonó $10,000
console.log(`Cantidad restante $${cantidadRestante -= 10000} pesos`);

// Suma
// cobro por la generación de escrituras (8% costo terreno)
const costoEscrituras = precioTerreno * 0.08;
precioTerreno += costoEscrituras;
console.log("Terreno + escrituras $" + precioTerreno); //97200

//console.log("Terreno + escrituras $" + (precioTerreno += precioTerreno * 0.08 ));

 //Concatenación de strings
 let nombre = "Alan";
 nombre += " García"; // nombre = nombre + " García";
 console.log("Nombre personas Ch22 " + nombre);

 //Operadores de incremento y decremento, incrementan o decrementan en una unidad.
 // preincremento ++variable, postincremento varible++
 // predecremento --variable, postdecremento varible-- 
let numClavosParaMiCasa = 100;
numClavosParaMiCasa++; //101
console.log("Núm. de clavos: " + numClavosParaMiCasa);
++numClavosParaMiCasa; //102
console.log("Núm. de clavos: " + numClavosParaMiCasa);//102
console.log("Núm. de clavos: " + numClavosParaMiCasa++); //imprimir102 -> var: 103
console.log("Núm. de clavos: " + ++numClavosParaMiCasa); //104
//-----------------------
let respuestasExamen = 95;
//Agregamos punto extra
console.log("Resultado final: "+ respuestasExamen++ ); //95 -> var = 96

respuestasExamen = 82; //82
do{
 console.log("Resultado: " + respuestasExamen); //último valor 100
 // ++respuestaExamen  o ++respuestaExamen
}while( ++respuestasExamen <=100 )
console.log("Resultado final: "+ respuestasExamen );//valor impreso 101

let nivelSuenio = 99;
if ( nivelSuenio++ === 100) console.log("Me voy a mimir en la sesión");
console.log("Nievel de sueño " + nivelSuenio); //100

//Preincremento 
let x = 10;
x = x + 1;
console.log(x); //++x   x+=1   x= x+1;

//Postincremento
let y = 10
console.log(y); //y++
y = y + 1;
//-------------------
x = 3;
y = x++;
console.log(`x:${x}  y:${y}`); // x:4 y:3

x = 3;
y = ++x;
console.log(`x:${x}  y:${y}`); // x:4 y:4

//Operadores relacionales
/**
 *   <= menor o igual que
 *   >= mayor o igual que
 *   > mayor que
 *   < menor que
 */
let numPerfumes = 10;
if ( numPerfumes >= 10 ) console.log("Que elegancia la de francia");

//Operadores de igualdad:
/**
 *   == operador igual
 *   === estrictamente igual
 *   != difente que
 *   !== estrictamente diferente que
 */
let numMatriculaPavel = "10025";
if ( numMatriculaPavel == 10025 ) console.log("Pavel está aprobado");
if ( numMatriculaPavel === 10025 ) console.log("Pavel está en nivel fase 5");
if ( numMatriculaPavel >= 10025 ) console.log("Pavel está en el CUCEI");


//Operadores lógicos
// && (AND)  || OR
let numRebosos = 3;
let teGustaReboso = false;
let vivesEnElExtranjero = false;
if (numRebosos>5 || teGustaReboso ) console.log("Te regalo un reboso de Oaxaca");

if (numRebosos > 0 || teGustaReboso && vivesEnElExtranjero)
    console.log("Te vendo mi reboso en dolares");

//Operadores de corto circuito
//   OP1 && OP2  Si OP1 = true, se realiza el resultado de OP2
let online = true
let mensaje = "Estamos en línea";
let respuesta = online && mensaje;
console.log("respuesta: " + respuesta);

let edadPersona = 18;
mensaje = "Puede votar";
console.log( "La persona puede votar? " +  (edadPersona >= 18 && mensaje)  );

// OP1 || OP2  Si OP1 = true, se realiza el resultado de OP1

let isOnline = true;
let isActive = true;

if( isOnline){
    if ( isActive)
        console.log("Estamos autorizado");
}

if ( isOnline && isActive)
    console.log("Estamos autorizados");

isOnline && isActive && console.log("Estamos autorizados");

let edadMiSobrina = 15;
console.log(  edadMiSobrina>18 && "Puede votar"  );
let numDeQuesadillasAComer = "3";
let guisado = "Huitlacoche";

console.log("Montse comerá quesadilla de: " +  (numDeQuesadillasAComer&&guisado) );

let nombreConductor = "Pax";
let tieneLicenciaConducir = true;
let edadConductor = 50;

const seRentaAuto = nombreConductor && tieneLicenciaConducir && edadConductor<60;
console.log("Resultado" + seRentaAuto);

const datosQuesadilla = {
    tortilla: "maiz",
    tieneQueso: true,
    pica: "poquito"
}

const picaLaQuesadilla = datosQuesadilla.pica && "Pica mucho";
console.log(picaLaQuesadilla);


/**
 * Selecciona la operacion y realiza el callback de la función.
 * @param {function} operacion callback de la función
 */
function escogiendoOperacion(fncOperacion) {

}

escogiendoOperacion()

const obtenerValoresDeEntrada = () =>{
    const a = document.getElementById("a").value;
    const b = document.getElementById("b").value;
    return [a , b]; // { a , b}
}


const suma = () => {
    const [valorA , valorB ] = obtenerValoresDeEntrada();
    // const {valorA , valorB } = obtenerValoresDeEntrada();
    document.getElementById("r").innerHTML= parseInt ( valorA) + parseInt( valorB);

}
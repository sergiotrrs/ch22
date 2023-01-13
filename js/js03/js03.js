console.log("Sesión JS03");

const datosUsuario = {nombre:"Jessica" , ciudad:"CDmx"};

//Declaración de bloque.
{
    //ESto es un declaaración de bloque
    //en donde las variables declaradas(let , const)
    //solo tendrán alcance(scope) dentro del bloque o 
    //bloque anidados dentro del bloque
    const datosUsuario = {nombre:"Wicho" , ciudad:"Aguascalientes"};
    const numPersonas = 49;
    console.log(`${datosUsuario.nombre} nos saluda de ${datosUsuario.ciudad}`);
    {
        console.log(`${datosUsuario.nombre} nos saluda de ${datosUsuario.ciudad}`);        
    }
}

console.log(`${datosUsuario.nombre} nos saluda de ${datosUsuario.ciudad}`);
//La variable numPersonas no está definido.
//console.log(`En este momento hay ${numPersonas} escuchando rolitas de Shakira`);

//Condicional If
/*Sintaxis
    if(condiciónVerdadera ) instrucción;
    
    if(condiciónVerdadera ) instrucción;
    else instrucción_en_caso_contrario;

    if(condiciónVerdadera ) {
        instrucciones;
    }
*/
const respuesta = false; //confirm("¿Te gusta Shakira?");
console.log(respuesta);
let mensaje;

if(respuesta){
    //mensaje = "Entonces te pongo WakaWaka";
    mensaje = "Te fe-li-ci-to que bien actuas";
}
else
    mensaje = "Entonces te pongo Su Chambelán";
console.log(mensaje);

//Operador ternario.
//Sintaxis: condición ? condición_verdadera : condición_falsa;

let teamFrio = true; //confirm("¿Te gusta el frío?");
//let mensajeTernario = teamFrio ? "hielito" : "ponche";
//console.log(`Te voy a servir: ${mensajeTernario} `);
console.log(`Te voy a servir: ${ teamFrio ? "hielito":"ponche" }`);

let cantante = "Sergio";

console.log(`Tu reloj es ${  cantante==='Shakira'? "Rolex" :
                             cantante ==="Pique" ? "Casio" : "el sol" }`);
/*
    let marcaReloj;
    if( cantante === 'Shakira' ) marcaReloj = "Rolex";
    else{
        if( cantante === 'Pique') marcaReloj = "Casio"
        else marcaReloj = "el sol";
    }
    console.log(`Tu reloj es ${ marcaReloj})
*/
// condicional If, Else, Else IF
/* Sintaxis
    if(condiciónVerdadera ) instrucción;
    else if (segundaCondicion) instrucción
    else if (terceraCondicion) instrucción
    else if (condicion n) instrucción
    else instrucción;
*/
let nombrePersona = 'Karla';
let marcaReloj;
if( nombrePersona === 'Shakira' ) 
    marcaReloj = 'Rolex';
else if( nombrePersona === 'Pique' || nombrePersona ==='Karla' ) 
    marcaReloj = 'Casio';
else if( nombrePersona === 'Sergio') 
    marcaReloj = 'el sol';
else 
    marcaReloj = 'uno de cars';

console.log(`${nombrePersona} tu reloj es ${ marcaReloj}`);

//Operadores lógicos and(&&) y or(||)
/*AND
  A        B ->   C
  true    true    true
  true    false   false
  false   true    false
  false   false   false

  OR
  A        B ->   C
  true     true   true
  true     false  true
  false    true   true
  false    false  false
*/

/*
  Condicional Switch
    Sintaxis:
        switch(expresion){
            case valor1:
                instrucciones;
                break;
            caso valor2:
                instrucciones;
                break;
            caso valorn:
                instrucciones;
                break;
            defaul:
                instrucciones;
        }
*/
nombrePersona = 'Mon';
marcaReloj = '';

switch(nombrePersona){
    case 'Shakira': //nombrePersona ==== 'Shakira';
        marcaReloj = 'Rolex';
        break;
    case 'Pique':            
    case 'Karla':
        marcaReloj = 'Casio';
        break;
    case 'Sergio':
        marcaReloj = 'El sol';
        break;
    case 'Mon':
        marcaReloj = 'Ferrari';
        break;
    default:
        marcaReloj = 'Uno de Cars'
}
console.log(`Switch - ${nombrePersona} tu reloj es ${ marcaReloj}`);

/*
    Preguntar(prompt) el número de mes, del 1 al 12.
    de acuerdo al mes indica desplegar en consola
    la estación del año:
    mes 12, 1, 2 = Invierno;
    mes 3, 4, 5 = Primavera;
    mes 6, 7, 8 = Verano;
    mes 9, 10, 11 = Otoño;

    Usar switch.
    La estación del año es invierno
    Mes: 1
    En enero la estación del año es invierno
    mes: 6
    En junio la estación del año es verano
*/

function buscaEstacionYMes (mes){
    //siwtch
    return "mensaje";
}

function validaMes( mes ){
    if(mes>=1 && mes<=12) buscaEstacionYMes(mes);
    else
     console.log("error del mes");
}

const respuestaUsuario =12 //parseInt(prompt("Ingresa el mes"));
validaMes(respuestaUsuario);

//---------Refactorizar, usando un operador ternario
function factorial( number ){
    return number<1 ? 1 : number * factorial(number-1);
}
console.log("Factorial 5 = " + factorial(5) ); //120
console.log("JS08 Objetos");

//crear un objeto
const frutasColor = { 
    fresa: "roja", 
    pinia: "amarillo",
    pepino: "verde",
    naranja: "verde-amarillo"
};

//formas de leer un objeto
console.log( frutasColor.fresa  );
console.log( frutasColor['pepino']);
const colorFrutaNaranja = "naranja";
console.log( frutasColor[ colorFrutaNaranja ] ); //verde-amarillo
//Modificación a un valor
frutasColor[ colorFrutaNaranja ] = "amarillo anaranjado";
console.log( frutasColor[ colorFrutaNaranja ] ); //amarillo anaranjado

//Iterando los obajetos
for (let frutaColor in frutasColor) //Voy a leer las claves
    console.log("clave", frutaColor, "valor", frutasColor[frutaColor]);

/* for (let frutaColor of frutasColor) //Leer los valore del objeto
    console.log("Valor", frutaColor);
 */

// Uso de symbol
const oculto = Symbol();

const datosAutomovil = {
    modelo: "Vochito",
    fabricante: "VW",
    [oculto] : 250_000
}

for ( let clave in datosAutomovil)
    console.log("Dato " + datosAutomovil[ clave ]);

console.log("Dato oculto " + datosAutomovil[ oculto ]);

localStorage.setItem( "automovil" ,  JSON.stringify(datosAutomovil)  );

// Solicitud de Jaime
const words = ['hello', 'world', 'javascript'];
const capitalizedWords = words.map(word => word[0].toUpperCase() + word.slice(1));
console.log(capitalizedWords);  // ["Hello", "World", "Javascript"]

//---------------------------------------------------------------

const myArray = [ 5, 7, 8, 14];

//Creando un arreglo usando el constructor
const myArrayWithConstructor = new Array( 5, 7, 8, 14);
//leyendo una propiedad del objeto myArray
//Propiedad de longitud
//Las propiedades con características del objeto, estos no llevan paréntesis
myArray.length //4

//Usando el método(acción) para extraer el 7 y 8
console.log(myArray.slice( 1 , 3)) // [7, 8]







console.log("JS08-Clases");

// Para crear una clases se usa la plabra reservada Class
// El nombre de la clase debe ser con notación PascalCase (UpperCamelCase)
class Usuario {
    nombre;
    // email
    #carritoCompras;
    //Crear el constructor de la clase
    constructor( nombre, email, direccion, telefono ){
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaCreacion = new Date();
        this.#carritoCompras = [];
    }
/* 
    set carritoCompras( producto ){
        this.#carritoCompras.push( producto);
    } */

    get carritoCompras(){
        return this.#carritoCompras;
    }

    agregarProductoACarrito( producto){
        this.#carritoCompras.push( producto);
    }

    imprimirDatos(){
       let listadoProductos = "";
       this.#carritoCompras
        .forEach( producto=> listadoProductos+= producto.imprimirDatos() + "\n" );
        /* if( this.#carritoCompras.length > 0){
            for (let producto of this.#carritoCompras){
                listadoProductos += `
                UUID:\t${producto.uuid}
                Producto:\t${producto.nombre} 
                Precio:\t${producto.precio}
                `;
            } 
        } */
           
        const obtenerDatos = 
        `=====DATOS DEL USUARIO=====
        nombre: ${this.nombre}
        email: ${this.email}
        direccion: ${this.direccion}
        teléfono: ${this.telefono}
        fecha de creación: ${this.fechaCreacion}
        ${listadoProductos}
        `;
        return obtenerDatos;
    }

}


const datoJson = `{
    "name":"morpheus",
    "job":"leader",
    "skills":[
       "KunFu",
       "Capitan"
    ],
    "tripulacion":{
       "operador":"Tanque",
       "elegido":"Neo"
    },
    "vivo":true,
    "edad":45
 }`;

 const productosTemporada = `
 [
  {
    "nombre" : "Pantalón roto y pintado",
    "precio" : 2500,
    "imagen" : "http://mirepo.com/pantalon.jpg",
    "descripcion": "Pantalón a la moda, roto por todos lados",
    "tallas" : ["L","M","CH"]
  },
  {
    "nombre" : "Sudadera",
    "precio" : 300,
    "imagen" : "http://mirepo.com/sudarea.jpg",
    "descripcion": "Sudadera de NFL",
    "tallas" : ["Unitalla"]
  }
 ]
 `;

export { Usuario, datoJson, productosTemporada };
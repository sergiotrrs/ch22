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
        if( this.#carritoCompras.length > 0){
            for (let producto of this.#carritoCompras){
                listadoProductos += `
                UUID:\t${producto.uuid}
                Producto:\t${producto.nombre} 
                Precio:\t${producto.precio}
                `;
            } 
        }
           
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

export { Usuario };
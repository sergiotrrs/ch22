//Pilares de la programación orientada a objetos
// Encapsulamiento
// Abstracción
// Herencia
// polimorfismo

class Producto {
    #nombre;
    #precio;
    #uuid;
    #createdAt;

    constructor(nombre, precio, uuid){
        this.#nombre = nombre;
        this.#precio = precio;
        this.#uuid = uuid;
        this.#createdAt = new Date();
    }

    //Para dar acceso a los atributos encapsulados, usamos
    //los métodos setters y getters

    get nombre(){ // leer el atributo
        return this.#nombre;
    }
        
    set nombre( nombre){
        //Solo guardar si la longitud es mayor a 5 caracteres
        this.filtrarNombre(nombre , 5) && (this.#nombre = nombre);
    }
    
    get precio() {
        return this.#precio;
    }
    set precio(precio) {
        this.#precio = precio;
    }
    get uuid() {
        return this.#uuid;
    }
    /* set uuid(uuid) {
        this.#uuid = uuid;
    }
 */

    filtrarNombre( nombre , longitudMinima ){
        if (nombre.length > longitudMinima)
            return true;
        else
            throw `La longitud es menor a ${longitudMinima} caracteres`;
    }
    
    imprimirDatos(){
        return `
        UUID : ${this.uuid}
        Nombre: ${this.nombre}
        Precio: ${this.precio}`;
    }
    //Realizar los setters and getters del resto de atributos


}


class ProductoElectronico extends Producto{
    #diasParaGarantia;

    constructor(nombre, precio, uuid, diasParaGarantia){
        //Super() hace referencia al constructor de la clase padre
        super(nombre, precio, uuid);
        this.#diasParaGarantia = diasParaGarantia;        
    }    

    //agregar el set and get de diasParaGarantia.
    set diasParaGarantia( dias ){
        this.#diasParaGarantia = dias;
    }

    get diasParaGarantia(){
        return this.#diasParaGarantia;
    }

    //Sobreescritura(overriding) de métodos
    imprimirDatos(){
        return super.imprimirDatos() + `
        Garantia: ${this.diasParaGarantia}
        `;
    }

}


export { Producto, ProductoElectronico };
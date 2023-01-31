
const suma= (a,b) =>{
    //Si quiero 2 decimales
    /*const valorAEntero = a*100;
    const valorBEntero = b*100;
    const suma = valorAEntero + valorBEntero;

    return suma / 100;*/
    return (a*100+b*100)/100;
};

module.exports = {suma};
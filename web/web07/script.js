console.log("Mensaje desde el script externo");

function changeColor(){
    document.getElementById("demo").style.color = "red";
}

function changeColorH2(reference, color){
    console.log(reference);
    console.log(color);
    //document.getElementById("color-h2").style.color = color;
    reference.style.color = color;
}

function changeColorByClass(color){
    const collection = document.getElementsByClassName("example");
    console.log(collection); 
    for (let index = 0; index < collection.length; index++) {        
        collection[index].style.color = color;
    }

}
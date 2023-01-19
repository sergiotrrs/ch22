console.log("Sesion js06");

const obtenerNombre = () => prompt("Escribe tu nombre", "Sergio");

const encontrarElementoById = () => {
  const element = document.getElementById("titulo");
  //console.log("Datos del objeto: ", element);
  console.log("Entre las etiquetas" + element.innerHTML);

  //element.innerHTML += " Manipulación del DOM";
  //Con InnerHTML puedo agregar nuevas etiquetas
  const nombreDesarrollador = "Sergio"; //obtenerNombre();
  //element.innerHTML += ` Manipulación del <strong>DOM</strong> por <em>${nombreDesarrollador}</em>`;
  element.innerHTML = `<h1>${element.innerHTML} <em>Manipulación</em> del <strong>DOM</strong> por <span><em>${nombreDesarrollador}</em></span> </h1>`;
};
encontrarElementoById();

const encontrarElementosByTagName = () => {
  //const elements = document.getElementsByTagName("p");
  const [, introRef] = document.getElementsByTagName("p");

  //Obtenemos el indice 0
  //const introRef = elements[1].innerHTML;
  //Modificamos el contenido de introRef
  console.log(introRef?.innerHTML);
  introRef.innerHTML =
    "Las <strong>quesadillas</strong> van con <em>queso</em>, es un hecho";
};
//encontrarElementosByTagName();

//Función que me cambia a azul el estilo de las etiquetas <em>
const cambiarColorEm = ( nuevoColor) => {
    const elements = document.getElementsByTagName("em");
    console.log(elements.length);
    for (let element of elements){
      element.innerHTML = `<span style="color:${nuevoColor};"> ${element.innerText}</span>`;
      //element.style.color = nuevoColor;
    }
}
//cambiarColorEm("blue");

const diferenciaInnerHTMLInnerText = () => {
  const element = document.getElementById("titulo");
  console.log(element.innerHTML);
  console.log(element.innerText);
}
diferenciaInnerHTMLInnerText();

const encontrarElementosByClassName = () => {
  const elements = document.getElementsByClassName("subtitulo"); //contiene una colección
  for (let element of elements)
    console.log(element.innerText);  
}
encontrarElementosByClassName();

//El selector universal
const encontrarElementoByQuerySelector = () =>{
  //const element = document.querySelector("span>em");
  const element = document.querySelector(".subtitulo"); //Nos trae el primer nodo
               //document.querySelectorAll(".subtitulo") //Nos trae todos los nodos
  console.log(element?.innerText);
}
encontrarElementoByQuerySelector();

const crearElemento = () => {
  const newElement = document.createElement("p");
  newElement.innerHTML = `La Ch22 es bien <strong>chida</strong> por
  <ul>
    <li>Diversas</li>
    <li>Listos y listas</li>
    <li>Hay clases de bienes raices</li>
    <li>Cholos</li>
    <li>Amigables</li>
    <li>La ch22 te respalda</li>
    <li>Sin problemas en quesadillas</li>
    <li>Aplican: <strong>has compitas, no compitas</strong></li>
    <li>Tenemos a Wicho y Pavel</li>
  </ul>
  `;
  document.getElementById("datos-generation").appendChild(newElement);
  const nodoClonado = newElement.cloneNode(true);
  document.getElementById("noticias").appendChild(nodoClonado);
}
crearElemento();
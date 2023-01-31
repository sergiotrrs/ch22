const {palindromo} = require('../js/palindromo');

/*
    "Ana" R:true
    "Bob" R: true
    "Radar" R: true
    "Reconocer" R: true
    "Nos quejamos" R: false
    "Saoko" R: false
    "Somos o no somos" R: true
*/


test("Prueba de que Ana es palíndromo", ()=>{
    expect( palindromo("Ana")).toBe(true) ;
});

test("Prueba de que Somos o no somos es palíndromo", ()=>{
    expect( palindromo("Somos o no somos")).toBe(true) ;
});
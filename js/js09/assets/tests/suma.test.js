const {suma} = require('../js/suma');

test("Prueba de 1 + 3 es igual a 4", ()=>{
    expect( suma(1,3) ).toBe(4);
});

test("Prueba de 10 + -15 es igual a -5", ()=>{
    expect( suma(10,-15) ).toBe(-5);
});

test("Prueba de 10.1 + 1.2 es igual a 11.3", ()=>{
    expect( suma(10.1,1.2) ).toBe(11.3);
});

/* 
test("Prueba de 10.1 + 1.2 es igual a 11.3", ()=>{
    expect( suma(10.1,1.2) ).toBeCloseTo(11.3);
}); */
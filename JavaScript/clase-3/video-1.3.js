function miFuncion() {
    //console.log("Sumamos: " + (a + b)); Sumamos: 9

    return a + b;
}

miFuncion(5,4); // 9


//let resultado = miFuncion(6,7);
console.log(resultado); // 13

let x = function(a, b) { return a + b }; //necesita cierre con punto y coma
let resultado = x(5, 6); //al llamarla se pone la variable y parentesis
console.log(resultado); // 11
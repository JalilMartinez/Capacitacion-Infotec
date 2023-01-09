const funcSumar = function (valor1:number, valor2:number, valor3?:any):number {
    if(valor3!=null){
        return valor1+valor2+valor3;
    }
    return valor1+valor2;
}

console.log(funcSumar(4,8,9));
console.log(funcSumar(4,8));

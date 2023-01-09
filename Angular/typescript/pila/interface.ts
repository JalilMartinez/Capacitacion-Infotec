class PilaGenerica<T>{// class PilaEnteros
    private vec:T[]=[];
    insertar(x:T){
        this.vec.push(x);
    }

    extraer(){
        if(this.vec.length>0){
            return this.vec.pop();
        }else{
            return null;
        }
    }
}

// class PilaStrings{
//     private vec:string[]=[];
//     insertar(x:string){
//         this.vec.push(x);
//     }
//     extraer(){
//         if(this.vec.length>0)
//             return this.vec.pop();
//         else
//             return null;
//     }
// }

let pila1 = new PilaEnteros();
pila1.insertar(50);
pila1.insertar(30);
pila1.insertar(8);
console.log(pila1.extraer());


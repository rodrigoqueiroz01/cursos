let amigo = {
    nome: "José",
    sexo: "M",
    peso: 85.4,
    engordar(peso = 0) {
        console.log('Engordou!');
        this.peso += peso;
    }
};

amigo.engordar(2);

console.log(`${amigo.nome} pesa ${amigo.peso}Kg`);
function contar() {
    let inicio = document.getElementById('txtinicio')
    let fim = document.getElementById('txtfim')
    let passo = document.getElementById('txtpasso')
    let resultado = document.getElementById('resultado')

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
        resultado.innerHTML = 'Impossível contar!'
    } else {
        resultado.innerHTML = 'Contando: <br>'

        let i = Number(inicio.value)
        let f = Number(fim.value)
        let p = Number(passo.value)

        if (p <= 0) {
            window.alert('Passo inválido! Considerando PASSO 1')
        }    

        if (i < f) {
            // CONTAGEM CRESCENTE
            for (let c = i; c <= f; c += p) {
                resultado.innerHTML += `${c} \u{1F449} `
            }
        } else {
            // CONTAGEM REGRESSIVA
            for (let c = i; c >= f; c + p) {
                resultado.innerHTML += `${c} \u{1F449}`
            }
        }

        resultado.innerHTML += `\u{1F3C1}`
    }
}
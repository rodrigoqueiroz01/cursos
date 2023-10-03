function tabuada() {
    let numero = document.getElementById('txtnumero')
    let tabuada = document.getElementById('seltab')

    if (numero.value.length == 0) {
        window.alert('[ERRO] Digite um número!')
    } else {
        let num = Number(numero.value)
        let c = 1

        tabuada.innerHTML = ''

        while (c <= 10) {
            let item = document.createElement('option')
            item.text = `${num} x ${c} = ${num * c}`

            tabuada.appendChild(item)
            c++
        }
    }
}
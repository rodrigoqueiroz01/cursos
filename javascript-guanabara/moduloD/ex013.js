var agora = new Date()
var diaSemana = agora.getDay()
var hora = agora.getHours()

/*
Em JS, os dias da semana são assim:

    0 = Domingo
    1 = Segunda
    2 = Terça
    3 = Quarta
    4 = Quinta
    5 = Sexta
    6 = Sábado
*/

switch(diaSemana) {
    case 0:
        console.log(`Hoje é Domingo, e são exatamente ${hora} horas.`)
        break
    case 1:
        console.log(`Hoje é Segunda, e são exatamente ${hora} horas.`)
        break
    case 2:
        console.log(`Hoje é Terça, e são exatamente ${hora} horas.`)
        break
    case 3:
        console.log(`Hoje é Quarta, e são exatamente ${hora} horas.`)
        break
    case 4:
        console.log(`Hoje é Quinta, e são exatamente ${hora} horas.`)
        break
    case 5:
        console.log(`Hoje é Sexta, e são exatamente ${hora} horas.`)
        break
    case 6:
        console.log(`Hoje é Sábado, e são exatamente ${hora} horas.`)
        break
    default:
        console.log(`[ERRO] Dia inválido! | ${hora} horas`)
        break
}

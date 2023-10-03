function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var formAno = document.getElementById('txtano')
    var resultado = document.querySelector('div#resultado')

    if (formAno.value.length == 0 || formAno.value > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente')
    } else {
       var formSexo = document.getElementsByName('radsex')
       var idade = ano - Number(formAno.value)
       var genero = ''
       var img = document.createElement('img')

       img.setAttribute('id', 'foto')
       
       if (formSexo[0].checked) {
            genero = 'Homem'

            if (idade >= 0 && idade < 11) {
                img.setAttribute('src', 'idade/image/bebe-m.png')
            } else if (idade < 21) {
                img.setAttribute('src', 'idade/image/jovem-m.png')
            } else if (idade < 50) {
                img.setAttribute('src', 'idade/image/adulto-m.png')
            } else if (idade < 150) {
                img.setAttribute('src', 'idade/image/idoso-m.png')
            } else {
                alert('Idade incorreta!')
            }
       } else if(formSexo[1].checked) {
            genero = 'Mulher'

            if (idade >= 0 && idade < 11) {
                img.setAttribute('src', 'image/bebe-f.png')
            } else if (idade < 21) {
                img.setAttribute('src', 'image/jovem-f.png')
            } else if (idade < 50) {
                img.setAttribute('src', 'image/adulto-f.png')
            } else if (idade < 150) {
                img.setAttribute('src', 'image/idoso-f.png')
            } else {
                alert('Idade incorreta!')
            }
       }

       resultado.innerHTML = `Detectamos ${genero} com ${idade} anos.`
    }
}
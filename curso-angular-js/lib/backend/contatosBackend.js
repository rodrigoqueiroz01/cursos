var express = require('express');
var bodyParser = require('body-parser');

var app = express();

app.use(express.static(__dirname + '/public'));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

var contatos = [
    {
        nome: "Bruno",
        sobrenome: "Aguiar",
        telefone: "9999-2222",
        data: new Date(),
        operadora: {
            nome: "Oi",
            codigo: 14,
            categoria: "Celular"
        },
        serial: "NP9@/DTDC^"
    },
    {
        nome: "Sandra",
        sobrenome: "Maria",
        telefone: "9999-3333",
        data: new Date(),
        operadora: {
            nome: "Vivo",
            codigo: 15,
            categoria: "Celular"
        },
        serial: "&05[)YQZ.7"
    },
    {
        nome: "Mariana",
        sobrenome: "Lemos",
        telefone: "9999-9999",
        data: new Date(),
        operadora: {
            nome: "Tim",
            codigo: 41,
            categoria: "Celular"
        },
        serial: "(MID=SK09."
    }
];

var operadoras = [
    {
        nome: "Oi",
        codigo: 14,
        categoria: "Celular",
        preco: 2
    },
    {
        nome: "Vivo",
        codigo: 15,
        categoria: "Celular",
        preco: 1
    },
    {
        nome: "Tim",
        codigo: 41,
        categoria: "Celular",
        preco: 3
    },
    {
        nome: "Claro",
        codigo: 44,
        categoria: "Celular",
        preco: 2
    },
    {
        nome: "GVT",
        codigo: 25,
        categoria: "Fixo",
        preco: 1
    },
    {
        nome: "Embratel",
        codigo: 21,
        categoria: "Fixo",
        preco: 2
    }
];

app.listen(process.env.PORT || 3412);

app.all('*', function(req, res, next) {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Methods', 'PUT, GET, POST, DELETE, OPTIONS');
    res.header('Access-Control-Allow-Headers', 'Content-Type');
    next();
});

app.get('/contatos', function(req, res) {
    res.json(contatos);
});

app.post('/contatos', function(req, res) {
    contatos.push(req.body);
    res.json(true);
});

app.get('/operadoras', function(req, res) {
    res.json(operadoras);
});
export function inspect() {
    return function (target, propertyKey, descriptor) {
        const metodoOriginal = descriptor.value;
        descriptor.value = function (...args) {
            console.log(`--- Método ${propertyKey}`);
            console.log(`----- parâmetros: ${JSON.stringify(args)}`);
            const retornoMetodo = metodoOriginal.apply(this, args);
            console.log(`----- retorno: ${JSON.stringify(retornoMetodo)}`);
            return retornoMetodo;
        };
        return descriptor;
    };
}

export function escapar(target, propertyKey, descriptor) {
    const metodoOriginal = descriptor.value;
    descriptor.value = function (...args) {
        let retornoMetodo = metodoOriginal.apply(this, args);
        if (typeof retornoMetodo === 'string') {
            retornoMetodo = retornoMetodo.replace(/<script>[\s\S]*?<\/script>/, '');
        }
        return retornoMetodo;
    };
}
//# sourceMappingURL=escapar.js.map
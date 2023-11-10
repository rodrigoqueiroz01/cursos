export function escape(target, propertyKey, descriptor) {
    const metodoOriginal = descriptor.value;
    descriptor.value = function (...args) {
        let retornoMetodo = metodoOriginal.apply(this, args);
        if (typeof retornoMetodo === 'string') {
            console.log(`@escape em ação na classe ${this.constructor.name} para o método ${propertyKey}`);
            retornoMetodo = retornoMetodo.replace(/<script>[\s\S]*?<\/script>/, '');
        }
        return retornoMetodo;
    };
}

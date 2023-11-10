export function escapar(target: any, propertyKey: string, descriptor: PropertyDescriptor) {
    const metodoOriginal = descriptor.value;

    descriptor.value = function (...args: any[]) {
        let retornoMetodo = metodoOriginal.apply(this, args);
        if (typeof retornoMetodo === 'string') {
            // console.log(`@escape em ação na classe ${this.constructor.name} para o método ${propertyKey.toUpperCase()}`)
            retornoMetodo = retornoMetodo.replace(/<script>[\s\S]*?<\/script>/, '');
        }

        return retornoMetodo;
    }
}
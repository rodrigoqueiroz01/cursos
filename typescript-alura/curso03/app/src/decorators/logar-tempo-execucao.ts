export function logarTempoExecucao() {

    return function (target: any, propertyKey: string, descriptor: PropertyDescriptor) {
        const metodoOriginal = descriptor.value;
        descriptor.value = function (...args: any[]) {
            const t1 = performance.now();
            const retornoDoMetodo = metodoOriginal.apply(this, args);
            const t2 = performance.now();
            console.log(`[${propertyKey.toUpperCase()}], tempo de execução: ${(t2 - t1) / 100}`);
            retornoDoMetodo;
        }
        return descriptor;
    }

}
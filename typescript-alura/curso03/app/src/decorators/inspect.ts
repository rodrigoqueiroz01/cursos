export function inspect() {
    return function (target: any, propertyKey: string, descriptor: PropertyDescriptor) {
        const metodoOriginal = descriptor.value;
        descriptor.value = function (...args: any[]) {
            return metodoOriginal.apply(this, args);
        }
        return descriptor;
    }
}
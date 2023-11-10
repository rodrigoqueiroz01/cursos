export function inspect() {
    return function (target, propertyKey, descriptor) {
        const metodoOriginal = descriptor.value;
        descriptor.value = function (...args) {
            return metodoOriginal.apply(this, args);
        };
        return descriptor;
    };
}
//# sourceMappingURL=inspect.js.map
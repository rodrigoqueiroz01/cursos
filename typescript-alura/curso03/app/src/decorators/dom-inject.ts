export function domInject(selector: string) {
    return function (target: any, propertyKey: string) {
        let elemento: HTMLElement;

        const getter = function () {
            if (!elemento) {
                elemento = <HTMLElement>document.querySelector(selector);
            }

            return document.querySelector(selector);
        }

        Object.defineProperty(target, propertyKey, {
            get: getter
        });
    }
}
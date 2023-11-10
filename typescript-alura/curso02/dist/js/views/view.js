export class View {
    constructor(selector, escapar) {
        this.escapar = false;
        const element = document.querySelector(selector);
        if (element) {
            this.element = element;
        }
        else {
            throw Error(`Seletor ${selector} não existe no DOM, verifique!`);
        }
        if (escapar)
            this.escapar = escapar;
    }
    update(model) {
        if (this.escapar)
            this.template(model).replace(/<script>[\s\S]*?<\/script>/, '');
        this.element.innerHTML = this.template(model);
    }
}

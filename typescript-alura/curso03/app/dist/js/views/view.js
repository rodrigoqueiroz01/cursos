export class View {
    constructor(selector) {
        const element = document.querySelector(selector);
        if (element) {
            this.element = element;
        }
        else {
            throw Error(`Seletor ${selector} não existe no DOM, verifique!`);
        }
    }
    update(model) {
        this.element.innerHTML = this.template(model);
    }
}
//# sourceMappingURL=view.js.map
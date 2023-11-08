export abstract class View<T> {

    protected element: HTMLElement;
    private escapar = false;

    constructor(selector: string, escapar?: boolean) {
        this.element = document.querySelector(selector);
        if (escapar) this.escapar = escapar;
    }

    public update(model: T): void {
        if (this.escapar) this.template(model).replace(/<script>[\s\S]*?<\/script>/, '');
        this.element.innerHTML = this.template(model);
    }

    protected abstract template(model: T): string;

}
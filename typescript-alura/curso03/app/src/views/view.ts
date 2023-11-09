import {logarTempoExecucao} from "../decorators/logar-tempo-execucao.js";
import {inspect} from "../decorators/inspect.js";

export abstract class View<T> {

    protected element: HTMLElement;
    private escapar = false;

    constructor(selector: string, escapar?: boolean) {
        const element = document.querySelector(selector);
        if (element) {
            this.element = element as HTMLElement;
        } else {
            throw Error(`Seletor ${selector} não existe no DOM, verifique!`);
        }
        if (escapar) this.escapar = escapar;
    }

    @inspect()
    @logarTempoExecucao(true)
    public update(model: T): void {
        if (this.escapar) this.template(model).replace(/<script>[\s\S]*?<\/script>/, '');
        this.element.innerHTML = this.template(model);
    }

    protected abstract template(model: T): string;

}
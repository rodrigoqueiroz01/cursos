import {logarTempoExecucao} from "../decorators/logar-tempo-execucao.js";
import {inspect} from "../decorators/inspect.js";

export abstract class View<T> {

    protected element: HTMLElement;

    constructor(selector: string) {
        const element = document.querySelector(selector);
        if (element) {
            this.element = element as HTMLElement;
        } else {
            throw Error(`Seletor ${selector} não existe no DOM, verifique!`);
        }
    }

    @inspect()
    @logarTempoExecucao(true)
    public update(model: T): void {
        this.element.innerHTML = this.template(model);
    }

    protected abstract template(model: T): string;

}
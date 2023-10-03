import {Component, OnInit} from '@angular/core';
import {Product} from "../product.model";
import {ProductService} from "../product.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
    selector: 'app-product-delete',
    templateUrl: './product-delete.component.html',
    styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

    product: Product = {
        name: '',
        price: null!
    }

    constructor(private productService: ProductService, private router: Router, private route: ActivatedRoute) {
    }

    ngOnInit(): void {
        const id: string | null = this.route.snapshot.paramMap.get('id')

        if (id !== null) {
            const idNumber: number = parseInt(id, 10);
            this.productService.readById(idNumber).subscribe(product => {
                this.product = product
            })
        }
    }

    deleteProduct(): void {
        if (this.product.id !== undefined) {
            this.productService.delete(this.product.id).subscribe(() => {
                this.productService.showMessage('Produto excluído com sucesso!')
                this.router.navigate(['/products'])
            })
        }
    }

    cancel(): void {
        this.router.navigate(['/products'])
    }

}

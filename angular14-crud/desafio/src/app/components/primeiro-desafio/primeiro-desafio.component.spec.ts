import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimeiroDesafioComponent } from './primeiro-desafio.component';

describe('PrimeiroDesafioComponent', () => {
  let component: PrimeiroDesafioComponent;
  let fixture: ComponentFixture<PrimeiroDesafioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimeiroDesafioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimeiroDesafioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateSactionLetterComponent } from './generate-saction-letter.component';

describe('GenerateSactionLetterComponent', () => {
  let component: GenerateSactionLetterComponent;
  let fixture: ComponentFixture<GenerateSactionLetterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GenerateSactionLetterComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GenerateSactionLetterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

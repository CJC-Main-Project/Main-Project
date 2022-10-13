import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerateSanctionLetterComponent } from './generate-sanction-letter.component';

describe('GenerateSanctionLetterComponent', () => {
  let component: GenerateSanctionLetterComponent;
  let fixture: ComponentFixture<GenerateSanctionLetterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GenerateSanctionLetterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GenerateSanctionLetterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

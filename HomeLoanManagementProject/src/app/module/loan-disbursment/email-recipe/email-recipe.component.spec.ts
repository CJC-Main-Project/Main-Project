import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmailRecipeComponent } from './email-recipe.component';

describe('EmailRecipeComponent', () => {
  let component: EmailRecipeComponent;
  let fixture: ComponentFixture<EmailRecipeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmailRecipeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmailRecipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmailGenerateComponent } from './email-generate.component';

describe('EmailGenerateComponent', () => {
  let component: EmailGenerateComponent;
  let fixture: ComponentFixture<EmailGenerateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmailGenerateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmailGenerateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BattlersComponent } from './battlers.component';

describe('BattlersComponent', () => {
  let component: BattlersComponent;
  let fixture: ComponentFixture<BattlersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BattlersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BattlersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { MicroResponseService } from './micro-response.service';

describe('MicroResponseService', () => {
  let service: MicroResponseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MicroResponseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

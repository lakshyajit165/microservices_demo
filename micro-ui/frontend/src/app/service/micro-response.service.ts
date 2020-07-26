import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MicroResponseService {

  private baseUrl: string = 'http://localhost:8080/';
  constructor(
    private http: HttpClient
  ) { }

  getPricing(): Observable<object> {
    return this.http.get(`${this.baseUrl}`+`pricing-service/api/v1/pricing`);
  }

  getPricingDefault(): Observable<object> {
    return this.http.get(`${this.baseUrl}`+`pricing-service/api/v1/`);
  }

  getDashBoard(): Observable<object> {
    return this.http.get(`${this.baseUrl}`+`dashboard-service/api/v1/details`);
  }

  getDashBoardDefault(): Observable<object> {
    return this.http.get(`${this.baseUrl}`+`dashboard-service/api/v1/`);
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  baseUrl: any = 'localhost:4200/';

  get(url: any) {
    this.http.get(this.baseUrl + url);
  }

  post(url: any, data: any) {
    this.http.post(this.baseUrl + url, data);
  }
}

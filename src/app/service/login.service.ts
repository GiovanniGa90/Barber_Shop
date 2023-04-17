import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {


  constructor() { }

 remove(){
    return localStorage.removeItem('user');
  }

}

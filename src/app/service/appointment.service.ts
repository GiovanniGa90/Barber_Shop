import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Appuntamento } from '../model/appuntamento';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {


  constructor(private http : HttpClient) {

  }

  salvaAppuntamento (appuntamento: Partial<Appuntamento>){

    return this.http.post<Appuntamento>("http://localhost:8085/api/v1/employee/save/appointment",appuntamento);
  }
}

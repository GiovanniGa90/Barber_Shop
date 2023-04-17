import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Appuntamento } from 'src/app/model/appuntamento';
import { AppointmentService } from 'src/app/service/appointment.service';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-prenota',
  templateUrl: './prenota.component.html',
  styleUrls: ['./prenota.component.scss']
})
export class PrenotaComponent implements OnInit {

  isReadMore = true;
  isReadMore2 = true;
  isReadMore3 = true;
  day: string;
  user:  string | undefined;



  showText(){
    this.isReadMore = !this.isReadMore
  }

  showText2(){
    this.isReadMore2 = !this.isReadMore2
  }
  showText3(){
    this.isReadMore3 = !this.isReadMore3
  }

  constructor(private appServ:AppointmentService, private router: Router, private loginservice: LoginService ) {

 this.day = "Siamo chiusi";

 if(localStorage.getItem("user")) {
  let userLogged: any = localStorage.getItem("user");
  this.user = JSON.parse(userLogged);
  console.log(this.user);
  }
}

  ngOnInit(): void {

    switch (new Date().getDay()) {
      case 0: //Domenica
        this.day = "Siamo chiusi";
        break;
      case 1: //Lunedi
        this.day = "Siamo chiusi";
        break;
      case 2://Martedi
        this.day = "Siamo aperti dalle 8:00 alle 19:00";
        break;
      case 3://Mercoledi
        this.day = "Siamo aperti dalle 8:00 alle 19:00";
        break;
      case 4://Giovedi
        this.day = "Siamo aperti dalle 8:00 alle 19:00";
        break;
      case 5: //Venerdi
        this.day = "Siamo aperti dalle 8:00 alle 19:00";
        break;
      case  6: //Sabato
        this.day = "Siamo aperti dalle 8:00 alle 19:00";
    }

   }

   creaAppuntamento(form:NgForm) {

    let appuntamento: Partial<Appuntamento> = {
      email: this.user,
      date: form.value.date,
      time: form.value.time,
      phoneNumber: form.value.phoneNumber

    }

    console.log(appuntamento);

    this.appServ.salvaAppuntamento(appuntamento).subscribe((res:any) =>
    {
      console.log("messaggio salvato");
    })

   }
   logout(event:MouseEvent){

    event.preventDefault();

    this.loginservice.remove
    localStorage.removeItem('user')
    this.router.navigateByUrl('/login');

   }



}



// if(localStorage.getItem("user")) {
//   let userLogged: any = localStorage.getItem("user");
//   this.user = JSON.parse(userLogged);
//   console.log(this.user);
//   }

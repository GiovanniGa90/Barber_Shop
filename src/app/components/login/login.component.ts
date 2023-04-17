import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  email: string ="";
  password: string ="";


  constructor(private router: Router,private http: HttpClient, private loginservice: LoginService) {}



  Login() {
    console.log(this.email);


    let bodyData = {
      email: this.email,
      password: this.password,
    };

        this.http.post("http://localhost:8085/api/v1/employee/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);

        if (resultData.message == "Email not exits")
        {

          alert("Email not exits");


        }
        else if(resultData.message == "Login Success")

         {
          localStorage.setItem('user', JSON.stringify(bodyData.email))
          this.router.navigateByUrl('/prenota');


        }
        else
        {
          alert("Incorrect Email and Password not match");
        }

      });

    }



}

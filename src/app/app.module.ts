import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './components/homepage/home/homepage.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from './components/footer/footer.component';
import { ServiziComponent } from './components/servizi/servizi.component';
import { ChiSiamoComponent } from './components/chi-siamo/chi-siamo.component';
import { ContattiComponent } from './components/contatti/contatti.component';
import { PrenotaComponent } from './components/prenota/prenota.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';


// import { InterceptorInterceptor } from './interceptors/interceptor.interceptor';

// import { AuthInterceptor } from './interceptors/auth.interceptors';







@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    NavbarComponent,
    FooterComponent,
    ServiziComponent,
    HomepageComponent,
    ChiSiamoComponent,
    ContattiComponent,
    PrenotaComponent,
    LoginComponent,
    RegisterComponent,



  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [
    // {
    //   provide: HTTP_INTERCEPTORS,
    //   useClass: InterceptorInterceptor,
    //    multi: true
    // }
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }

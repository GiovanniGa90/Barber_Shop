import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChiSiamoComponent } from './components/chi-siamo/chi-siamo.component';
import { ContattiComponent } from './components/contatti/contatti.component';
import { HomepageComponent } from './components/homepage/home/homepage.component';
import { LoginComponent } from './components/login/login.component';

import { PrenotaComponent } from './components/prenota/prenota.component';
import { RegisterComponent } from './components/register/register.component';

import { ServiziComponent } from './components/servizi/servizi.component';




const routes: Routes = [
  {
    path: '',
    component: HomepageComponent
  },
  {
    path: "servizi",
    component: ServiziComponent
  },
  {
    path: "chiSiamo",
    component: ChiSiamoComponent
  },
  {
    path: "contatti",
    component: ContattiComponent
  },
  {
    path: "prenota",
    component: PrenotaComponent
  },
  {
    path: "login",
    component: LoginComponent
  },
  {
    path: "register",
    component: RegisterComponent
  },



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

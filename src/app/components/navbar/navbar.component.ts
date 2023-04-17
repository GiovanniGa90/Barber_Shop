import { ChangeDetectionStrategy, Component, HostListener, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class NavbarComponent implements OnInit {

isScrolled = false;

@HostListener("window:scroll")
scrollEvent() {
  window.pageYOffset >= 80 ? (this.isScrolled = true) : (this.isScrolled = false);
}



  constructor() { }

  ngOnInit(): void {
  }

}

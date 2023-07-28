import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  template: `
    <div class="home-container">
      <h2 id="welcome-message">Welcome to the Home Page!</h2>
      <button id="logout-button" (click)="logout()">Logout</button>
    </div>
  `,
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  public constructor(private router:Router){}
  logout() {
    console.log('Logged out successfully.');
    this.router.navigate(["/"]);
  }
}

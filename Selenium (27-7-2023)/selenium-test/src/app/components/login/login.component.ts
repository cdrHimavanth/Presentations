import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  message="";

  constructor(private formBuilder: FormBuilder,private router: Router) {}

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  get f() {
    return this.loginForm.controls;
  }

  onSubmit() {
    if (this.loginForm.invalid) {
      this.message="Bad cedentials!";
      return;
    }
    this.message="success ,redirecting to home in 5 sec!";

    // Add login logic here (e.g., API call for authentication)
    // For the basic example, we will just print the form values to the console.
    console.log('Login Form Values:', this.loginForm.value);
    setTimeout(()=>{this.router.navigate(["/home"])},5000)
  }
}

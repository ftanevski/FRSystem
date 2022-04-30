import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  credentials: any = { username: '', password: '' };

  constructor(private formBuilder: FormBuilder) {
    this.loginForm = formBuilder.group({
      username: '',
      password: ''
    })
  }


  login(value: any) {
    console.log(value);
  }

  onSubmit() {
    this.credentials = this.loginForm.controls['username'].value
    console.log(this.credentials);
  }

  ngOnInit(): void {
  }

}

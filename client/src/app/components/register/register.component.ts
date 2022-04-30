import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  userRegisterInfo: any = { email: '', username: '', password: '', confirmPassword: '' };

  constructor() { }

  ngOnInit(): void {
  }

  register(value: any) {
    console.log(value);

  }

}

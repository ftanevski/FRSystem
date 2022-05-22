import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  @ViewChild('form') registerForm: NgForm;

  constructor() {}

  onSubmit(form: NgForm) {
    console.log(this.registerForm.value);
  }

  ngOnInit(): void {
  }

}

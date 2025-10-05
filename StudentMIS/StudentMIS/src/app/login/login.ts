import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  standalone: true,
  templateUrl: './login.html',
  styleUrls: ['./login.css']
})


export class Login {
  login(form: NgForm) {
    console.log(form.value);

    const output = `Email: ${form.value.email} <br> Password: ${form.value.password}`;
    document.getElementById('output')!.innerHTML = output;
  }
}

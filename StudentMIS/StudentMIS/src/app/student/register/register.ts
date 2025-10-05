import { Component } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { userService } from '../../service/user';
import { Router } from '@angular/router';


@Component({
  selector: 'app-register',
  imports: [FormsModule],
  standalone: true,
  templateUrl: './register.html',
  styleUrls: ['./register.css']
})
export class Register {

  constructor(private userService: userService, private route: Router) {}

  register(userData: any){
    console.log("Register function called");
    this.userService.addUser(userData.value).subscribe(
      (resp: any)=>{
        console.log(resp);
        alert("Data Added Successfully....!");
        this.route.navigate(['/']);
      },

      (err: unknown)=>{
        console.log(err);
        // alert("Something went wrong...!");
      }
    );
  }
}

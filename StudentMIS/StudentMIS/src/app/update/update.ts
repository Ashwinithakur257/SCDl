import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { userService } from '../service/user';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  imports: [FormsModule],
  standalone: true,
  templateUrl: './update.html',
  styleUrls: ['./update.css']
})
export class Update {
  
  constructor(private userService: userService, private route: Router, private router: ActivatedRoute) {}
  
  uid:any;
  userResponse:any;

  ngOnInit() {
    this.userService.getUserById(this.router.snapshot.params[`uid`]).subscribe(
      (response: any)=>{
        console.log(response);
        this.userResponse=response;
        this.uid=this.router.snapshot.params[`uid`];
      },
      (error: unknown)=>{
        console.log(error);
        // alert("Something went wrong...!");
      }
    );
  }

  public update(updateData: NgForm) {
    console.log(updateData);
    this.userService.update(this.uid, updateData.value).subscribe(
      (response: any) => {
        console.log(updateData.value);
        alert("User updated successfully");
        this.route.navigate(['/']);
      },
      (error: unknown) => {
        console.log(error);
        location.reload();
        // alert("Something went wrong...!");
      }
    );
  }

}

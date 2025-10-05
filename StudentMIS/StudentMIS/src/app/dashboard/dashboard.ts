import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { userService } from '../service/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  imports: [NgFor],
  standalone: true,
  templateUrl: './dashboard.html',
  styleUrls: ['./dashboard.css']
})

export class Dashboard {

  userData: any

  constructor(private service: userService, private router: Router) {}

  ngOnInit() {
    this.userList();
  }

  public userList() {
    this.service.getUser().subscribe(
      (response: any) => {
        this.userData = response;
        console.log(response);
      },
      (err: unknown) => {
        console.log(err);
        // alert("Something went wrong...!");
      }
    );
  }

  public delete(uid: any) {
    if (window.confirm("Are you sure to delete this record?")) {
      this.service.delete(uid).subscribe(
        (response: any) => {
          window.alert("Data Deleted Successfully...!");
          console.log(response);
        },
        (err: unknown) => {
          console.log(err);
          window.location.reload();
          // alert("Something went wrong...!");
        }
      );
    }
  }
  
  public update(uid: any) {
    this.router.navigate([`/update/${uid}`]);
  }

  public view(uid: any) {
    this.router.navigate([`/view/${uid}`]); 
  }
  
}

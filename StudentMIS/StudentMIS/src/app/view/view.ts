import { Component } from '@angular/core';
import { userService } from '../service/user';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-view',
  imports: [FormsModule, NgIf],
  standalone: true,
  templateUrl: './view.html',
  styleUrls: ['./view.css']
})
export class View {

  constructor(private userService: userService, private router: Router, private route: ActivatedRoute) {}

  uid: string | number | undefined;
  userResponse: any;

  ngOnInit() {
    this.uid = this.route.snapshot.params['uid'];
    this.userService.getUserById(this.uid).subscribe(
      (response: any) => {
        this.userResponse = response;
        console.log(response);
      },
      (error: unknown) => {
        console.error(error);
      }
    );
  }

  goBack() {
    this.router.navigate(['/dashboard']);
  }

}

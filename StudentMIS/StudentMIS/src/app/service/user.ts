import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class userService {
  baseUrl:any="http://localhost:8080/user/api"
  constructor(private http:HttpClient) {
  }
  public addUser(userData: any) {
    return this.http.post(this.baseUrl+"/register",userData);
  }

  public getUser() {
    return this.http.get(this.baseUrl+"/list")
  }

  public delete(uid:any) {
    return this.http.delete(this.baseUrl+"/delete/"+uid);
  }

  public getUserById(uid:any) {
    return this.http.get(this.baseUrl+`/get/${uid}`);
  }

  public update(uid:any, userData:any) {
    return this.http.put(this.baseUrl+"/update/"+uid, userData);
  }

  public view(uid:any) {
    return this.http.get(this.baseUrl+"/view/"+uid);
  }

}

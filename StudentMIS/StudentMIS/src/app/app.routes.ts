import { Routes } from '@angular/router';
import { Register } from './student/register/register';
import { Login } from './login/login';
import { Dashboard } from './dashboard/dashboard';
import { Update } from './update/update';
import { View } from './view/view';

export const routes: Routes = [
    { path: 'register', component: Register },
    { path: 'login', component: Login },
    { path: 'dashboard', component: Dashboard },
    { path: 'update/:uid', component: Update },
    { path: 'view/:uid', component: View },
];

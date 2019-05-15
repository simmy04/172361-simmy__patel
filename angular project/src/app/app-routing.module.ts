import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { SearchCustomersComponent } from './search-customers/search-customers.component';
import { SellerComponent } from './seller/seller.component';
import { HomeComponent } from './home/home.component';
import { SellerloginComponent } from './sellerlogin/sellerlogin.component';
import { SellersignupComponent } from './sellersignup/sellersignup.component';
import { SellerhomeComponent } from './sellerhome/sellerhome.component';

const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'customer', component: CustomersListComponent },
    { path: 'add', component: CreateCustomerComponent },
    { path: 'blogin', component: SearchCustomersComponent },
    { path: 'seller', component: SellerComponent},
    { path: 'home', component: HomeComponent},
    { path: 'slogin', component: SellerloginComponent},
    { path: 'ssignup', component: SellersignupComponent},
    { path: 'shome', component: SellerhomeComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }

import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { Router } from '../../../node_modules/@angular/router';
import { SellerInfo } from '../sellerinfo';

@Component({
  selector: 'customers-list',
  templateUrl: './customers-list.component.html',
  styleUrls: ['./customers-list.component.css']
})
export class CustomersListComponent implements OnInit {

  customers: Observable<Customer[]>;

  constructor(private customerService: CustomerService,private router:Router) {

   }

 currentUser:any;


  ngOnInit() {
    
    this.reloadData();
  }

  deleteCustomers() {
    this.customerService.deleteAll()
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log('ERROR: ' + error));
  }

  reloadData() {
    this.customerService.getCustomersList().subscribe((response)=>{
      console.log(response);
      this.customers=response;
    });
    
  }
  seller(){
    this.router.navigateByUrl('seller');
  }
  logout(){
    this.router.navigateByUrl('home');
  }
}

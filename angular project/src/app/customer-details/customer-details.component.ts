import { Component, OnInit, Input } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { SellerInfo } from '../sellerinfo';

import { CustomersListComponent } from '../customers-list/customers-list.component';
import { Router } from '../../../node_modules/@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Rating } from '../rating';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.css']
})
export class CustomerDetailsComponent implements OnInit {

  @Input() customer: SellerInfo;

  cPOst:FormGroup;
rating:Rating=new Rating();
cseller:any;
  cname:any;
  dummy:any;
  constructor(private fb:FormBuilder,private customerService: CustomerService, private listComponent: CustomersListComponent,private router:Router) { }

  ngOnInit() {
    this.cseller=this.customerService.currentuser;
    
    this.cPOst=this.fb.group({
            rating:['',Validators.required]
    })

  }

  // updateActive(isActive: boolean) {
  //   this.customerService.updateCustomer(this.customer.id,
  //     { name: this.customer.name, age: this.customer.age, active: isActive })
  //     .subscribe(
  //       data => {
  //         console.log(data);
  //         this.customer = data as Customer;
  //       },
  //       error => console.log(error));
  // }

  accept() {
   console.log(this.cseller);
    this.cname=this.cseller.name;
    console.log(this.cname);
    this.rating.bname=this.cname;
   this.rating.title=this.customer.title;
   this.rating.sname=this.customer.sname;
   console.log(this.rating.sname+" "+this.customer.title+" "+this.rating.rating);
   this.customerService.createBuyerInfo(this.rating);
   
    this.customerService.deleteCustomer(this.customer.oid)
      .subscribe(
        data => {
         console.log(data);
         this.listComponent.reloadData();
       },
        error => console.log(error));
  }
  logout()
{
  this.router.navigateByUrl("home");
}
}

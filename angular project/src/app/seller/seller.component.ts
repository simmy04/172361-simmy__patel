import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { SellerInfo } from '../sellerinfo';
import { FormGroup,FormBuilder,  Validators  } from '../../../node_modules/@angular/forms';
import { Router } from '../../../node_modules/@angular/router';
@Component({
  selector: 'app-seller',
  templateUrl: './seller.component.html',
  styleUrls: ['./seller.component.css']
})
export class SellerComponent implements OnInit {
  name=false;
  cseller:any;
  cname:any;
  sellers: SellerInfo=new SellerInfo();
  submitted=false;
  constructor(private fb: FormBuilder,private customerService: CustomerService,private router:Router) { }
  sellerForm:FormGroup
  ngOnInit() {
    this.cseller=this.customerService.currentseller;
    this.sellerForm=this.fb.group(
      {
      
       
        title:['',[ Validators.required] ],
        desc:['',[Validators.required]]
      
      })
  }
  private addfood(){
    
    console.log(this.sellers)
    this.cname=this.cseller.name;
    this.sellers.sname=this.cname;
    console.log(this.cname+"hiii");
    this.customerService.createSellerItem(this.sellers)
    .subscribe(data => console.log(data), error => console.log(error));
  this.sellers = new SellerInfo();
  }

  
  onSubmit() {

    console.log("in submit")
    
    this.addfood();
    this.router.navigateByUrl('customer');
  }
 
}

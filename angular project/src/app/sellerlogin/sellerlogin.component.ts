import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sellerlogin',
  templateUrl: './sellerlogin.component.html',
  styleUrls: ['./sellerlogin.component.css']
})
export class SellerloginComponent implements OnInit {
  name=false;
  customers: Customer=new Customer();
  submitted=false;
  loginForm: FormGroup;
  info:any;
  constructor(private dataService: CustomerService,private router:Router,private fb:FormBuilder) { }

  ngOnInit() {
    this.loginForm = this.fb.group({
      uname:['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      pass:['',[ Validators.required,Validators.maxLength(10),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')]
     ]
    });
  }
  cust(){
    this.submitted=false;
    this.customers=new Customer();
  }
  private searchCustomers() {
    this.info= this.dataService.getSellerValid(this.customers)
    
      
          if(this.info!=null){
            this.router.navigateByUrl('shome');
          }
          else
          {
            console.log('login failed');
          }
    
  }

  onSubmit() {
    console.log("in submit")
    this.submitted=true;
    this.searchCustomers();
  }
  signup(){
    this.router.navigateByUrl('ssignup');
  }
}

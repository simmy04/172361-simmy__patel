import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '../../../node_modules/@angular/router';
import { CustomerLogin } from '../customerlogin';

@Component({
  selector: 'search-customers',
  templateUrl: './search-customers.component.html',
  styleUrls: ['./search-customers.component.css']
})
export class SearchCustomersComponent implements OnInit {

  name=false;
  customers: CustomerLogin=new CustomerLogin();
  submitted=false;
  info:any;
  loginForm: FormGroup;
  
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
    this.customers=new CustomerLogin();
  }

  private searchCustomers() {
   
   this.info= this.dataService.getCustomersByAge(this.customers)
   
   console.log("in login valid"+this.info)
          if(this.info!=null){
            
            this.router.navigateByUrl('customer');
          }
          else
          {
            console.log("login failed")
          }
  }

  onSubmit() {
    console.log("in submit")
    this.submitted=true;
    this.searchCustomers();
  }
  signup(){
    this.router.navigateByUrl('add');
  }
}
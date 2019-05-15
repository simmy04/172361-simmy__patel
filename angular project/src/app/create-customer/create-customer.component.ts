import { Component, OnInit } from '@angular/core';

import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { Router } from '../../../node_modules/@angular/router';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customer: Customer = new Customer();
  submitted = false;
  regForm: FormGroup;
  constructor(private customerService: CustomerService,private router : Router,private fb:FormBuilder) { }

  ngOnInit() 
  {
    this.regForm = this.fb.group({
      name: ['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      email: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
      uname:['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      pass:['',[ Validators.required,Validators.maxLength(10),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')]
     ]
    });
    
  }
  

  newCustomer(): void {
    this.router.navigateByUrl('blogin');
  }

  save() {
    this.customerService.createCustomer(this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
    this.customer = new Customer();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  
  }
}

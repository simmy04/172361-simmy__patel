import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { Router } from '@angular/router';
import { SellerLogin } from '../sellerlogin';

@Component({
  selector: 'app-sellersignup',
  templateUrl: './sellersignup.component.html',
  styleUrls: ['./sellersignup.component.css']
})
export class SellersignupComponent implements OnInit {
  customer:  SellerLogin= new SellerLogin();
  submitted = false;
  regForm: FormGroup;
  constructor(private customerService: CustomerService,private router : Router,private fb:FormBuilder) { }

  ngOnInit() {
    this.regForm = this.fb.group({
      name: ['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      email: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
      uname:['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      pass:['',[ Validators.required,Validators.maxLength(10),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')]
     ]
    });
  }
  newCustomer(): void {
    this.router.navigateByUrl('slogin');
  }
  save() {
    this.customerService.createSeller(this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
    this.customer = new Customer();
  }
  onSubmit() {
    this.submitted = true;
    this.save();
  
  }
}

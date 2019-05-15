import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { Observable } from 'rxjs';
import { Rating } from '../rating';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sellerhome',
  templateUrl: './sellerhome.component.html',
  styleUrls: ['./sellerhome.component.css']
})
export class SellerhomeComponent implements OnInit {
  customers: Observable<Rating[]>;
  constructor(private customerService: CustomerService,private router:Router) { }

  ngOnInit() {
    this.customerService.getBuyerList().subscribe((response)=>{
      console.log(response);
      this.customers=response;
    });
  }
accept(){
  this.router.navigateByUrl('seller');
}
logout()
{
  this.router.navigateByUrl("home");
}
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private baseUrl = 'http://localhost:8886';
  currentuser:any;
  currentseller:any;
  constructor(private http: HttpClient) { }

  getCustomer(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createCustomer(customer: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/buyerinfo/addbuyer`, customer);
  }

  createSellerItem(seller: Object): Observable<Object> {
    console.log(seller)
    return this.http.post(`${this.baseUrl}` + `/sellerinfo/selleradd`, seller);
  }
  createSeller(customer: Object): Observable<Object> {
    console.log(customer)
    return this.http.post(`${this.baseUrl}` + `/sellerdata/addseller`, customer);
  }
 createBuyerInfo(rating: Object): Observable<Object> {
   console.log("in service")
   console.log(rating)
   
     this.http.post(`${this.baseUrl}`+`/buyerdata/buyersdata`,rating).subscribe((res)=>{

     });

     return 
  }
 
  updateCustomer(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteCustomer(id: String): Observable<any> {
    return this.http.delete(`${this.baseUrl}/sellerinfo/deletebuyer/${id}`, { responseType: 'text' });
  }

  getCustomersList(): Observable<any> {
    return this.http.get(`${this.baseUrl}/sellerinfo/getsellers`);
  }
  getBuyerList(): Observable<any> {
    return this.http.get(`${this.baseUrl}/buyerdata/getbuyersdata`);
  }s
  getCustomersByAge(customer:Object): Observable<any> {
    console.log(customer)
    console.log(`${this.baseUrl}`+`/valid`)
    this.http.post(`${this.baseUrl}`+`/buyerinfo/validatebuyer`,customer).subscribe((response)=>{
      this.currentuser=response;
    })

    return this.currentuser;
  }
  getSellerValid(customer:Object): Observable<any> {
    console.log(customer)
    console.log(`${this.baseUrl}`+`/sellerdata/validateseller`)
     this.http.post(`${this.baseUrl}`+`/sellerdata/validateseller`,customer).subscribe((response)=>{
      this.currentseller=response;
    })
    
    return this.currentseller;
  }

  deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }

}

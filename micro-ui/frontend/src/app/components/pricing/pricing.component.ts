import { Component, OnInit } from '@angular/core';
import { MicroResponseService } from 'src/app/service/micro-response.service';

@Component({
  selector: 'app-pricing',
  templateUrl: './pricing.component.html',
  styleUrls: ['./pricing.component.css']
})
export class PricingComponent implements OnInit {

  

  result: string;
  res: string = 'res';
  constructor(
    private service: MicroResponseService
  ) { }

  ngOnInit(): void {
   this.service.getPricing().subscribe(res => {
     this.result = res[this.res];
   });

  //  this.service.getPricingDefault().subscribe(res => {
  //    console.log(res);
  //  })
  }

}

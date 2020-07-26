import { Component, OnInit } from '@angular/core';
import { MicroResponseService } from '../../service/micro-response.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  result: string;
  res: string = 'res';
  constructor(
    private service: MicroResponseService
  ) { }

  ngOnInit(): void {
   this.service.getDashBoard().subscribe(res => {
    //  console.log(res);
    this.result = res[this.res];
   });

  //  this.service.getDashBoardDefault().subscribe(res => {
  //    console.log(res);
  //  })
  }

}

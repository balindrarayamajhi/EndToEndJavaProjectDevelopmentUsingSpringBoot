import { Injectable } from '@angular/core';
import { HttpClient,HttpResponse } from '@angular/common/http';
import {map} from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient)  { }

  public getReservation(id:number):Observable<any>{
    return this.http.get("https://localhost:9001/flightreservation/reservations/"+id)
    .map(response=>response.JSON())
  }
}

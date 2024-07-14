import { Component } from '@angular/core';

interface Doctor {
  name: string;
  specialization: string;
  experience: number;
}

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent {
  searchText: string = '';
  doctors: Doctor[] = [
    { name: 'Dr. Anusha', specialization: 'Cardiology', experience: 2 },
    { name: 'Dr. Sravani', specialization: 'Neurology', experience: 10 },
    { name: 'Dr. Bhavana', specialization: 'Gynacologist', experience: 20 }
  ];
}

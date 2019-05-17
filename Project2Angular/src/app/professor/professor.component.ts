import { Component, OnInit } from '@angular/core';
import { ProfessorService } from 'src/app/professor.service';
import { Professor } from 'src/app/professor';

@Component({
  selector: 'app-professor',
  templateUrl: './professor.component.html',
  styleUrls: ['./professor.component.css']
})
export class ProfessorComponent implements OnInit {

  availableProfessors= [];

  professorModel = new Professor(0,"name",0,"username","password","email",0);

  constructor(private professor: ProfessorService) { }
  ngOnInit() {
    this.listProfessors();
  }

  listProfessors(){
    this.professor.getProfessors().subscribe(x => this.availableProfessors = JSON.parse(x));
  }

  addProfessor(){
    this.professor.addProfessor(this.professorModel).subscribe(x=>{});
    this.professorModel = new Professor(0,"",0,"","","",0);
  }

}
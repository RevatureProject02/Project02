import { Professor } from './professor';
import { Advisor } from './advisor';

export class Meeting {
    constructor(
        public id: number,
        public summary: string,
        public myDate: string,
        public time: string,
        public location: string,
        public professors: Professor[],
        public advisors: Advisor[]
        ){}
        
    }
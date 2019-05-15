import { Student } from './student';

describe('Student', () => {
  it('should create an instance', () => {
    expect(new Student(0,0,"","","")).toBeTruthy();
  });
});

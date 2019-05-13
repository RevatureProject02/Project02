import { Meeting } from './meeting';

describe('Meeting', () => {
  it('should create an instance', () => {
    expect(new Meeting(0,"","","","")).toBeTruthy();
  });
});

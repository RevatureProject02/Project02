import { Professor } from './professor';

describe('Professor', () => {
  it('should create an instance', () => {
    expect(new Professor(0,"",0,"","","","")).toBeTruthy();
  });
});

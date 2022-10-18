/*
  THI03-J: Compliant Code
   - Invokes wait() and await() methods inside a loop
*/

synchronized (object) {
  while (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}

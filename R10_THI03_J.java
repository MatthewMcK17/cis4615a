/*
  THI03-J: Noncomplaint Code
   - Always invoke wait() and await() methods inside a loop
*/

synchronized (object) {
  if (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}

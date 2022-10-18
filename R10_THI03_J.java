/*
  THI03-J: Noncomplain Code
   - Always invoke wait() and await() methods inside a loop (can cause DoS)
*/

synchronized (object) {
  if (<condition does not hold>) {
    object.wait();
  }
  // Proceed when condition holds
}

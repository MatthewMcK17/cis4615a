/* 
  IDS03-J: Noncompliant Code
   - Vulnerable to log injection
*/

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}

/*
  EXP00-J: Noncompliant Code
   - Ignores return values by methods
*/

public void deleteFile() {
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}

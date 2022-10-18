/*
  NUM03-J: Noncompliant Code
   - Using generic for reading integer data without considering its sign
*/

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}

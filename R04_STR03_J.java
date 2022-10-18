/*
  STR03-J: Noncompliant Code
   - Encodes noncharacter data as a string
*/


BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);

package udemy_pratice;


public class Test {
        public static void main(String args[]) {
//            Integer x = 5;
//
//            System.out.println(x.toString());
//            System.out.println(Integer.toString(12));

            String s = new String("Hello World   ");

            String s1 = new String();
            String str1 = s.substring(4,12);
            String str2 = s.trim();
            String str3 = s.toUpperCase();
            String str4 = s.toLowerCase();
            String str5 = s.concat("2021");
            String str6 = (new StringBuilder()).append(s).append(str5).toString();

            int leng = s.length();
            boolean f = str1.equalsIgnoreCase(str2);
            boolean t = s1.isEmpty() ;

           System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6);
           System.out.println(leng +"\n"+ t + "\n" + f);


        }
    }


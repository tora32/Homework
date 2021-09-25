public class Homework1 {
        public static void main(String[] args) {
            int a = 1;
            long b = 1_000_000L;
            float c = 1.55f;
            double d = 1.66;
            char e = 'e';
            String f = "hello!";
            boolean g = true;
            byte h = 127;
            int r = 10;
            short i = 32766;
            System.out.println(Homework1.calc(1.5f, 2,5,1));
            System.out.println(Homework1.SumBetween10and20(12, 4));
            Homework1.PosOrNeg(-4);
            System.out.println(Homework1.NegInt(-4));
            Homework1.Hello("Vasya");
            Homework1.LeapYear(1200);
        }

        public static double calc(float a, float b, float c, float d)
        {
            return (a*(b+(c/d)));
        }

        public static boolean SumBetween10and20 (int a, int b) {
            int c = a+b;
            if (c>=10 && c<=20)
            {
                System.out.println();
                return true;
            }
            else
            {
                return false;
            }
        }
        public static void PosOrNeg (int a)
        {
            if (a>=0)
            {
                System.out.println("a is positive");
            }
            else {
                System.out.println("a is negative");
            }
        }
        public static boolean NegInt (int a)
        {
            if (a<0) {return (true);}
            else {return (false);}
        }

        public static void Hello(String f) {
            System.out.println("Hello, "+f+"!");
        }

        public static void LeapYear(int a) {
            if (a%4 == 0)
            {
                if (a%100 == 0)
                {
                    if (a%400 == 0)
                    {
                        System.out.println("Year "+a+" is Leap");
                    }
                    else {
                        System.out.println("Year "+a+ " is not Leap");
                    }
                }
                else {
                    System.out.println("Year "+a+ " is Leap");
                }

            }
            else {System.out.println("Year "+a+"is not Leap");}
        }
    }


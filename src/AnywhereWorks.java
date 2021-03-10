class AnywhereWorks {

    public static void ConcattoString(String s1)
    {
        s1 = s1 + "Works";
    }
    public static void ConcattoStrBuilder(StringBuilder s2)
    {
        s2.append("Works");
    }
    public static void ConcattoStrBuffer(StringBuffer s3)
    {
        s3.append("Works");
    }

    public static void main(String[] args)
    {
        String s1 = "Anywhere";

        // s1 is not changed
        ConcattoString(s1);
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("Anywehere");

        // s2 is changed
        ConcattoStrBuilder(s2);
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("Anywehere");

        // s3 is changed
        ConcattoStrBuffer(s3);
        System.out.println("StringBuffer: " + s3);
        StringBuilder str3 = new StringBuilder("Hello!");
    }
}

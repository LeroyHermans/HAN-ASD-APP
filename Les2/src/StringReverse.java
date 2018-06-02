public class StringReverse {

    public void reverse(String n)
    {
        StringBuffer sb = new StringBuffer(n);
        System.out.println(this.privateReverse(sb.toString()));
    }

    private String privateReverse(String s)
    {
        if(null == s || s.length() == 0)
            return "";
        return privateReverse(s.substring(1))+ s.charAt(0);
    }
}

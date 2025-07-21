class Solution {
    public String makeFancyString(String s) {
        int prev = 0;
        int curr = 0;
        int c = 1;
        StringBuilder str = new StringBuilder(s);
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                c++;
            }
            else
            {
                c = 1;
            }

            if(c ==3)
            {
                str = str.deleteCharAt(i);
                c= 1;
                i = i-2;

            }
        }
        s = str.toString();
        return s;

    }
}
package com.juhnowski.q4;

public class StringCompression {
    public String compress(String input)
    { char[] cs =
            input.toCharArray();
        char temp = cs[0];
        int i = 0, j = 0, count = 0, len = cs.length;
        while(j < len)
        {
            cs[i++] = temp;

            while (j < len && temp == cs[j])
            {
                j++;
                count++;
            }

            if(j < len) temp = cs[j++];

            cs[i++] = String.valueOf(count).charAt(0);
            count = 1;
        }

        return new String(cs, 0, i);
    }

    public static void main(String[] args)
    {
        StringCompression compression = new StringCompression();
        System.out.println(compression.compress("aabbbccc"));
    }
}

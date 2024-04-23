// https://leetcode.com/problems/jewels-and-stones/
package Strings;

public class JewelsAndStones {
    public static void main(String[] args) {
        
    }
}

//! learning how to convert string to character array and vice versa

//! to convert string to charater array we use string.toCharArray()
//! to convert charater to string just use +"" with character it will convert to string 
class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int totalCount=0;

            for(char ch:stones.toCharArray()){
                if(jewels.contains(ch+"")) totalCount++;
            }

    

        return totalCount;
        
    }
}

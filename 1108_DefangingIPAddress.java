/* https://leetcode.com/problems/defanging-an-ip-address/

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]". */


class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        for(int i=0; i<address.length(); i++){
            char c=address.charAt(i);
            if(c == '.'){
                s = s + "["+"."+"]";
            }else {
                s = s + c;
            }
        }
        return s;
    }
}

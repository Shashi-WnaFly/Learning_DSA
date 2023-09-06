package Learning_DSA.String&Stringbuilder;
// Leetcode --> 1108. Defanging an IP Address
class DefangArr {
    public String defangIPaddr(String address) {
        String IP = address.replace(".", "[.]");
        return IP;
    }
}

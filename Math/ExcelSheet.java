// Leetcode --> 168. Excel Sheet Column Title
class ExcelSheet {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();

        while(columnNumber > 0){
            int r = columnNumber%26;
            if((columnNumber-26) == 0){
                title.append('Z');
                break;
            }
            else if(r == 0){
                title.append('Z');
                columnNumber -= 26;  
            }
            else title.append((char)(64 + r));
            
            columnNumber /= 26;
        }
        return title.reverse().toString();
    }
}

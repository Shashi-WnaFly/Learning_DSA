
// Leetcode --> 1678. Goal Parser Interpretation

class Goal {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder interpreted = new StringBuilder();

        for(int i = 0; i < n; i++){
            char c = command.charAt(i);

            if(c == '(' && command.charAt(i+1) == ')'){
                interpreted.append("o");
                i++;
            }

            else if(c == 'G') {
                interpreted.append('G');
            }

            else{
                interpreted.append("a").append("l");
                i += 3;
            } 
        }
        return interpreted.toString();
    }
}

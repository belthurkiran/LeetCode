public class ReversePolish {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> vals = new Stack<Integer>();
        int a =0;
        int b=0;
        for(int i=0;i<n;i++){
            String symbol = tokens[i];
            switch(symbol){
                case "+":
                    a = vals.pop();
                    b = vals.pop();
                    vals.push(b+a);
                    break;
                case "-":
                    a = vals.pop();
                    b = vals.pop();
                    vals.push(b-a);
                    break;
                case "*":
                    a = vals.pop();
                    b = vals.pop();
                    vals.push(b*a);
                    break;
                case "/":
                    a = vals.pop();
                    b = vals.pop();
                    vals.push(b/a);
                    break;
                default:
                    vals.push(Integer.valueOf(tokens[i]));
            }
        }
        return vals.pop();
    }
}

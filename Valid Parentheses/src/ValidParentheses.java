class Solution {
    public static boolean isValid(String s) {
        char[] characterArray=s.toCharArray();
        boolean isValid=true;

        for (int i=0;i<characterArray.length;i++){
            char openSymbol=characterArray[i];
            char closingSymbol='a';
            if (openSymbol=='('){
                closingSymbol=')';
            }

            if (openSymbol=='['){
                closingSymbol=']';
            }
            if (openSymbol=='{'){
                closingSymbol='}';
            }
            if (closingSymbol=='a'){
                break;
            }

//            for (int j=i+1;j<characterArray.length;j++){
//                if (closingSymbol!=characterArray.[j]){
//                    isValid=false;
//                    break;
//                }

            }

        return isValid;
    }

    }




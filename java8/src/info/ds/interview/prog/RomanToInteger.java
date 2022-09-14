package info.ds.interview.prog;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.print("final value is "+new RomanToInteger().romanToInt("MCMXCIV"));
	}
    public int romanToInt(String s) {
        char[] split = s.toCharArray();
        int f=0;
        System.out.println("size is "+split.length);
        for(int i=split.length-1; i>=0; i--){
            f = f + convertToInt(split[i]);
            if(split[i]=='I'){
                if((i+1)<split.length){ // wrong condition
                    if(split[i+1]=='V'){
                        f = f-2;
                    }
                    else if(split[i+1]=='X'){
                        f = f-2;
                    }
                }
            }
            if(split[i]=='X'){
                if((i+1)<split.length){
                    if(split[i+1]=='L'){
                        f = f-20;
                    }
                    else if(split[i+1]=='C'){
                        f = f-20;
                    }
                }
            }
            
            if(split[i]=='C'){
            	 if((i+1)<split.length){
                    if(split[i+1]=='D'){
                        f = f-200;
                    }
                    else if(split[i+1]=='M'){
                    	System.out.println("index "+(i)+" value is "+split[i]);
                        f = f-200;
                    }
                }
            }
            System.out.println("iteration value "+f+" input value "+split[i]);
        }
        return f;
        
    }
    
    public int convertToInt(char r){
        switch(r){
            case 'I': return 1;
                //break;
            case 'V': return 5;
                //break;
            case 'X': return 10;
                //break;
            case 'L': return 50;
                //break;
            case 'C': return 100;
                //break;
            case 'D': return 500;
                //break;
            case 'M': return 1000;
                //break;
                
        }
        return 0;
    }
}
package CSW_Sem_4.src.ExceptionHandling;

import java.util.HashSet;
import java.util.Set;

public class Q2_EH {
    public static void main(String[] args) {
        String s="as2ed3gfyter56gyui83f";
        try{
            if(s==null){
                throw new NullPointerException("String is null");
            }
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        Set<Character>stv=new HashSet<>();
        Set<Character>stc=new HashSet<>();
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20)
                stv.add((char)('a'+i));
            else
                stc.add((char)('a'+i));
        }
        String ans="";
        for(int i=2;i<s.length();i++){
            if(stv.contains(s.charAt(i-2)) && stc.contains(s.charAt(i-1)) && s.charAt(i)<='9' && s.charAt(i)>='0'){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}



package algorithms.graphs;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisCombination{

	public void dfs(List<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    } 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
	public List<String> getParenthesisList(int n) {
	    List<String> retList = new ArrayList<String>();
	    dfs(retList, "", n, n);
	    return retList;
	}
	public static void main (String[] args)
	{
		ParenthesisCombination obj = new ParenthesisCombination();
		System.out.println("Parenthesis Combination for 3 pairs: \n" );
		List<String> parenthesisList=obj.getParenthesisList(3);
		
		parenthesisList.forEach(parenthesisStr->System.out.println(parenthesisStr));
	}
}

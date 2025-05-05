public class IsSquare2{

public boolean isSquare(int num){
	if(num<0){
		return false;
		}
	int sqroot = (int)Math.sqrt(num);
	return sqroot * sqroot == num;
	}


}
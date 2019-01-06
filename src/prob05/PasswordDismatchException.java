package prob05;

public class PasswordDismatchException extends Exception {
	PasswordDismatchException(){
		super("비밀번호가틀렸습니다.");
	}
}

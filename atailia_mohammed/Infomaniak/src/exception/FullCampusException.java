package exception;

public class FullCampusException extends RuntimeException {

	public FullCampusException() {
		super();
	}

	public FullCampusException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public FullCampusException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FullCampusException(String arg0) {
		super(arg0);
	}

	public FullCampusException(Throwable arg0) {
		super(arg0);
	}

}

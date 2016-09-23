/**
 * Exception Chapter
 */
package day11;

/**
 *
 * I will collect all my exceptions
 *
 * @author zhanghongwei
 *
 */
public class MyException extends Exception
{

	/**
	 *
	 */
	public MyException()
	{
	}

	/**
	 * @param message
	 */
	public MyException(String message)
	{
		super(message);
	}

	/**
	 * @param cause
	 */
	public MyException(Throwable cause)
	{
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
